package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.CommentQuery;
import org.example.rhizome_networkbackend.entity.po.Comment;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.CommentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 歌曲评论表 Controller
 */
@RestController("commentController")
@RequestMapping("/comment")
public class CommentController extends ABaseController{

	@Resource
	private CommentService commentService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(CommentQuery query){
		return getSuccessResponseVO(commentService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Comment bean) {
		commentService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Comment> listBean) {
		commentService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Comment> listBean) {
		commentService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CommentId查询对象
	 */
	@RequestMapping("/getCommentByCommentId")
	public ResponseVO getCommentByCommentId(Long commentId) {
		return getSuccessResponseVO(commentService.getCommentByCommentId(commentId));
	}

	/**
	 * 根据CommentId修改对象
	 */
	@RequestMapping("/updateCommentByCommentId")
	public ResponseVO updateCommentByCommentId(Comment bean,Long commentId) {
		commentService.updateCommentByCommentId(bean,commentId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CommentId删除
	 */
	@RequestMapping("/deleteCommentByCommentId")
	public ResponseVO deleteCommentByCommentId(Long commentId) {
		commentService.deleteCommentByCommentId(commentId);
		return getSuccessResponseVO(null);
	}
}