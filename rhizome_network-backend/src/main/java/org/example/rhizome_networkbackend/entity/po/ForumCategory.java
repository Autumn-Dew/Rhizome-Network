package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 论坛分类表
 */
public class ForumCategory implements Serializable {


	/**
	 * 分类ID
	 */
	private Long categoryId;

	/**
	 * 分类名称
	 */
	private String name;

	/**
	 * 分类介绍
	 */
	private String intro;

	/**
	 * 封面URL
	 */
	private String coverUrl;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 0正常 1禁用
	 */
	private Integer status;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	public Long getCategoryId(){
		return this.categoryId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setIntro(String intro){
		this.intro = intro;
	}

	public String getIntro(){
		return this.intro;
	}

	public void setCoverUrl(String coverUrl){
		this.coverUrl = coverUrl;
	}

	public String getCoverUrl(){
		return this.coverUrl;
	}

	public void setSort(Integer sort){
		this.sort = sort;
	}

	public Integer getSort(){
		return this.sort;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "分类ID:"+(categoryId == null ? "空" : categoryId)+"，分类名称:"+(name == null ? "空" : name)+"，分类介绍:"+(intro == null ? "空" : intro)+"，封面URL:"+(coverUrl == null ? "空" : coverUrl)+"，排序:"+(sort == null ? "空" : sort)+"，0正常 1禁用:"+(status == null ? "空" : status)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
