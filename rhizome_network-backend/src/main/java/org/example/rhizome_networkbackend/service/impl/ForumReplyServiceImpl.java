package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.ForumReplyQuery;
import org.example.rhizome_networkbackend.entity.po.ForumReply;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.ForumReplyMapper;
import org.example.rhizome_networkbackend.service.ForumReplyService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 论坛回复表 业务接口实现
 */
@Service("forumReplyService")
public class ForumReplyServiceImpl implements ForumReplyService {

	@Resource
	private ForumReplyMapper<ForumReply, ForumReplyQuery> forumReplyMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ForumReply> findListByParam(ForumReplyQuery param) {
		return this.forumReplyMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ForumReplyQuery param) {
		return this.forumReplyMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<ForumReply> findListByPage(ForumReplyQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<ForumReply> list = this.findListByParam(param);
		PaginationResultVO<ForumReply> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(ForumReply bean) {
		return this.forumReplyMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<ForumReply> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumReplyMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<ForumReply> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumReplyMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(ForumReply bean, ForumReplyQuery param) {
		StringTools.checkParam(param);
		return this.forumReplyMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ForumReplyQuery param) {
		StringTools.checkParam(param);
		return this.forumReplyMapper.deleteByParam(param);
	}

	/**
	 * 根据ReplyId获取对象
	 */
	@Override
	public ForumReply getForumReplyByReplyId(Long replyId) {
		return this.forumReplyMapper.selectByReplyId(replyId);
	}

	/**
	 * 根据ReplyId修改
	 */
	@Override
	public Integer updateForumReplyByReplyId(ForumReply bean, Long replyId) {
		return this.forumReplyMapper.updateByReplyId(bean, replyId);
	}

	/**
	 * 根据ReplyId删除
	 */
	@Override
	public Integer deleteForumReplyByReplyId(Long replyId) {
		return this.forumReplyMapper.deleteByReplyId(replyId);
	}
}