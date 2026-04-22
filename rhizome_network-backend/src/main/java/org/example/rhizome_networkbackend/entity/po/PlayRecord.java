package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 播放记录表
 */
public class PlayRecord implements Serializable {


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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastPlayTime;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


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

	public void setLastPlayTime(Date lastPlayTime){
		this.lastPlayTime = lastPlayTime;
	}

	public Date getLastPlayTime(){
		return this.lastPlayTime;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，userId:"+(userId == null ? "空" : userId)+"，songkey:"+(songkey == null ? "空" : songkey)+"，总播放次数:"+(totalCount == null ? "空" : totalCount)+"，当月播放次数:"+(monthCount == null ? "空" : monthCount)+"，近7天播放次数:"+(weekCount == null ? "空" : weekCount)+"，最后播放时间:"+(lastPlayTime == null ? "空" : DateUtil.format(lastPlayTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，createTime:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，updateTime:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
