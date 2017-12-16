package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class CallWiseBusinessRuleResult {

	private String category;

	private String startDate;

	private String endDate;

	private List<CallWiseBusinessRuleList> CallWiseBusinessRuleList;

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
	 * @return the callWiseBusinessRuleList
	 */
	public List<CallWiseBusinessRuleList> getCallWiseBusinessRuleList() {
		return CallWiseBusinessRuleList;
	}

	/**
	 * @param callWiseBusinessRuleList
	 *            the callWiseBusinessRuleList to set
	 */
	public void setCallWiseBusinessRuleList(
			List<CallWiseBusinessRuleList> callWiseBusinessRuleList) {
		CallWiseBusinessRuleList = callWiseBusinessRuleList;
	}

}
