package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.FollowQuery;
import org.example.rhizome_networkbackend.entity.po.Follow;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 用户关注表 业务接口
 */
public interface FollowService {

	/**
	 * 根据条件查询列表
	 */
	List<Follow> findListByParam(FollowQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(FollowQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Follow> findListByPage(FollowQuery param);

	/**
	 * 新增
	 */
	Integer add(Follow bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Follow> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Follow> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Follow bean,FollowQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(FollowQuery param);

	/**
	 * 根据Id查询对象
	 */
	Follow getFollowById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updateFollowById(Follow bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deleteFollowById(Long id);


	/**
	 * 根据UserIdAndFollowedUid查询对象
	 */
	Follow getFollowByUserIdAndFollowedUid(Long userId,Long followedUid);


	/**
	 * 根据UserIdAndFollowedUid修改
	 */
	Integer updateFollowByUserIdAndFollowedUid(Follow bean,Long userId,Long followedUid);


	/**
	 * 根据UserIdAndFollowedUid删除
	 */
	Integer deleteFollowByUserIdAndFollowedUid(Long userId,Long followedUid);

}