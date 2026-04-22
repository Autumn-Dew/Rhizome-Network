package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumReplyLikeQuery;
import org.example.rhizome_networkbackend.entity.po.ForumReplyLike;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.ForumReplyLikeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 回复点赞表 Controller
 */
@RestController("forumReplyLikeController")
@RequestMapping("/forumReplyLike")
public class ForumReplyLikeController extends ABaseController{

	@Resource
	private ForumReplyLikeService forumReplyLikeService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(ForumReplyLikeQuery query){
		return getSuccessResponseVO(forumReplyLikeService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(ForumReplyLike bean) {
		forumReplyLikeService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<ForumReplyLike> listBean) {
		forumReplyLikeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<ForumReplyLike> listBean) {
		forumReplyLikeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getForumReplyLikeById")
	public ResponseVO getForumReplyLikeById(Long id) {
		return getSuccessResponseVO(forumReplyLikeService.getForumReplyLikeById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateForumReplyLikeById")
	public ResponseVO updateForumReplyLikeById(ForumReplyLike bean,Long id) {
		forumReplyLikeService.updateForumReplyLikeById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteForumReplyLikeById")
	public ResponseVO deleteForumReplyLikeById(Long id) {
		forumReplyLikeService.deleteForumReplyLikeById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndReplyId查询对象
	 */
	@RequestMapping("/getForumReplyLikeByUserIdAndReplyId")
	public ResponseVO getForumReplyLikeByUserIdAndReplyId(Long userId,Long replyId) {
		return getSuccessResponseVO(forumReplyLikeService.getForumReplyLikeByUserIdAndReplyId(userId,replyId));
	}

	/**
	 * 根据UserIdAndReplyId修改对象
	 */
	@RequestMapping("/updateForumReplyLikeByUserIdAndReplyId")
	public ResponseVO updateForumReplyLikeByUserIdAndReplyId(ForumReplyLike bean,Long userId,Long replyId) {
		forumReplyLikeService.updateForumReplyLikeByUserIdAndReplyId(bean,userId,replyId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndReplyId删除
	 */
	@RequestMapping("/deleteForumReplyLikeByUserIdAndReplyId")
	public ResponseVO deleteForumReplyLikeByUserIdAndReplyId(Long userId,Long replyId) {
		forumReplyLikeService.deleteForumReplyLikeByUserIdAndReplyId(userId,replyId);
		return getSuccessResponseVO(null);
	}
}