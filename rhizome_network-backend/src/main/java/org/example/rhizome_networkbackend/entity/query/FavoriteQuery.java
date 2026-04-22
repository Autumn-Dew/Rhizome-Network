package org.example.rhizome_networkbackend.entity.query;


/**
 * 收藏表参数
 */
public class FavoriteQuery extends BaseParam {


	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 1=歌曲 2=歌单 3=论坛帖子
	 */
	private Integer type;

	/**
	 * 目标ID：songKey / playlist_id / post_id
	 */
	private String targetKey;

	private String targetKeyFuzzy;

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

	public void setType(Integer type){
		this.type = type;
	}

	public Integer getType(){
		return this.type;
	}

	public void setTargetKey(String targetKey){
		this.targetKey = targetKey;
	}

	public String getTargetKey(){
		return this.targetKey;
	}

	public void setTargetKeyFuzzy(String targetKeyFuzzy){
		this.targetKeyFuzzy = targetKeyFuzzy;
	}

	public String getTargetKeyFuzzy(){
		return this.targetKeyFuzzy;
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
