package com.uniphore.aumina.report.displaybean;

public class AgentCall {

	private String agentId;

	private String agentName;

	private String callCount;

	private String avgDurationInMin;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * @param agentId
	 *            the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * @param agentName
	 *            the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * @return the callCount
	 */
	public String getCallCount() {
		return callCount;
	}

	/**
	 * @param callCount
	 *            the callCount to set
	 */
	public void setCallCount(String callCount) {
		this.callCount = callCount;
	}

	/**
	 * @return the avgDurationInMin
	 */
	public String getAvgDurationInMin() {
		return avgDurationInMin;
	}

	/**
	 * @param avgDurationInMin
	 *            the avgDurationInMin to set
	 */
	public void setAvgDurationInMin(String avgDurationInMin) {
		this.avgDurationInMin = avgDurationInMin;
	}

}
