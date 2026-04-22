package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.UserQuery;
import org.example.rhizome_networkbackend.entity.po.User;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.UserService;
import org.example.rhizome_networkbackend.utils.MD5Util;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 用户表 Controller
 */
@RestController("userController")
@RequestMapping("/user")
public class UserController extends ABaseController{

	@Resource
	private UserService userService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(UserQuery query){
		return getSuccessResponseVO(userService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(User bean) {
        if (bean != null && bean.getPassword() != null && !bean.getPassword().trim().isEmpty()) {
            String encryptedPwd = MD5Util.encryptWithSalt(bean.getPassword());
            bean.setPassword(encryptedPwd);
        }
		userService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<User> listBean) {
		userService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<User> listBean) {
		userService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId查询对象
	 */
	@RequestMapping("/getUserByUserId")
	public ResponseVO getUserByUserId(Long userId) {
		return getSuccessResponseVO(userService.getUserByUserId(userId));
	}

	/**
	 * 根据UserId修改对象
	 */
	@RequestMapping("/updateUserByUserId")
	public ResponseVO updateUserByUserId(User bean,Long userId) {
        if (bean != null && bean.getPassword() != null && !bean.getPassword().trim().isEmpty()) {
            String encryptedPwd = MD5Util.encryptWithSalt(bean.getPassword());
            bean.setPassword(encryptedPwd);
        }
		userService.updateUserByUserId(bean,userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId删除
	 */
	@RequestMapping("/deleteUserByUserId")
	public ResponseVO deleteUserByUserId(Long userId) {
		userService.deleteUserByUserId(userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Account查询对象
	 */
	@RequestMapping("/getUserByAccount")
	public ResponseVO getUserByAccount(String account) {
		return getSuccessResponseVO(userService.getUserByAccount(account));
	}

	/**
	 * 根据Account修改对象
	 */
	@RequestMapping("/updateUserByAccount")
	public ResponseVO updateUserByAccount(User bean,String account) {
        if (bean != null && bean.getPassword() != null && !bean.getPassword().trim().isEmpty()) {
            String encryptedPwd = MD5Util.encryptWithSalt(bean.getPassword());
            bean.setPassword(encryptedPwd);
        }
		userService.updateUserByAccount(bean,account);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Account删除
	 */
	@RequestMapping("/deleteUserByAccount")
	public ResponseVO deleteUserByAccount(String account) {
		userService.deleteUserByAccount(account);
		return getSuccessResponseVO(null);
	}
}