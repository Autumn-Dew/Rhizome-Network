package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.TagQuery;
import org.example.rhizome_networkbackend.entity.po.Tag;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.TagService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 歌曲标签表 Controller
 */
@RestController("tagController")
@RequestMapping("/tag")
public class TagController extends ABaseController{

	@Resource
	private TagService tagService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(TagQuery query){
		return getSuccessResponseVO(tagService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Tag bean) {
		tagService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Tag> listBean) {
		tagService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Tag> listBean) {
		tagService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据TagId查询对象
	 */
	@RequestMapping("/getTagByTagId")
	public ResponseVO getTagByTagId(Long tagId) {
		return getSuccessResponseVO(tagService.getTagByTagId(tagId));
	}

	/**
	 * 根据TagId修改对象
	 */
	@RequestMapping("/updateTagByTagId")
	public ResponseVO updateTagByTagId(Tag bean,Long tagId) {
		tagService.updateTagByTagId(bean,tagId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据TagId删除
	 */
	@RequestMapping("/deleteTagByTagId")
	public ResponseVO deleteTagByTagId(Long tagId) {
		tagService.deleteTagByTagId(tagId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据TagName查询对象
	 */
	@RequestMapping("/getTagByTagName")
	public ResponseVO getTagByTagName(String tagName) {
		return getSuccessResponseVO(tagService.getTagByTagName(tagName));
	}

	/**
	 * 根据TagName修改对象
	 */
	@RequestMapping("/updateTagByTagName")
	public ResponseVO updateTagByTagName(Tag bean,String tagName) {
		tagService.updateTagByTagName(bean,tagName);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据TagName删除
	 */
	@RequestMapping("/deleteTagByTagName")
	public ResponseVO deleteTagByTagName(String tagName) {
		tagService.deleteTagByTagName(tagName);
		return getSuccessResponseVO(null);
	}
}