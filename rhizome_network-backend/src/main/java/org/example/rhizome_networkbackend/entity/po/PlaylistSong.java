package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 歌单歌曲关联表
 */
public class PlaylistSong implements Serializable {


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

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date addTime;


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

	public void setAddTime(Date addTime){
		this.addTime = addTime;
	}

	public Date getAddTime(){
		return this.addTime;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，playlistId:"+(playlistId == null ? "空" : playlistId)+"，songkey:"+(songkey == null ? "空" : songkey)+"，addTime:"+(addTime == null ? "空" : DateUtil.format(addTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
