package org.example.rhizome_networkbackend.entity.query;


/**
 * 论坛回复表参数
 */
public class ForumReplyQuery extends BaseParam {


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

	private String contentFuzzy;

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
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


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

	public void setContentFuzzy(String contentFuzzy){
		this.contentFuzzy = contentFuzzy;
	}

	public String getContentFuzzy(){
		return this.contentFuzzy;
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

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart(){
		return this.createTimeStart;
	}
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

}
