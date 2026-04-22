package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumPostLikeQuery;
import org.example.rhizome_networkbackend.entity.po.ForumPostLike;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 帖子点赞表 业务接口
 */
public interface ForumPostLikeService {

	/**
	 * 根据条件查询列表
	 */
	List<ForumPostLike> findListByParam(ForumPostLikeQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ForumPostLikeQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ForumPostLike> findListByPage(ForumPostLikeQuery param);

	/**
	 * 新增
	 */
	Integer add(ForumPostLike bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<ForumPostLike> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<ForumPostLike> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(ForumPostLike bean,ForumPostLikeQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(ForumPostLikeQuery param);

	/**
	 * 根据Id查询对象
	 */
	ForumPostLike getForumPostLikeById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updateForumPostLikeById(ForumPostLike bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deleteForumPostLikeById(Long id);


	/**
	 * 根据UserIdAndPostId查询对象
	 */
	ForumPostLike getForumPostLikeByUserIdAndPostId(Long userId,Long postId);


	/**
	 * 根据UserIdAndPostId修改
	 */
	Integer updateForumPostLikeByUserIdAndPostId(ForumPostLike bean,Long userId,Long postId);


	/**
	 * 根据UserIdAndPostId删除
	 */
	Integer deleteForumPostLikeByUserIdAndPostId(Long userId,Long postId);

}