package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class BusinessRule {

	private String businessRuleName;

	private String businessRuleId;

	/**
	 * @return the businessRuleName
	 */
	public String getBusinessRuleName() {
		return businessRuleName;
	}

	/**
	 * @param businessRuleName
	 *            the businessRuleName to set
	 */
	public void setBusinessRuleName(String businessRuleName) {
		this.businessRuleName = businessRuleName;
	}

	/**
	 * @return the businessRuleId
	 */
	public String getBusinessRuleId() {
		return businessRuleId;
	}

	/**
	 * @param businessRuleId
	 *            the businessRuleId to set
	 */
	public void setBusinessRuleId(String businessRuleId) {
		this.businessRuleId = businessRuleId;
	}

	/**
	 * @return the truePercentage
	 */
	public String getTruePercentage() {
		return truePercentage;
	}

	/**
	 * @param truePercentage
	 *            the truePercentage to set
	 */
	public void setTruePercentage(String truePercentage) {
		this.truePercentage = truePercentage;
	}

	/**
	 * @return the agents
	 */
	public List<Agent> getAgents() {
		return agents;
	}

	/**
	 * @param agents
	 *            the agents to set
	 */
	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}

	private String truePercentage;

	private List<Agent> agents;

}
