package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class KeywordFrequencyReport {

	private String category;

	private String startDate;

	private String endDate;

	private List<Keyword> keywordFrequencyList;

	private String OrganizationName;

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
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return OrganizationName;
	}

	/**
	 * @param organizationName
	 *            the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}

	/**
	 * @return the keywordFrequencyList
	 */
	public List<Keyword> getKeywordFrequencyList() {
		return keywordFrequencyList;
	}

	/**
	 * @param keywordFrequencyList
	 *            the keywordFrequencyList to set
	 */
	public void setKeywordFrequencyList(List<Keyword> keywordFrequencyList) {
		this.keywordFrequencyList = keywordFrequencyList;
	}

}
