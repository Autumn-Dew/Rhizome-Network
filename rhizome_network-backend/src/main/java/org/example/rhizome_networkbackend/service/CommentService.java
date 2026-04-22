package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.CommentQuery;
import org.example.rhizome_networkbackend.entity.po.Comment;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 歌曲评论表 业务接口
 */
public interface CommentService {

	/**
	 * 根据条件查询列表
	 */
	List<Comment> findListByParam(CommentQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CommentQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Comment> findListByPage(CommentQuery param);

	/**
	 * 新增
	 */
	Integer add(Comment bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Comment> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Comment> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Comment bean,CommentQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(CommentQuery param);

	/**
	 * 根据CommentId查询对象
	 */
	Comment getCommentByCommentId(Long commentId);


	/**
	 * 根据CommentId修改
	 */
	Integer updateCommentByCommentId(Comment bean,Long commentId);


	/**
	 * 根据CommentId删除
	 */
	Integer deleteCommentByCommentId(Long commentId);

}