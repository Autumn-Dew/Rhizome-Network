package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 歌曲标签表
 */
public class Tag implements Serializable {


	/**
	 * 
	 */
	private Long tagId;

	/**
	 * 标签名
	 */
	private String tagName;

	/**
	 * 使用次数
	 */
	private Integer useCount;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


	public void setTagId(Long tagId){
		this.tagId = tagId;
	}

	public Long getTagId(){
		return this.tagId;
	}

	public void setTagName(String tagName){
		this.tagName = tagName;
	}

	public String getTagName(){
		return this.tagName;
	}

	public void setUseCount(Integer useCount){
		this.useCount = useCount;
	}

	public Integer getUseCount(){
		return this.useCount;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "tagId:"+(tagId == null ? "空" : tagId)+"，标签名:"+(tagName == null ? "空" : tagName)+"，使用次数:"+(useCount == null ? "空" : useCount)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
