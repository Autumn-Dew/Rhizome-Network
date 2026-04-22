package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 用户关注表
 */
public class Follow implements Serializable {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 关注人
	 */
	private Long userId;

	/**
	 * 被关注人
	 */
	private Long followedUid;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setFollowedUid(Long followedUid){
		this.followedUid = followedUid;
	}

	public Long getFollowedUid(){
		return this.followedUid;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，关注人:"+(userId == null ? "空" : userId)+"，被关注人:"+(followedUid == null ? "空" : followedUid)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
