package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 歌曲信息表
 */
public class Song implements Serializable {


	/**
	 * 歌曲ID
	 */
	private Long songId;

	/**
	 * 歌曲唯一标识
	 */
	private String songkey;

	/**
	 * 歌曲名
	 */
	private String title;

	/**
	 * 艺术家
	 */
	private String artist;

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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


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

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return this.title;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return this.artist;
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

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "歌曲ID:"+(songId == null ? "空" : songId)+"，歌曲唯一标识:"+(songkey == null ? "空" : songkey)+"，歌曲名:"+(title == null ? "空" : title)+"，艺术家:"+(artist == null ? "空" : artist)+"，总播放数:"+(playCount == null ? "空" : playCount)+"，评论数:"+(commentCount == null ? "空" : commentCount)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
