package org.example.rhizome_networkbackend.entity.query;


/**
 * 用户关注表参数
 */
public class FollowQuery extends BaseParam {


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
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


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
