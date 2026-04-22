package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 论坛回复表
 */
public class ForumReply implements Serializable {


	/**
	 * 回复ID
	 */
	private Long replyId;

	/**
	 * 帖子ID
	 */
	private Long postId;

	/**
	 * 回复人ID
	 */
	private Long userId;

	/**
	 * 回复内容
	 */
	private String content;

	/**
	 * 点赞数
	 */
	private Integer likeCount;

	/**
	 * 楼中楼回复
	 */
	private Long parentId;

	/**
	 * 0正常 1删除
	 */
	private Integer status;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


	public void setReplyId(Long replyId){
		this.replyId = replyId;
	}

	public Long getReplyId(){
		return this.replyId;
	}

	public void setPostId(Long postId){
		this.postId = postId;
	}

	public Long getPostId(){
		return this.postId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return this.content;
	}

	public void setLikeCount(Integer likeCount){
		this.likeCount = likeCount;
	}

	public Integer getLikeCount(){
		return this.likeCount;
	}

	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	public Long getParentId(){
		return this.parentId;
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
		return "回复ID:"+(replyId == null ? "空" : replyId)+"，帖子ID:"+(postId == null ? "空" : postId)+"，回复人ID:"+(userId == null ? "空" : userId)+"，回复内容:"+(content == null ? "空" : content)+"，点赞数:"+(likeCount == null ? "空" : likeCount)+"，楼中楼回复:"+(parentId == null ? "空" : parentId)+"，0正常 1删除:"+(status == null ? "空" : status)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
