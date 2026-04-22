package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.CommentQuery;
import org.example.rhizome_networkbackend.entity.po.Comment;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.CommentMapper;
import org.example.rhizome_networkbackend.service.CommentService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 歌曲评论表 业务接口实现
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Resource
	private CommentMapper<Comment, CommentQuery> commentMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Comment> findListByParam(CommentQuery param) {
		return this.commentMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CommentQuery param) {
		return this.commentMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Comment> findListByPage(CommentQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Comment> list = this.findListByParam(param);
		PaginationResultVO<Comment> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Comment bean) {
		return this.commentMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Comment> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.commentMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Comment> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.commentMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Comment bean, CommentQuery param) {
		StringTools.checkParam(param);
		return this.commentMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(CommentQuery param) {
		StringTools.checkParam(param);
		return this.commentMapper.deleteByParam(param);
	}

	/**
	 * 根据CommentId获取对象
	 */
	@Override
	public Comment getCommentByCommentId(Long commentId) {
		return this.commentMapper.selectByCommentId(commentId);
	}

	/**
	 * 根据CommentId修改
	 */
	@Override
	public Integer updateCommentByCommentId(Comment bean, Long commentId) {
		return this.commentMapper.updateByCommentId(bean, commentId);
	}

	/**
	 * 根据CommentId删除
	 */
	@Override
	public Integer deleteCommentByCommentId(Long commentId) {
		return this.commentMapper.deleteByCommentId(commentId);
	}
}