package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.CommentLikeQuery;
import org.example.rhizome_networkbackend.entity.po.CommentLike;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 评论点赞表 业务接口
 */
public interface CommentLikeService {

	/**
	 * 根据条件查询列表
	 */
	List<CommentLike> findListByParam(CommentLikeQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CommentLikeQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CommentLike> findListByPage(CommentLikeQuery param);

	/**
	 * 新增
	 */
	Integer add(CommentLike bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CommentLike> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CommentLike> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(CommentLike bean,CommentLikeQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(CommentLikeQuery param);

	/**
	 * 根据Id查询对象
	 */
	CommentLike getCommentLikeById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updateCommentLikeById(CommentLike bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deleteCommentLikeById(Long id);


	/**
	 * 根据UserIdAndCommentId查询对象
	 */
	CommentLike getCommentLikeByUserIdAndCommentId(Long userId,Long commentId);


	/**
	 * 根据UserIdAndCommentId修改
	 */
	Integer updateCommentLikeByUserIdAndCommentId(CommentLike bean,Long userId,Long commentId);


	/**
	 * 根据UserIdAndCommentId删除
	 */
	Integer deleteCommentLikeByUserIdAndCommentId(Long userId,Long commentId);

}