package org.example.rhizome_networkbackend.entity.query;


/**
 * 论坛帖子表参数
 */
public class ForumPostQuery extends BaseParam {


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

	private String titleFuzzy;

	/**
	 * 内容
	 */
	private String content;

	private String contentFuzzy;

	/**
	 * 配图URL
	 */
	private String imageUrl;

	private String imageUrlFuzzy;

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
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 
	 */
	private String updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;


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

	public void setTitleFuzzy(String titleFuzzy){
		this.titleFuzzy = titleFuzzy;
	}

	public String getTitleFuzzy(){
		return this.titleFuzzy;
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

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return this.imageUrl;
	}

	public void setImageUrlFuzzy(String imageUrlFuzzy){
		this.imageUrlFuzzy = imageUrlFuzzy;
	}

	public String getImageUrlFuzzy(){
		return this.imageUrlFuzzy;
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

	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	public String getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdateTimeStart(String updateTimeStart){
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeStart(){
		return this.updateTimeStart;
	}
	public void setUpdateTimeEnd(String updateTimeEnd){
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getUpdateTimeEnd(){
		return this.updateTimeEnd;
	}

}
