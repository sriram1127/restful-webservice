package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class CallWiseScoreReport {

	private String category;

	private String startDate;

	private String endDate;

	private List<CallScoreList> callScoreList;

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the callScoreList
	 */
	public List<CallScoreList> getCallScoreList() {
		return callScoreList;
	}

	/**
	 * @param callScoreList
	 *            the callScoreList to set
	 */
	public void setCallScoreList(List<CallScoreList> callScoreList) {
		this.callScoreList = callScoreList;
	}

}
