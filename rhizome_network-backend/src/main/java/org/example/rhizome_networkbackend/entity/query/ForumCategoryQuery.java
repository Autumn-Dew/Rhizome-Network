package org.example.rhizome_networkbackend.entity.query;


/**
 * 论坛分类表参数
 */
public class ForumCategoryQuery extends BaseParam {


	/**
	 * 分类ID
	 */
	private Long categoryId;

	/**
	 * 分类名称
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 分类介绍
	 */
	private String intro;

	private String introFuzzy;

	/**
	 * 封面URL
	 */
	private String coverUrl;

	private String coverUrlFuzzy;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 0正常 1禁用
	 */
	private Integer status;

	/**
	 * 
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	public Long getCategoryId(){
		return this.categoryId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
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

	public void setSort(Integer sort){
		this.sort = sort;
	}

	public Integer getSort(){
		return this.sort;
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
