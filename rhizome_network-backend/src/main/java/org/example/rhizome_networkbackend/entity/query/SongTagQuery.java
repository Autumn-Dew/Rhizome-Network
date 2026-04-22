package org.example.rhizome_networkbackend.entity.query;


/**
 * 歌曲标签关联表参数
 */
public class SongTagQuery extends BaseParam {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private String songkey;

	private String songkeyFuzzy;

	/**
	 * 
	 */
	private Long tagId;

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

	public void setTagId(Long tagId){
		this.tagId = tagId;
	}

	public Long getTagId(){
		return this.tagId;
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
