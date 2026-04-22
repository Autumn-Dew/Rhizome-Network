package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.ForumReplyLikeQuery;
import org.example.rhizome_networkbackend.entity.po.ForumReplyLike;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.ForumReplyLikeMapper;
import org.example.rhizome_networkbackend.service.ForumReplyLikeService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 回复点赞表 业务接口实现
 */
@Service("forumReplyLikeService")
public class ForumReplyLikeServiceImpl implements ForumReplyLikeService {

	@Resource
	private ForumReplyLikeMapper<ForumReplyLike, ForumReplyLikeQuery> forumReplyLikeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ForumReplyLike> findListByParam(ForumReplyLikeQuery param) {
		return this.forumReplyLikeMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ForumReplyLikeQuery param) {
		return this.forumReplyLikeMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<ForumReplyLike> findListByPage(ForumReplyLikeQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<ForumReplyLike> list = this.findListByParam(param);
		PaginationResultVO<ForumReplyLike> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(ForumReplyLike bean) {
		return this.forumReplyLikeMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<ForumReplyLike> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumReplyLikeMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<ForumReplyLike> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumReplyLikeMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(ForumReplyLike bean, ForumReplyLikeQuery param) {
		StringTools.checkParam(param);
		return this.forumReplyLikeMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ForumReplyLikeQuery param) {
		StringTools.checkParam(param);
		return this.forumReplyLikeMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public ForumReplyLike getForumReplyLikeById(Long id) {
		return this.forumReplyLikeMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateForumReplyLikeById(ForumReplyLike bean, Long id) {
		return this.forumReplyLikeMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteForumReplyLikeById(Long id) {
		return this.forumReplyLikeMapper.deleteById(id);
	}

	/**
	 * 根据UserIdAndReplyId获取对象
	 */
	@Override
	public ForumReplyLike getForumReplyLikeByUserIdAndReplyId(Long userId, Long replyId) {
		return this.forumReplyLikeMapper.selectByUserIdAndReplyId(userId, replyId);
	}

	/**
	 * 根据UserIdAndReplyId修改
	 */
	@Override
	public Integer updateForumReplyLikeByUserIdAndReplyId(ForumReplyLike bean, Long userId, Long replyId) {
		return this.forumReplyLikeMapper.updateByUserIdAndReplyId(bean, userId, replyId);
	}

	/**
	 * 根据UserIdAndReplyId删除
	 */
	@Override
	public Integer deleteForumReplyLikeByUserIdAndReplyId(Long userId, Long replyId) {
		return this.forumReplyLikeMapper.deleteByUserIdAndReplyId(userId, replyId);
	}
}