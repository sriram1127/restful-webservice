package com.uniphore.aumina.report.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.uniphore.aumina.report.displaybean.Keyword;
import com.uniphore.aumina.report.displaybean.KeywordFrequencyReport;
import com.uniphore.aumina.report.format.Report;

@Path("/report")
public class AuminaReportService {

	@GET
	@Path("keywordfrequency")
	@Produces({ MediaType.APPLICATION_JSON })
	public Rep                       ort getKeywordFrequency(@HeaderParam("auth_key") String auth_key,
			@QueryParam("category") String category,
			@QueryParam("startDate") String startDate) {

		Report report = new Report();

		report.setStatusCode("200");

		List<Keyword> keywordFrequencyList = new ArrayList<Keyword>();
		Keyword k1 = new Keyword();
		Keyword k2 = new Keyword();
		Keyword k3 = new Keyword();
		KeywordFrequencyReport kf = new KeywordFrequencyReport();
		kf.setStartDate(startDate);
		kf.setEndDate("2015-09-01");
		k1.setKeywordname("thanks a lot");
		k1.setFrequency("950");

		k2.setKeywordname("you are very welcome");
		k2.setFrequency("484");

		k3.setKeywordname("threat today ");
		k3.setFrequency("6");

		kf.setCategory(category);
		kf.setOrganizationName("uniphore");

		keywordFrequencyList.add(k1);
		keywordFrequencyList.add(k2);
		keywordFrequencyList.add(k3);

		kf.setKeywordFrequencyList(keywordFrequencyList);

		report.setData(kf);
		return report;
		// return Response.status(200).entity(kf).build();
	}
}
