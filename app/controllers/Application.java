package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Attr;
import models.Country;
import models.DataPiece;
import models.MSA;
import models.Result;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {

		render();

	}

	public static void data_crawling_progress(String id) {
		System.out.println(id);
		// 查看抓取进度
		List<Result> results = new ArrayList<Result>();

		List<Country> counties = Country.findAll();
		int county_progress = 0;
		int total_county = counties.size();
		for (Country county : counties) {
			List<DataPiece> datas = county.getDatas();
			if (datas != null && datas.size() > 10) {
				county_progress++;
				Result result = new Result();
				result.setId("county_" + county.getId());
				result.setName(county.getName());
				result.setValue(county.getValue());
				results.add(result);
			}
		}

		// msa的进度
		List<MSA> msas = MSA.findAll();
		int msa_progress = 0;
		int total_msa = msas.size();
		for (MSA msa : msas) {
			List<DataPiece> datas = msa.getDatas();
			if (datas != null && datas.size() > 10) {
				msa_progress++;

				Result result = new Result();
				result.setId("msa_" + msa.getId());
				result.setName(msa.getName());
				result.setValue(msa.getValue());
				results.add(result);
			}
		}

		if (id.startsWith("msa_")) {
			MSA msa = MSA.findById(Long.parseLong(id.replace("msa_", "").replace("?", "")));
			render("progress.html", results, county_progress, total_county, msa_progress, total_msa, msa);
		} else if (id.startsWith("county_")) {
			Country msa = Country.findById(Long.parseLong(id.replace("county_", "").replace("?", "")));
			render("progress.html", results, county_progress, total_county, msa_progress, total_msa, msa);
		} else if (id.equals("all")) {
			Country msa = counties.get(0);
			render("progress.html", results, county_progress, total_county, msa_progress, total_msa, msa);
		}

	}

}