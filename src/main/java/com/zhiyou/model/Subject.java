package com.zhiyou.model;

public class Subject {
	private Integer	SubjectId;
    private String  SubjectName;
	@Override
	public String toString() {
		return "Subject [SubjectId=" + SubjectId + ", SubjectName=" + SubjectName + "]";
	}
	public Subject(Integer subjectId, String subjectName) {
		super();
		SubjectId = subjectId;
		SubjectName = subjectName;
	}
	public Integer getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(Integer subjectId) {
		SubjectId = subjectId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

