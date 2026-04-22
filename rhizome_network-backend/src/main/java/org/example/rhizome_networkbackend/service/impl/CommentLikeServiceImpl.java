package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.CommentLikeQuery;
import org.example.rhizome_networkbackend.entity.po.CommentLike;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.CommentLikeMapper;
import org.example.rhizome_networkbackend.service.CommentLikeService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 评论点赞表 业务接口实现
 */
@Service("commentLikeService")
public class CommentLikeServiceImpl implements CommentLikeService {

	@Resource
	private CommentLikeMapper<CommentLike, CommentLikeQuery> commentLikeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CommentLike> findListByParam(CommentLikeQuery param) {
		return this.commentLikeMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CommentLikeQuery param) {
		return this.commentLikeMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CommentLike> findListByPage(CommentLikeQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CommentLike> list = this.findListByParam(param);
		PaginationResultVO<CommentLike> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CommentLike bean) {
		return this.commentLikeMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CommentLike> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.commentLikeMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CommentLike> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.commentLikeMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(CommentLike bean, CommentLikeQuery param) {
		StringTools.checkParam(param);
		return this.commentLikeMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(CommentLikeQuery param) {
		StringTools.checkParam(param);
		return this.commentLikeMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public CommentLike getCommentLikeById(Long id) {
		return this.commentLikeMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateCommentLikeById(CommentLike bean, Long id) {
		return this.commentLikeMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteCommentLikeById(Long id) {
		return this.commentLikeMapper.deleteById(id);
	}

	/**
	 * 根据UserIdAndCommentId获取对象
	 */
	@Override
	public CommentLike getCommentLikeByUserIdAndCommentId(Long userId, Long commentId) {
		return this.commentLikeMapper.selectByUserIdAndCommentId(userId, commentId);
	}

	/**
	 * 根据UserIdAndCommentId修改
	 */
	@Override
	public Integer updateCommentLikeByUserIdAndCommentId(CommentLike bean, Long userId, Long commentId) {
		return this.commentLikeMapper.updateByUserIdAndCommentId(bean, userId, commentId);
	}

	/**
	 * 根据UserIdAndCommentId删除
	 */
	@Override
	public Integer deleteCommentLikeByUserIdAndCommentId(Long userId, Long commentId) {
		return this.commentLikeMapper.deleteByUserIdAndCommentId(userId, commentId);
	}
}