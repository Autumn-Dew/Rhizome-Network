package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 论坛帖子表
 */
public class ForumPost implements Serializable {


	/**
	 * 帖子ID
	 */
	private Long postId;

	/**
	 * 所属分类
	 */
	private Long categoryId;

	/**
	 * 发帖人ID
	 */
	private Long userId;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 配图URL
	 */
	private String imageUrl;

	/**
	 * 浏览量
	 */
	private Integer viewCount;

	/**
	 * 点赞数
	 */
	private Integer likeCount;

	/**
	 * 回复数
	 */
	private Integer replyCount;

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

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


	public void setPostId(Long postId){
		this.postId = postId;
	}

	public Long getPostId(){
		return this.postId;
	}

	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	public Long getCategoryId(){
		return this.categoryId;
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

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return this.content;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return this.imageUrl;
	}

	public void setViewCount(Integer viewCount){
		this.viewCount = viewCount;
	}

	public Integer getViewCount(){
		return this.viewCount;
	}

	public void setLikeCount(Integer likeCount){
		this.likeCount = likeCount;
	}

	public Integer getLikeCount(){
		return this.likeCount;
	}

	public void setReplyCount(Integer replyCount){
		this.replyCount = replyCount;
	}

	public Integer getReplyCount(){
		return this.replyCount;
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

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	@Override
	public String toString (){
		return "帖子ID:"+(postId == null ? "空" : postId)+"，所属分类:"+(categoryId == null ? "空" : categoryId)+"，发帖人ID:"+(userId == null ? "空" : userId)+"，标题:"+(title == null ? "空" : title)+"，内容:"+(content == null ? "空" : content)+"，配图URL:"+(imageUrl == null ? "空" : imageUrl)+"，浏览量:"+(viewCount == null ? "空" : viewCount)+"，点赞数:"+(likeCount == null ? "空" : likeCount)+"，回复数:"+(replyCount == null ? "空" : replyCount)+"，0正常 1删除:"+(status == null ? "空" : status)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updateTime:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
