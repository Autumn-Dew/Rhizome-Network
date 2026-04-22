package org.example.rhizome_networkbackend.entity.query;


/**
 * 评论点赞表参数
 */
public class CommentLikeQuery extends BaseParam {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Long commentId;

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setCommentId(Long commentId){
		this.commentId = commentId;
	}

	public Long getCommentId(){
		return this.commentId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
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
