package com.uniphore.aumina.report.displaybean;

import java.util.Map;

public class CallWiseBusinessRuleList {

	private String callId;

	private String audioFileName;

	private String callStartTime;

	private String callDuration;

	private Map<String, String> businessRules;

	/**
	 * @return the callId
	 */
	public String getCallId() {
		return callId;
	}

	/**
	 * @return the businessRules
	 */
	public Map<String, String> getBusinessRules() {
		return businessRules;
	}

	/**
	 * @param businessRules
	 *            the businessRules to set
	 */
	public void setBusinessRules(Map<String, String> businessRules) {
		this.businessRules = businessRules;
	}

	/**
	 * @param callId
	 *            the callId to set
	 */
	public void setCallId(String callId) {
		this.callId = callId;
	}

	/**
	 * @return the audioFileName
	 */
	public String getAudioFileName() {
		return audioFileName;
	}

	/**
	 * @param audioFileName
	 *            the audioFileName to set
	 */
	public void setAudioFileName(String audioFileName) {
		this.audioFileName = audioFileName;
	}

	/**
	 * @return the callStartTime
	 */
	public String getCallStartTime() {
		return callStartTime;
	}

	/**
	 * @param callStartTime
	 *            the callStartTime to set
	 */
	public void setCallStartTime(String callStartTime) {
		this.callStartTime = callStartTime;
	}

	/**
	 * @return the callDuration
	 */
	public String getCallDuration() {
		return callDuration;
	}

	/**
	 * @param callDuration
	 *            the callDuration to set
	 */
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}

}
