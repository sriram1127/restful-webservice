package com.uniphore.aumina.report.displaybean;

import java.util.List;

public class CallScoreList {

	private String callId;

	private String audioFileName;

	private String callStartTime;

	private String CallDuration;

	private List<CallScore> scores;

	/**
	 * @return the callId
	 */
	public String getCallId() {
		return callId;
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
		return CallDuration;
	}

	/**
	 * @param callDuration
	 *            the callDuration to set
	 */
	public void setCallDuration(String callDuration) {
		CallDuration = callDuration;
	}

	/**
	 * @return the scores
	 */
	public List<CallScore> getScores() {
		return scores;
	}

	/**
	 * @param scores
	 *            the scores to set
	 */
	public void setScores(List<CallScore> scores) {
		this.scores = scores;
	}

}
