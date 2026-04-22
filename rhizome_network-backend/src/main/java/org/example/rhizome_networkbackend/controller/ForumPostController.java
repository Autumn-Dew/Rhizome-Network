package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumPostQuery;
import org.example.rhizome_networkbackend.entity.po.ForumPost;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.ForumPostService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 论坛帖子表 Controller
 */
@RestController("forumPostController")
@RequestMapping("/forumPost")
public class ForumPostController extends ABaseController{

	@Resource
	private ForumPostService forumPostService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(ForumPostQuery query){
		return getSuccessResponseVO(forumPostService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(ForumPost bean) {
		forumPostService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<ForumPost> listBean) {
		forumPostService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<ForumPost> listBean) {
		forumPostService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PostId查询对象
	 */
	@RequestMapping("/getForumPostByPostId")
	public ResponseVO getForumPostByPostId(Long postId) {
		return getSuccessResponseVO(forumPostService.getForumPostByPostId(postId));
	}

	/**
	 * 根据PostId修改对象
	 */
	@RequestMapping("/updateForumPostByPostId")
	public ResponseVO updateForumPostByPostId(ForumPost bean,Long postId) {
		forumPostService.updateForumPostByPostId(bean,postId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PostId删除
	 */
	@RequestMapping("/deleteForumPostByPostId")
	public ResponseVO deleteForumPostByPostId(Long postId) {
		forumPostService.deleteForumPostByPostId(postId);
		return getSuccessResponseVO(null);
	}
}