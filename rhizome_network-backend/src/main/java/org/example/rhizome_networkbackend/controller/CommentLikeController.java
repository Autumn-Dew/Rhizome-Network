package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.CommentLikeQuery;
import org.example.rhizome_networkbackend.entity.po.CommentLike;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.CommentLikeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 评论点赞表 Controller
 */
@RestController("commentLikeController")
@RequestMapping("/commentLike")
public class CommentLikeController extends ABaseController{

	@Resource
	private CommentLikeService commentLikeService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(CommentLikeQuery query){
		return getSuccessResponseVO(commentLikeService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(CommentLike bean) {
		commentLikeService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<CommentLike> listBean) {
		commentLikeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CommentLike> listBean) {
		commentLikeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getCommentLikeById")
	public ResponseVO getCommentLikeById(Long id) {
		return getSuccessResponseVO(commentLikeService.getCommentLikeById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateCommentLikeById")
	public ResponseVO updateCommentLikeById(CommentLike bean,Long id) {
		commentLikeService.updateCommentLikeById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteCommentLikeById")
	public ResponseVO deleteCommentLikeById(Long id) {
		commentLikeService.deleteCommentLikeById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndCommentId查询对象
	 */
	@RequestMapping("/getCommentLikeByUserIdAndCommentId")
	public ResponseVO getCommentLikeByUserIdAndCommentId(Long userId,Long commentId) {
		return getSuccessResponseVO(commentLikeService.getCommentLikeByUserIdAndCommentId(userId,commentId));
	}

	/**
	 * 根据UserIdAndCommentId修改对象
	 */
	@RequestMapping("/updateCommentLikeByUserIdAndCommentId")
	public ResponseVO updateCommentLikeByUserIdAndCommentId(CommentLike bean,Long userId,Long commentId) {
		commentLikeService.updateCommentLikeByUserIdAndCommentId(bean,userId,commentId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndCommentId删除
	 */
	@RequestMapping("/deleteCommentLikeByUserIdAndCommentId")
	public ResponseVO deleteCommentLikeByUserIdAndCommentId(Long userId,Long commentId) {
		commentLikeService.deleteCommentLikeByUserIdAndCommentId(userId,commentId);
		return getSuccessResponseVO(null);
	}
}