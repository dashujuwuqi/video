package com.zhiyou.model;

public class Speaker {
	private Integer	id;
	private String	speakerName;
	private String	speakerDesc;
	private String	speakerJob;
	private String	picUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSpeakerName() {
		return speakerName;
	}
	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}
	public String getSpeakerDesc() {
		return speakerDesc;
	}
	public void setSpeakerDesc(String speakerDesc) {
		this.speakerDesc = speakerDesc;
	}
	public String getSpeakerJob() {
		return speakerJob;
	}
	public void setSpeakerJob(String speakerJob) {
		this.speakerJob = speakerJob;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	@Override
	public String toString() {
		return "Speaker [id=" + id + ", speakerName=" + speakerName + ", speakerDesc=" + speakerDesc + ", speakerJob="
				+ speakerJob + ", picUrl=" + picUrl + "]";
	}
	public Speaker(Integer id, String speakerName, String speakerDesc, String speakerJob, String picUrl) {
		super();
		this.id = id;
		this.speakerName = speakerName;
		this.speakerDesc = speakerDesc;
		this.speakerJob = speakerJob;
		this.picUrl = picUrl;
	}
	public Speaker() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
