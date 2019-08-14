package com.zhiyou.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private Integer	id;
	private String	courseTitle;
	private String	courseDesc;
	private Integer	subjectId;
	private List<Video> videos =new ArrayList<Video>();
	private Subject subject;
	

	public Course(Integer id, String courseTitle, String courseDesc, Integer subjectId, List<Video> videos,
			Subject subject) {
		super();
		this.id = id;
		this.courseTitle = courseTitle;
		this.courseDesc = courseDesc;
		this.subjectId = subjectId;
		this.videos = videos;
		this.subject = subject;
	}
	public List<Video> getVideos() {
		return videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseTitle=" + courseTitle + ", courseDesc=" + courseDesc + ", subjectId="
				+ subjectId + ", videos=" + videos + ", subject=" + subject + "]";
	}
	public Course(Integer id, String courseTitle, String courseDesc, Integer subjectId) {
		super();
		this.id = id;
		this.courseTitle = courseTitle;
		this.courseDesc = courseDesc;
		this.subjectId = subjectId;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
