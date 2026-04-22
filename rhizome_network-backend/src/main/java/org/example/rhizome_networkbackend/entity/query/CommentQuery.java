package org.example.rhizome_networkbackend.entity.query;


/**
 * 歌曲评论表参数
 */
public class CommentQuery extends BaseParam {


	/**
	 * 评论ID
	 */
	private Long commentId;

	/**
	 * 歌曲标识
	 */
	private String songkey;

	private String songkeyFuzzy;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 评论内容
	 */
	private String content;

	private String contentFuzzy;

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
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


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

	public void setSongkeyFuzzy(String songkeyFuzzy){
		this.songkeyFuzzy = songkeyFuzzy;
	}

	public String getSongkeyFuzzy(){
		return this.songkeyFuzzy;
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
