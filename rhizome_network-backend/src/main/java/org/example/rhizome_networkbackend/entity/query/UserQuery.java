package org.example.rhizome_networkbackend.entity.query;


/**
 * 用户表参数
 */
public class UserQuery extends BaseParam {


	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 登录账号
	 */
	private String account;

	private String accountFuzzy;

	/**
	 * 密码密文
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 显示昵称
	 */
	private String nickName;

	private String nickNameFuzzy;

	/**
	 * 头像URL
	 */
	private String avatarUrl;

	private String avatarUrlFuzzy;

	/**
	 * 个性签名
	 */
	private String signature;

	private String signatureFuzzy;

	/**
	 * 用户权限
	 */
	private String role;

	private String roleFuzzy;

	/**
	 * 0正常 1禁用
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 更新时间
	 */
	private String updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;


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

	public void setAccountFuzzy(String accountFuzzy){
		this.accountFuzzy = accountFuzzy;
	}

	public String getAccountFuzzy(){
		return this.accountFuzzy;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPasswordFuzzy(String passwordFuzzy){
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy(){
		return this.passwordFuzzy;
	}

	public void setNickName(String nickName){
		this.nickName = nickName;
	}

	public String getNickName(){
		return this.nickName;
	}

	public void setNickNameFuzzy(String nickNameFuzzy){
		this.nickNameFuzzy = nickNameFuzzy;
	}

	public String getNickNameFuzzy(){
		return this.nickNameFuzzy;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return this.avatarUrl;
	}

	public void setAvatarUrlFuzzy(String avatarUrlFuzzy){
		this.avatarUrlFuzzy = avatarUrlFuzzy;
	}

	public String getAvatarUrlFuzzy(){
		return this.avatarUrlFuzzy;
	}

	public void setSignature(String signature){
		this.signature = signature;
	}

	public String getSignature(){
		return this.signature;
	}

	public void setSignatureFuzzy(String signatureFuzzy){
		this.signatureFuzzy = signatureFuzzy;
	}

	public String getSignatureFuzzy(){
		return this.signatureFuzzy;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return this.role;
	}

	public void setRoleFuzzy(String roleFuzzy){
		this.roleFuzzy = roleFuzzy;
	}

	public String getRoleFuzzy(){
		return this.roleFuzzy;
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

	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	public String getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdateTimeStart(String updateTimeStart){
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeStart(){
		return this.updateTimeStart;
	}
	public void setUpdateTimeEnd(String updateTimeEnd){
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getUpdateTimeEnd(){
		return this.updateTimeEnd;
	}

}
