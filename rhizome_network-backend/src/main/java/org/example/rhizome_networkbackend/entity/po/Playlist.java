package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 歌单表
 */
public class Playlist implements Serializable {


	/**
	 * 歌单ID
	 */
	private Long playlistId;

	/**
	 * 创建者ID
	 */
	private Long userId;

	/**
	 * 歌单名称
	 */
	private String title;

	/**
	 * 简介
	 */
	private String intro;

	/**
	 * 封面URL
	 */
	private String coverUrl;

	/**
	 * 0私密 1公开
	 */
	private Integer isPublic;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


	public void setPlaylistId(Long playlistId){
		this.playlistId = playlistId;
	}

	public Long getPlaylistId(){
		return this.playlistId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return this.title;
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

	public void setIsPublic(Integer isPublic){
		this.isPublic = isPublic;
	}

	public Integer getIsPublic(){
		return this.isPublic;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	@Override
	public String toString (){
		return "歌单ID:"+(playlistId == null ? "空" : playlistId)+"，创建者ID:"+(userId == null ? "空" : userId)+"，歌单名称:"+(title == null ? "空" : title)+"，简介:"+(intro == null ? "空" : intro)+"，封面URL:"+(coverUrl == null ? "空" : coverUrl)+"，0私密 1公开:"+(isPublic == null ? "空" : isPublic)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，更新时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
