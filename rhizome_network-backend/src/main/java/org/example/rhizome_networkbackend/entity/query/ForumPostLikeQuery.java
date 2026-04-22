package org.example.rhizome_networkbackend.entity.query;


/**
 * 帖子点赞表参数
 */
public class ForumPostLikeQuery extends BaseParam {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Long postId;

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
