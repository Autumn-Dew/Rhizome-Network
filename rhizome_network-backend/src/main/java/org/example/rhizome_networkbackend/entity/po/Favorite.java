package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 收藏表
 */
public class Favorite implements Serializable {


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

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


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

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，userId:"+(userId == null ? "空" : userId)+"，1=歌曲 2=歌单 3=论坛帖子:"+(type == null ? "空" : type)+"，目标ID：songKey / playlist_id / post_id:"+(targetKey == null ? "空" : targetKey)+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
