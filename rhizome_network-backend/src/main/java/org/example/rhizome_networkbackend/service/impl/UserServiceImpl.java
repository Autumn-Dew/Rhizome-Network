package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.UserQuery;
import org.example.rhizome_networkbackend.entity.po.User;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.UserMapper;
import org.example.rhizome_networkbackend.service.UserService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 用户表 业务接口实现
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper<User, UserQuery> userMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<User> findListByParam(UserQuery param) {
		return this.userMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(UserQuery param) {
		return this.userMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<User> findListByPage(UserQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<User> list = this.findListByParam(param);
		PaginationResultVO<User> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(User bean) {
		return this.userMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<User> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<User> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(User bean, UserQuery param) {
		StringTools.checkParam(param);
		return this.userMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(UserQuery param) {
		StringTools.checkParam(param);
		return this.userMapper.deleteByParam(param);
	}

	/**
	 * 根据UserId获取对象
	 */
	@Override
	public User getUserByUserId(Long userId) {
		return this.userMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId修改
	 */
	@Override
	public Integer updateUserByUserId(User bean, Long userId) {
		return this.userMapper.updateByUserId(bean, userId);
	}

	/**
	 * 根据UserId删除
	 */
	@Override
	public Integer deleteUserByUserId(Long userId) {
		return this.userMapper.deleteByUserId(userId);
	}

	/**
	 * 根据Account获取对象
	 */
	@Override
	public User getUserByAccount(String account) {
		return this.userMapper.selectByAccount(account);
	}

	/**
	 * 根据Account修改
	 */
	@Override
	public Integer updateUserByAccount(User bean, String account) {
		return this.userMapper.updateByAccount(bean, account);
	}

	/**
	 * 根据Account删除
	 */
	@Override
	public Integer deleteUserByAccount(String account) {
		return this.userMapper.deleteByAccount(account);
	}
}