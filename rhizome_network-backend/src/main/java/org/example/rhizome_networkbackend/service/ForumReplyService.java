package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumReplyQuery;
import org.example.rhizome_networkbackend.entity.po.ForumReply;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 论坛回复表 业务接口
 */
public interface ForumReplyService {

	/**
	 * 根据条件查询列表
	 */
	List<ForumReply> findListByParam(ForumReplyQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ForumReplyQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ForumReply> findListByPage(ForumReplyQuery param);

	/**
	 * 新增
	 */
	Integer add(ForumReply bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<ForumReply> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<ForumReply> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(ForumReply bean,ForumReplyQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(ForumReplyQuery param);

	/**
	 * 根据ReplyId查询对象
	 */
	ForumReply getForumReplyByReplyId(Long replyId);


	/**
	 * 根据ReplyId修改
	 */
	Integer updateForumReplyByReplyId(ForumReply bean,Long replyId);


	/**
	 * 根据ReplyId删除
	 */
	Integer deleteForumReplyByReplyId(Long replyId);

}