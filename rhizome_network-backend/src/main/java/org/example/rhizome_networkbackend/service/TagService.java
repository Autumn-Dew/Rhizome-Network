package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.TagQuery;
import org.example.rhizome_networkbackend.entity.po.Tag;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 歌曲标签表 业务接口
 */
public interface TagService {

	/**
	 * 根据条件查询列表
	 */
	List<Tag> findListByParam(TagQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(TagQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Tag> findListByPage(TagQuery param);

	/**
	 * 新增
	 */
	Integer add(Tag bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Tag> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Tag> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Tag bean,TagQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(TagQuery param);

	/**
	 * 根据TagId查询对象
	 */
	Tag getTagByTagId(Long tagId);


	/**
	 * 根据TagId修改
	 */
	Integer updateTagByTagId(Tag bean,Long tagId);


	/**
	 * 根据TagId删除
	 */
	Integer deleteTagByTagId(Long tagId);


	/**
	 * 根据TagName查询对象
	 */
	Tag getTagByTagName(String tagName);


	/**
	 * 根据TagName修改
	 */
	Integer updateTagByTagName(Tag bean,String tagName);


	/**
	 * 根据TagName删除
	 */
	Integer deleteTagByTagName(String tagName);

}