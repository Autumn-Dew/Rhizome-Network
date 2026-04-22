package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.UserQuery;
import org.example.rhizome_networkbackend.entity.po.User;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 用户表 业务接口
 */
public interface UserService {

	/**
	 * 根据条件查询列表
	 */
	List<User> findListByParam(UserQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(UserQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<User> findListByPage(UserQuery param);

	/**
	 * 新增
	 */
	Integer add(User bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<User> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<User> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(User bean,UserQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(UserQuery param);

	/**
	 * 根据UserId查询对象
	 */
	User getUserByUserId(Long userId);


	/**
	 * 根据UserId修改
	 */
	Integer updateUserByUserId(User bean,Long userId);


	/**
	 * 根据UserId删除
	 */
	Integer deleteUserByUserId(Long userId);


	/**
	 * 根据Account查询对象
	 */
	User getUserByAccount(String account);


	/**
	 * 根据Account修改
	 */
	Integer updateUserByAccount(User bean,String account);


	/**
	 * 根据Account删除
	 */
	Integer deleteUserByAccount(String account);

}