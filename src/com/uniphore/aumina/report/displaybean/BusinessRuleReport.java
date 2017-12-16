package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class BusinessRuleReport {

	private String category;

	private String startDate;

	private String endDate;

	private String OrganizationName;

	private String group;

	private String supervisor;

	private String businessGoal;

	private int callCount;

	private List<BusinessRule> businessRules;

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
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return the supervisor
	 */
	public String getSupervisor() {
		return supervisor;
	}

	/**
	 * @param supervisor
	 *            the supervisor to set
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	/**
	 * @return the businessGoal
	 */
	public String getBusinessGoal() {
		return businessGoal;
	}

	/**
	 * @param businessGoal
	 *            the businessGoal to set
	 */
	public void setBusinessGoal(String businessGoal) {
		this.businessGoal = businessGoal;
	}

	/**
	 * @return the callCount
	 */
	public int getCallCount() {
		return callCount;
	}

	/**
	 * @param callCount
	 *            the callCount to set
	 */
	public void setCallCount(int callCount) {
		this.callCount = callCount;
	}

	/**
	 * @return the businessRules
	 */
	public List<BusinessRule> getBusinessRules() {
		return businessRules;
	}

	/**
	 * @param businessRules
	 *            the businessRules to set
	 */
	public void setBusinessRules(List<BusinessRule> businessRules) {
		this.businessRules = businessRules;
	}

}
