package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class CallDurationAgentWiseReport {

	private String category;

	private String startDate;

	private String endDate;

	private String OrganizationName;

	private String group;

	private String supervisor;
	
	private List<AgentCall> agentNameList;

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
	 * @return the agentNameList
	 */
	public List<AgentCall> getAgentNameList() {
		return agentNameList;
	}

	/**
	 * @param agentNameList
	 *            the agentNameList to set
	 */
	public void setAgentNameList(List<AgentCall> agentNameList) {
		this.agentNameList = agentNameList;
	}



}
