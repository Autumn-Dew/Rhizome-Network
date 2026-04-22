package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 回复点赞表
 */
public class ForumReplyLike implements Serializable {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Long replyId;

	/**
	 * 
	 */
	private Long userId;

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

	public void setReplyId(Long replyId){
		this.replyId = replyId;
	}

	public Long getReplyId(){
		return this.replyId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，replyId:"+(replyId == null ? "空" : replyId)+"，userId:"+(userId == null ? "空" : userId)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
