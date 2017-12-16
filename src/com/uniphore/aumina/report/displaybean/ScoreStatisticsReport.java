package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class ScoreStatisticsReport {

	private String category;

	private String startDate;

	private String endDate;

	private List<Score> scoreStatsList;

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
	 * @return the scoreStatsList
	 */
	public List<Score> getScoreStatsList() {
		return scoreStatsList;
	}

	/**
	 * @param scoreStatsList
	 *            the scoreStatsList to set
	 */
	public void setScoreStatsList(List<Score> scoreStatsList) {
		this.scoreStatsList = scoreStatsList;
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

	private String OrganizationName;

}
