package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.FollowQuery;
import org.example.rhizome_networkbackend.entity.po.Follow;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.FollowMapper;
import org.example.rhizome_networkbackend.service.FollowService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 用户关注表 业务接口实现
 */
@Service("followService")
public class FollowServiceImpl implements FollowService {

	@Resource
	private FollowMapper<Follow, FollowQuery> followMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Follow> findListByParam(FollowQuery param) {
		return this.followMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(FollowQuery param) {
		return this.followMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Follow> findListByPage(FollowQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Follow> list = this.findListByParam(param);
		PaginationResultVO<Follow> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Follow bean) {
		return this.followMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Follow> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.followMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Follow> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.followMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Follow bean, FollowQuery param) {
		StringTools.checkParam(param);
		return this.followMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(FollowQuery param) {
		StringTools.checkParam(param);
		return this.followMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public Follow getFollowById(Long id) {
		return this.followMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateFollowById(Follow bean, Long id) {
		return this.followMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteFollowById(Long id) {
		return this.followMapper.deleteById(id);
	}

	/**
	 * 根据UserIdAndFollowedUid获取对象
	 */
	@Override
	public Follow getFollowByUserIdAndFollowedUid(Long userId, Long followedUid) {
		return this.followMapper.selectByUserIdAndFollowedUid(userId, followedUid);
	}

	/**
	 * 根据UserIdAndFollowedUid修改
	 */
	@Override
	public Integer updateFollowByUserIdAndFollowedUid(Follow bean, Long userId, Long followedUid) {
		return this.followMapper.updateByUserIdAndFollowedUid(bean, userId, followedUid);
	}

	/**
	 * 根据UserIdAndFollowedUid删除
	 */
	@Override
	public Integer deleteFollowByUserIdAndFollowedUid(Long userId, Long followedUid) {
		return this.followMapper.deleteByUserIdAndFollowedUid(userId, followedUid);
	}
}