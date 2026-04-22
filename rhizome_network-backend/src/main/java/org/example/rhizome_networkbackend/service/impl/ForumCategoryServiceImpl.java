package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.ForumCategoryQuery;
import org.example.rhizome_networkbackend.entity.po.ForumCategory;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.ForumCategoryMapper;
import org.example.rhizome_networkbackend.service.ForumCategoryService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 论坛分类表 业务接口实现
 */
@Service("forumCategoryService")
public class ForumCategoryServiceImpl implements ForumCategoryService {

	@Resource
	private ForumCategoryMapper<ForumCategory, ForumCategoryQuery> forumCategoryMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ForumCategory> findListByParam(ForumCategoryQuery param) {
		return this.forumCategoryMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ForumCategoryQuery param) {
		return this.forumCategoryMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<ForumCategory> findListByPage(ForumCategoryQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<ForumCategory> list = this.findListByParam(param);
		PaginationResultVO<ForumCategory> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(ForumCategory bean) {
		return this.forumCategoryMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<ForumCategory> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumCategoryMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<ForumCategory> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.forumCategoryMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(ForumCategory bean, ForumCategoryQuery param) {
		StringTools.checkParam(param);
		return this.forumCategoryMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ForumCategoryQuery param) {
		StringTools.checkParam(param);
		return this.forumCategoryMapper.deleteByParam(param);
	}

	/**
	 * 根据CategoryId获取对象
	 */
	@Override
	public ForumCategory getForumCategoryByCategoryId(Long categoryId) {
		return this.forumCategoryMapper.selectByCategoryId(categoryId);
	}

	/**
	 * 根据CategoryId修改
	 */
	@Override
	public Integer updateForumCategoryByCategoryId(ForumCategory bean, Long categoryId) {
		return this.forumCategoryMapper.updateByCategoryId(bean, categoryId);
	}

	/**
	 * 根据CategoryId删除
	 */
	@Override
	public Integer deleteForumCategoryByCategoryId(Long categoryId) {
		return this.forumCategoryMapper.deleteByCategoryId(categoryId);
	}
}