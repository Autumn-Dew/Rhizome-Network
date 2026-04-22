package org.example.rhizome_networkbackend.entity.query;


/**
 * 播放记录表参数
 */
public class PlayRecordQuery extends BaseParam {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 
	 */
	private String songkey;

	private String songkeyFuzzy;

	/**
	 * 总播放次数
	 */
	private Integer totalCount;

	/**
	 * 当月播放次数
	 */
	private Integer monthCount;

	/**
	 * 近7天播放次数
	 */
	private Integer weekCount;

	/**
	 * 最后播放时间
	 */
	private String lastPlayTime;

	private String lastPlayTimeStart;

	private String lastPlayTimeEnd;

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

	public void setTotalCount(Integer totalCount){
		this.totalCount = totalCount;
	}

	public Integer getTotalCount(){
		return this.totalCount;
	}

	public void setMonthCount(Integer monthCount){
		this.monthCount = monthCount;
	}

	public Integer getMonthCount(){
		return this.monthCount;
	}

	public void setWeekCount(Integer weekCount){
		this.weekCount = weekCount;
	}

	public Integer getWeekCount(){
		return this.weekCount;
	}

	public void setLastPlayTime(String lastPlayTime){
		this.lastPlayTime = lastPlayTime;
	}

	public String getLastPlayTime(){
		return this.lastPlayTime;
	}

	public void setLastPlayTimeStart(String lastPlayTimeStart){
		this.lastPlayTimeStart = lastPlayTimeStart;
	}

	public String getLastPlayTimeStart(){
		return this.lastPlayTimeStart;
	}
	public void setLastPlayTimeEnd(String lastPlayTimeEnd){
		this.lastPlayTimeEnd = lastPlayTimeEnd;
	}

	public String getLastPlayTimeEnd(){
		return this.lastPlayTimeEnd;
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
