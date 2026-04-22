package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.ForumPostLikeQuery;
import org.example.rhizome_networkbackend.entity.po.ForumPostLike;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.ForumPostLikeMapper;
import org.example.rhizome_networkbackend.service.ForumPostLikeService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 帖子点赞表 业务接口实现
 */
@Service("forumPostLikeService")
public class ForumPostLikeServiceImpl implements ForumPostLikeService {

	@Resource
	private ForumPostLikeMapper<ForumPostLike, ForumPostLikeQuery> forumPostLikeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ForumPostLike> findListByParam(ForumPostLikeQuery param) {
		return this.forumPostLikeMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ForumPostLikeQuery param) {
		return this.forumPostLikeMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<ForumPostLike> findListByPage(ForumPostLikeQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<ForumPostLike> list = this.findListByParam(param);
		PaginationResultVO<ForumPostLike> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(ForumPostLike bean) {
		return this.forumPostLikeMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<ForumPostLike> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumPostLikeMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<ForumPostLike> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumPostLikeMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(ForumPostLike bean, ForumPostLikeQuery param) {
		StringTools.checkParam(param);
		return this.forumPostLikeMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ForumPostLikeQuery param) {
		StringTools.checkParam(param);
		return this.forumPostLikeMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public ForumPostLike getForumPostLikeById(Long id) {
		return this.forumPostLikeMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateForumPostLikeById(ForumPostLike bean, Long id) {
		return this.forumPostLikeMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteForumPostLikeById(Long id) {
		return this.forumPostLikeMapper.deleteById(id);
	}

	/**
	 * 根据UserIdAndPostId获取对象
	 */
	@Override
	public ForumPostLike getForumPostLikeByUserIdAndPostId(Long userId, Long postId) {
		return this.forumPostLikeMapper.selectByUserIdAndPostId(userId, postId);
	}

	/**
	 * 根据UserIdAndPostId修改
	 */
	@Override
	public Integer updateForumPostLikeByUserIdAndPostId(ForumPostLike bean, Long userId, Long postId) {
		return this.forumPostLikeMapper.updateByUserIdAndPostId(bean, userId, postId);
	}

	/**
	 * 根据UserIdAndPostId删除
	 */
	@Override
	public Integer deleteForumPostLikeByUserIdAndPostId(Long userId, Long postId) {
		return this.forumPostLikeMapper.deleteByUserIdAndPostId(userId, postId);
	}
}