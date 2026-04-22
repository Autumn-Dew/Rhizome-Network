package org.example.rhizome_networkbackend.entity.query;


/**
 * 歌曲信息表参数
 */
public class SongQuery extends BaseParam {


	/**
	 * 歌曲ID
	 */
	private Long songId;

	/**
	 * 歌曲唯一标识
	 */
	private String songkey;

	private String songkeyFuzzy;

	/**
	 * 歌曲名
	 */
	private String title;

	private String titleFuzzy;

	/**
	 * 艺术家
	 */
	private String artist;

	private String artistFuzzy;

	/**
	 * 总播放数
	 */
	private Long playCount;

	/**
	 * 评论数
	 */
	private Integer commentCount;

	/**
	 * 创建时间
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


	public void setSongId(Long songId){
		this.songId = songId;
	}

	public Long getSongId(){
		return this.songId;
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

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return this.artist;
	}

	public void setArtistFuzzy(String artistFuzzy){
		this.artistFuzzy = artistFuzzy;
	}

	public String getArtistFuzzy(){
		return this.artistFuzzy;
	}

	public void setPlayCount(Long playCount){
		this.playCount = playCount;
	}

	public Long getPlayCount(){
		return this.playCount;
	}

	public void setCommentCount(Integer commentCount){
		this.commentCount = commentCount;
	}

	public Integer getCommentCount(){
		return this.commentCount;
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
