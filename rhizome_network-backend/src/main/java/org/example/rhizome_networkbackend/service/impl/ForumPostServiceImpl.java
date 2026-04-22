package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.ForumPostQuery;
import org.example.rhizome_networkbackend.entity.po.ForumPost;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.ForumPostMapper;
import org.example.rhizome_networkbackend.service.ForumPostService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 论坛帖子表 业务接口实现
 */
@Service("forumPostService")
public class ForumPostServiceImpl implements ForumPostService {

	@Resource
	private ForumPostMapper<ForumPost, ForumPostQuery> forumPostMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ForumPost> findListByParam(ForumPostQuery param) {
		return this.forumPostMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ForumPostQuery param) {
		return this.forumPostMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<ForumPost> findListByPage(ForumPostQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<ForumPost> list = this.findListByParam(param);
		PaginationResultVO<ForumPost> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(ForumPost bean) {
		return this.forumPostMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<ForumPost> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumPostMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<ForumPost> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumPostMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(ForumPost bean, ForumPostQuery param) {
		StringTools.checkParam(param);
		return this.forumPostMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ForumPostQuery param) {
		StringTools.checkParam(param);
		return this.forumPostMapper.deleteByParam(param);
	}

	/**
	 * 根据PostId获取对象
	 */
	@Override
	public ForumPost getForumPostByPostId(Long postId) {
		return this.forumPostMapper.selectByPostId(postId);
	}

	/**
	 * 根据PostId修改
	 */
	@Override
	public Integer updateForumPostByPostId(ForumPost bean, Long postId) {
		return this.forumPostMapper.updateByPostId(bean, postId);
	}

	/**
	 * 根据PostId删除
	 */
	@Override
	public Integer deleteForumPostByPostId(Long postId) {
		return this.forumPostMapper.deleteByPostId(postId);
	}
}