package org.example.rhizome_networkbackend.entity.query;


/**
 * 歌曲标签表参数
 */
public class TagQuery extends BaseParam {


	/**
	 * 
	 */
	private Long tagId;

	/**
	 * 标签名
	 */
	private String tagName;

	private String tagNameFuzzy;

	/**
	 * 使用次数
	 */
	private Integer useCount;

	/**
	 * 
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


	public void setTagId(Long tagId){
		this.tagId = tagId;
	}

	public Long getTagId(){
		return this.tagId;
	}

	public void setTagName(String tagName){
		this.tagName = tagName;
	}

	public String getTagName(){
		return this.tagName;
	}

	public void setTagNameFuzzy(String tagNameFuzzy){
		this.tagNameFuzzy = tagNameFuzzy;
	}

	public String getTagNameFuzzy(){
		return this.tagNameFuzzy;
	}

	public void setUseCount(Integer useCount){
		this.useCount = useCount;
	}

	public Integer getUseCount(){
		return this.useCount;
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
