package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumCategoryQuery;
import org.example.rhizome_networkbackend.entity.po.ForumCategory;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 论坛分类表 业务接口
 */
public interface ForumCategoryService {

	/**
	 * 根据条件查询列表
	 */
	List<ForumCategory> findListByParam(ForumCategoryQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ForumCategoryQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ForumCategory> findListByPage(ForumCategoryQuery param);

	/**
	 * 新增
	 */
	Integer add(ForumCategory bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<ForumCategory> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<ForumCategory> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(ForumCategory bean,ForumCategoryQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(ForumCategoryQuery param);

	/**
	 * 根据CategoryId查询对象
	 */
	ForumCategory getForumCategoryByCategoryId(Long categoryId);


	/**
	 * 根据CategoryId修改
	 */
	Integer updateForumCategoryByCategoryId(ForumCategory bean,Long categoryId);


	/**
	 * 根据CategoryId删除
	 */
	Integer deleteForumCategoryByCategoryId(Long categoryId);

}