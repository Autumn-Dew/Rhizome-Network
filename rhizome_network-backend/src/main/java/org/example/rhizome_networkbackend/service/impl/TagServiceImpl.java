package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.TagQuery;
import org.example.rhizome_networkbackend.entity.po.Tag;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.TagMapper;
import org.example.rhizome_networkbackend.service.TagService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 歌曲标签表 业务接口实现
 */
@Service("tagService")
public class TagServiceImpl implements TagService {

	@Resource
	private TagMapper<Tag, TagQuery> tagMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Tag> findListByParam(TagQuery param) {
		return this.tagMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(TagQuery param) {
		return this.tagMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Tag> findListByPage(TagQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Tag> list = this.findListByParam(param);
		PaginationResultVO<Tag> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Tag bean) {
		return this.tagMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Tag> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.tagMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Tag> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.tagMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Tag bean, TagQuery param) {
		StringTools.checkParam(param);
		return this.tagMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(TagQuery param) {
		StringTools.checkParam(param);
		return this.tagMapper.deleteByParam(param);
	}

	/**
	 * 根据TagId获取对象
	 */
	@Override
	public Tag getTagByTagId(Long tagId) {
		return this.tagMapper.selectByTagId(tagId);
	}

	/**
	 * 根据TagId修改
	 */
	@Override
	public Integer updateTagByTagId(Tag bean, Long tagId) {
		return this.tagMapper.updateByTagId(bean, tagId);
	}

	/**
	 * 根据TagId删除
	 */
	@Override
	public Integer deleteTagByTagId(Long tagId) {
		return this.tagMapper.deleteByTagId(tagId);
	}

	/**
	 * 根据TagName获取对象
	 */
	@Override
	public Tag getTagByTagName(String tagName) {
		return this.tagMapper.selectByTagName(tagName);
	}

	/**
	 * 根据TagName修改
	 */
	@Override
	public Integer updateTagByTagName(Tag bean, String tagName) {
		return this.tagMapper.updateByTagName(bean, tagName);
	}

	/**
	 * 根据TagName删除
	 */
	@Override
	public Integer deleteTagByTagName(String tagName) {
		return this.tagMapper.deleteByTagName(tagName);
	}
}