package org.example.rhizome_networkbackend.entity.query;


/**
 * 歌单歌曲关联表参数
 */
public class PlaylistSongQuery extends BaseParam {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Long playlistId;

	/**
	 * 
	 */
	private String songkey;

	private String songkeyFuzzy;

	/**
	 * 
	 */
	private String addTime;

	private String addTimeStart;

	private String addTimeEnd;


	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setPlaylistId(Long playlistId){
		this.playlistId = playlistId;
	}

	public Long getPlaylistId(){
		return this.playlistId;
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

	public void setAddTime(String addTime){
		this.addTime = addTime;
	}

	public String getAddTime(){
		return this.addTime;
	}

	public void setAddTimeStart(String addTimeStart){
		this.addTimeStart = addTimeStart;
	}

	public String getAddTimeStart(){
		return this.addTimeStart;
	}
	public void setAddTimeEnd(String addTimeEnd){
		this.addTimeEnd = addTimeEnd;
	}

	public String getAddTimeEnd(){
		return this.addTimeEnd;
	}

}
