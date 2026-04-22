package org.example.rhizome_networkbackend.entity.po;

import java.util.Date;
import org.example.rhizome_networkbackend.entity.enums.DateTimePatternEnum;
import org.example.rhizome_networkbackend.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 用户表
 */
public class User implements Serializable {


	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 登录账号
	 */
	private String account;

	/**
	 * 密码密文
	 */
	private String password;

	/**
	 * 显示昵称
	 */
	private String nickName;

	/**
	 * 头像URL
	 */
	private String avatarUrl;

	/**
	 * 个性签名
	 */
	private String signature;

	/**
	 * 用户权限
	 */
	private String role;

	/**
	 * 0正常 1禁用
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setAccount(String account){
		this.account = account;
	}

	public String getAccount(){
		return this.account;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setNickName(String nickName){
		this.nickName = nickName;
	}

	public String getNickName(){
		return this.nickName;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return this.avatarUrl;
	}

	public void setSignature(String signature){
		this.signature = signature;
	}

	public String getSignature(){
		return this.signature;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return this.role;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
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
		return "用户ID:"+(userId == null ? "空" : userId)+"，登录账号:"+(account == null ? "空" : account)+"，密码密文:"+(password == null ? "空" : password)+"，显示昵称:"+(nickName == null ? "空" : nickName)+"，头像URL:"+(avatarUrl == null ? "空" : avatarUrl)+"，个性签名:"+(signature == null ? "空" : signature)+"，用户权限:"+(role == null ? "空" : role)+"，0正常 1禁用:"+(status == null ? "空" : status)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，更新时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
