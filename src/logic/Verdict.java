/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author ohjun
 */
public class Verdict {
    private String caseTitle;
    private String studentVerdict;
    private String reason;
	
	private static final String DEFUALT_TITLE = "null";
	private static final String DEFUALT_VERDICT = "null";
	private static final String DEFUALT_REASON = "null";

    public Verdict() {
		caseTitle = DEFUALT_TITLE;
		studentVerdict = DEFUALT_VERDICT;
		reason = DEFUALT_REASON;
    }

    public Verdict(String caseTitle, String verdict, String reason) {
		this.caseTitle = caseTitle;
		studentVerdict = verdict;
		this.reason = reason;
    }

    public void setCaseTitle(String title) {
		caseTitle = title;
    }

    public String getCaseTitle() {
        return caseTitle;

    }

    public void setReason(String reason) {
		this.reason = reason;
	}

    public String getReason() {
        return reason;
    }

    public void setStudentVerdict(String verdict) {
		studentVerdict = verdict;
    }

    public String getStudentVerdict() {
        return studentVerdict;
    }

    @Override
    public String toString() {
        return null;
    }
}