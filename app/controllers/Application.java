package controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

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
			if (county.getIsCralwed() != 1)
				continue;
			county_progress++;
			Result result = new Result();
			result.setId("county_" + county.getId());
			result.setName(county.getName());
			result.setValue(county.getValue());
			results.add(result);
		}

		// msa的进度
		List<MSA> msas = MSA.findAll();
		int msa_progress = 0;
		int total_msa = msas.size();
		for (MSA msa : msas) {
			if (msa.getIsCralwed() != 1)
				continue;
			msa_progress++;
			Result result = new Result();
			result.setId("msa_" + msa.getId());
			result.setName(msa.getName());
			result.setValue(msa.getValue());
			results.add(result);
		}
		// DataPiece data = counties.get(0).getDatas().get(0);
		// StringBuilder sb = new StringBuilder();
		// sb.append("State");
		// sb.append(",");
		// sb.append("County/Metros");
		// sb.append(",");
		// int year = data.getYear();
		// sb.append(year + ",");
		// for (Attr attr : data.getBusinessall().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getBusinessresident().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getBusinessnonresident().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getBusinessnoncommercial().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getJobs().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getGained().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getLost().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getNetchange().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getSaleall().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getSalesperemployee().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// for (Attr attr : data.getSalesperbusiness().getAttrs()) {
		// String v = attr.getAttr_name();
		// sb.append(v + ",");
		// }
		// System.out.println(sb.toString());
		// 将已经抓取到的msa county的数据存在本地
//		List<MSA> msa_list = MSA.findAll();
//		List<String> lines = new ArrayList<String>();
//		System.out.println("Size of County:" + msa_list.size());
//		int index = 0;
//		for (MSA msa : msa_list) {
//			index++;
//			if (index % 100 == 0) {
//
//				System.out.println("progress:" + index);
//				try {
//					FileUtils.writeLines(new File("MSA.txt"), lines, true);
//					System.out.println("File Saved to MSA.txt.");
//					lines = null;
//					lines = new ArrayList<String>();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			for (DataPiece data : msa.getDatas()) {
//				StringBuilder sb = new StringBuilder();
//				sb.append("State:");
//				sb.append(msa.getState().getName());
//				sb.append("===");
//				sb.append("MSA/County:");
//				sb.append(msa.getName());
//				sb.append("===");
//				int year = data.getYear();
//				sb.append("Year:");
//				sb.append(year);
//				sb.append("===");
//				try {
//					for (Attr attr : data.getBusinessall().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_ALL:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getBusinessresident().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_RESIDENT:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getBusinessnonresident().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_NONE_RESIDENT:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getBusinessnoncommercial().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_NONE_COMMERCIAL:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getJobs().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_JOBS:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getGained().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_GAINED:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getLost().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_LOST:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getNetchange().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_NET_CHANGE:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getSaleall().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_SALE_ALL:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getSalesperemployee().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_SALES_PER_EMPLOYEE:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//					for (Attr attr : data.getSalesperbusiness().getAttrs()) {
//						String v = attr.getAttr_value();
//						sb.append("BUSINESSES_SALES_PER_BUSINESS:");
//						sb.append(attr.getAttr_name());
//						sb.append(":" + v);
//						sb.append("===");
//					}
//				} catch (Exception e) {
//					continue;
//				}
//				String s = sb.toString();
//				lines.add(s);
//			}
//		}
//		try {
//			FileUtils.writeLines(new File("MSA.txt"),lines, true);
//			System.out.println("File Saved to MSA.txt.");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 将已经抓取到的msa county的数据存在本地
		List<Country> ct_list = Country.findAll();
		List<String> ct_lines = new ArrayList<String>();
		System.out.println("Size of County:" + ct_list.size());
		int index = 0;
		for (Country msa : ct_list) {
			index++;
			if (index % 100 == 0) {

				System.out.println("progress:" + index);
				try {
					FileUtils.writeLines(new File("County.txt"), ct_lines, true);
					System.out.println("File Saved to County.txt.");
					ct_lines = null;
					ct_lines = new ArrayList<String>();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(msa.getDatas().size()==0){
				System.out.println(msa.getName()+"\t"+msa.getValue());
			}
			for (DataPiece data : msa.getDatas()) {
				StringBuilder sb = new StringBuilder();
				sb.append("State:");
				sb.append(msa.getState().getName());
				sb.append("===");
				sb.append("MSA/County:");
				sb.append(msa.getName());
				sb.append("===");
				int year = data.getYear();
				sb.append("Year:");
				sb.append(year);
				sb.append("===");
				try {
					for (Attr attr : data.getBusinessall().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_ALL:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getBusinessresident().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_RESIDENT:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getBusinessnonresident().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_NONE_RESIDENT:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getBusinessnoncommercial().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_NONE_COMMERCIAL:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getJobs().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_JOBS:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getGained().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_GAINED:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getLost().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_LOST:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getNetchange().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_NET_CHANGE:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getSaleall().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_SALE_ALL:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getSalesperemployee().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_SALES_PER_EMPLOYEE:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
					for (Attr attr : data.getSalesperbusiness().getAttrs()) {
						String v = attr.getAttr_value();
						sb.append("BUSINESSES_SALES_PER_BUSINESS:");
						sb.append(attr.getAttr_name());
						sb.append(":" + v);
						sb.append("===");
					}
				} catch (Exception e) {
					continue;
				}
				String s = sb.toString();
				ct_lines.add(s);
			}
		}
		try {
			FileUtils.writeLines(new File("County.txt"), ct_lines, true);
			System.out.println("File Saved to County.txt.");
		} catch (IOException e) {
			e.printStackTrace();
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