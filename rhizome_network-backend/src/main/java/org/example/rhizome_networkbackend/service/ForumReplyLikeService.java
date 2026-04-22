package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumReplyLikeQuery;
import org.example.rhizome_networkbackend.entity.po.ForumReplyLike;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 回复点赞表 业务接口
 */
public interface ForumReplyLikeService {

	/**
	 * 根据条件查询列表
	 */
	List<ForumReplyLike> findListByParam(ForumReplyLikeQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ForumReplyLikeQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ForumReplyLike> findListByPage(ForumReplyLikeQuery param);

	/**
	 * 新增
	 */
	Integer add(ForumReplyLike bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<ForumReplyLike> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<ForumReplyLike> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(ForumReplyLike bean,ForumReplyLikeQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(ForumReplyLikeQuery param);

	/**
	 * 根据Id查询对象
	 */
	ForumReplyLike getForumReplyLikeById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updateForumReplyLikeById(ForumReplyLike bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deleteForumReplyLikeById(Long id);


	/**
	 * 根据UserIdAndReplyId查询对象
	 */
	ForumReplyLike getForumReplyLikeByUserIdAndReplyId(Long userId,Long replyId);


	/**
	 * 根据UserIdAndReplyId修改
	 */
	Integer updateForumReplyLikeByUserIdAndReplyId(ForumReplyLike bean,Long userId,Long replyId);


	/**
	 * 根据UserIdAndReplyId删除
	 */
	Integer deleteForumReplyLikeByUserIdAndReplyId(Long userId,Long replyId);

}