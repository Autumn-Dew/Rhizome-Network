package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumPostLikeQuery;
import org.example.rhizome_networkbackend.entity.po.ForumPostLike;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.ForumPostLikeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 帖子点赞表 Controller
 */
@RestController("forumPostLikeController")
@RequestMapping("/forumPostLike")
public class ForumPostLikeController extends ABaseController{

	@Resource
	private ForumPostLikeService forumPostLikeService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(ForumPostLikeQuery query){
		return getSuccessResponseVO(forumPostLikeService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(ForumPostLike bean) {
		forumPostLikeService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<ForumPostLike> listBean) {
		forumPostLikeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<ForumPostLike> listBean) {
		forumPostLikeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getForumPostLikeById")
	public ResponseVO getForumPostLikeById(Long id) {
		return getSuccessResponseVO(forumPostLikeService.getForumPostLikeById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateForumPostLikeById")
	public ResponseVO updateForumPostLikeById(ForumPostLike bean,Long id) {
		forumPostLikeService.updateForumPostLikeById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteForumPostLikeById")
	public ResponseVO deleteForumPostLikeById(Long id) {
		forumPostLikeService.deleteForumPostLikeById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndPostId查询对象
	 */
	@RequestMapping("/getForumPostLikeByUserIdAndPostId")
	public ResponseVO getForumPostLikeByUserIdAndPostId(Long userId,Long postId) {
		return getSuccessResponseVO(forumPostLikeService.getForumPostLikeByUserIdAndPostId(userId,postId));
	}

	/**
	 * 根据UserIdAndPostId修改对象
	 */
	@RequestMapping("/updateForumPostLikeByUserIdAndPostId")
	public ResponseVO updateForumPostLikeByUserIdAndPostId(ForumPostLike bean,Long userId,Long postId) {
		forumPostLikeService.updateForumPostLikeByUserIdAndPostId(bean,userId,postId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndPostId删除
	 */
	@RequestMapping("/deleteForumPostLikeByUserIdAndPostId")
	public ResponseVO deleteForumPostLikeByUserIdAndPostId(Long userId,Long postId) {
		forumPostLikeService.deleteForumPostLikeByUserIdAndPostId(userId,postId);
		return getSuccessResponseVO(null);
	}
}