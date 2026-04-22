package org.example.rhizome_networkbackend.entity.query;


/**
 * 歌单表参数
 */
public class PlaylistQuery extends BaseParam {


	/**
	 * 歌单ID
	 */
	private Long playlistId;

	/**
	 * 创建者ID
	 */
	private Long userId;

	/**
	 * 歌单名称
	 */
	private String title;

	private String titleFuzzy;

	/**
	 * 简介
	 */
	private String intro;

	private String introFuzzy;

	/**
	 * 封面URL
	 */
	private String coverUrl;

	private String coverUrlFuzzy;

	/**
	 * 0私密 1公开
	 */
	private Integer isPublic;

	/**
	 * 创建时间
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 更新时间
	 */
	private String updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;


	public void setPlaylistId(Long playlistId){
		this.playlistId = playlistId;
	}

	public Long getPlaylistId(){
		return this.playlistId;
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

	public void setIntro(String intro){
		this.intro = intro;
	}

	public String getIntro(){
		return this.intro;
	}

	public void setIntroFuzzy(String introFuzzy){
		this.introFuzzy = introFuzzy;
	}

	public String getIntroFuzzy(){
		return this.introFuzzy;
	}

	public void setCoverUrl(String coverUrl){
		this.coverUrl = coverUrl;
	}

	public String getCoverUrl(){
		return this.coverUrl;
	}

	public void setCoverUrlFuzzy(String coverUrlFuzzy){
		this.coverUrlFuzzy = coverUrlFuzzy;
	}

	public String getCoverUrlFuzzy(){
		return this.coverUrlFuzzy;
	}

	public void setIsPublic(Integer isPublic){
		this.isPublic = isPublic;
	}

	public Integer getIsPublic(){
		return this.isPublic;
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
