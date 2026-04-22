package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 用户动态表
 */
public class Moment implements Serializable {


	/**
	 * 
	 */
	private Long momentId;

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 1播放 2评论 3创建歌单 4收藏
	 */
	private Integer actionType;

	/**
	 * 
	 */
	private String songkey;

	/**
	 * 
	 */
	private Long playlistId;

	/**
	 * 动态内容
	 */
	private String content;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


	public void setMomentId(Long momentId){
		this.momentId = momentId;
	}

	public Long getMomentId(){
		return this.momentId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setActionType(Integer actionType){
		this.actionType = actionType;
	}

	public Integer getActionType(){
		return this.actionType;
	}

	public void setSongkey(String songkey){
		this.songkey = songkey;
	}

	public String getSongkey(){
		return this.songkey;
	}

	public void setPlaylistId(Long playlistId){
		this.playlistId = playlistId;
	}

	public Long getPlaylistId(){
		return this.playlistId;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return this.content;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "momentId:"+(momentId == null ? "空" : momentId)+"，userId:"+(userId == null ? "空" : userId)+"，1播放 2评论 3创建歌单 4收藏:"+(actionType == null ? "空" : actionType)+"，songkey:"+(songkey == null ? "空" : songkey)+"，playlistId:"+(playlistId == null ? "空" : playlistId)+"，动态内容:"+(content == null ? "空" : content)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
