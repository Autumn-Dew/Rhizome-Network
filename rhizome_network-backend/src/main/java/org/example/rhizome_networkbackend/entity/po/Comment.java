package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 歌曲评论表
 */
public class Comment implements Serializable {


	/**
	 * 评论ID
	 */
	private Long commentId;

	/**
	 * 歌曲标识
	 */
	private String songkey;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 评论内容
	 */
	private String content;

	/**
	 * 点赞数
	 */
	private Integer likeCount;

	/**
	 * 父评论ID，0为一级
	 */
	private Long parentId;

	/**
	 * 0正常 1删除
	 */
	private Integer status;

	/**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


	public void setCommentId(Long commentId){
		this.commentId = commentId;
	}

	public Long getCommentId(){
		return this.commentId;
	}

	public void setSongkey(String songkey){
		this.songkey = songkey;
	}

	public String getSongkey(){
		return this.songkey;
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
		return "评论ID:"+(commentId == null ? "空" : commentId)+"，歌曲标识:"+(songkey == null ? "空" : songkey)+"，用户ID:"+(userId == null ? "空" : userId)+"，评论内容:"+(content == null ? "空" : content)+"，点赞数:"+(likeCount == null ? "空" : likeCount)+"，父评论ID，0为一级:"+(parentId == null ? "空" : parentId)+"，0正常 1删除:"+(status == null ? "空" : status)+"，发布时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
