package org.example.rhizome_networkbackend.entity.query;


/**
 * 用户动态表参数
 */
public class MomentQuery extends BaseParam {


	/**
	 * 
	 */
	private Long momentId;

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 1播放 2评论 3创建歌单 4收藏
	 */
	private Integer actionType;

	/**
	 * 
	 */
	private String songkey;

	private String songkeyFuzzy;

	/**
	 * 
	 */
	private Long playlistId;

	/**
	 * 动态内容
	 */
	private String content;

	private String contentFuzzy;

	/**
	 * 
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


	public void setMomentId(Long momentId){
		this.momentId = momentId;
	}

	public Long getMomentId(){
		return this.momentId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setActionType(Integer actionType){
		this.actionType = actionType;
	}

	public Integer getActionType(){
		return this.actionType;
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

	public void setPlaylistId(Long playlistId){
		this.playlistId = playlistId;
	}

	public Long getPlaylistId(){
		return this.playlistId;
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
