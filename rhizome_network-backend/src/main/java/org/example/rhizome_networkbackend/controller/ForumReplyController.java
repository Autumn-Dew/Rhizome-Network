package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumReplyQuery;
import org.example.rhizome_networkbackend.entity.po.ForumReply;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.ForumReplyService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 论坛回复表 Controller
 */
@RestController("forumReplyController")
@RequestMapping("/forumReply")
public class ForumReplyController extends ABaseController{

	@Resource
	private ForumReplyService forumReplyService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(ForumReplyQuery query){
		return getSuccessResponseVO(forumReplyService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(ForumReply bean) {
		forumReplyService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<ForumReply> listBean) {
		forumReplyService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<ForumReply> listBean) {
		forumReplyService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ReplyId查询对象
	 */
	@RequestMapping("/getForumReplyByReplyId")
	public ResponseVO getForumReplyByReplyId(Long replyId) {
		return getSuccessResponseVO(forumReplyService.getForumReplyByReplyId(replyId));
	}

	/**
	 * 根据ReplyId修改对象
	 */
	@RequestMapping("/updateForumReplyByReplyId")
	public ResponseVO updateForumReplyByReplyId(ForumReply bean,Long replyId) {
		forumReplyService.updateForumReplyByReplyId(bean,replyId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ReplyId删除
	 */
	@RequestMapping("/deleteForumReplyByReplyId")
	public ResponseVO deleteForumReplyByReplyId(Long replyId) {
		forumReplyService.deleteForumReplyByReplyId(replyId);
		return getSuccessResponseVO(null);
	}
}