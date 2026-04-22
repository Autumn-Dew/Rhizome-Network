package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.FavoriteQuery;
import org.example.rhizome_networkbackend.entity.po.Favorite;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.FavoriteMapper;
import org.example.rhizome_networkbackend.service.FavoriteService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 收藏表 业务接口实现
 */
@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {

	@Resource
	private FavoriteMapper<Favorite, FavoriteQuery> favoriteMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Favorite> findListByParam(FavoriteQuery param) {
		return this.favoriteMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(FavoriteQuery param) {
		return this.favoriteMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Favorite> findListByPage(FavoriteQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Favorite> list = this.findListByParam(param);
		PaginationResultVO<Favorite> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Favorite bean) {
		return this.favoriteMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Favorite> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.favoriteMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Favorite> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.favoriteMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Favorite bean, FavoriteQuery param) {
		StringTools.checkParam(param);
		return this.favoriteMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(FavoriteQuery param) {
		StringTools.checkParam(param);
		return this.favoriteMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public Favorite getFavoriteById(Long id) {
		return this.favoriteMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateFavoriteById(Favorite bean, Long id) {
		return this.favoriteMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteFavoriteById(Long id) {
		return this.favoriteMapper.deleteById(id);
	}

	/**
	 * 根据UserIdAndTypeAndTargetKey获取对象
	 */
	@Override
	public Favorite getFavoriteByUserIdAndTypeAndTargetKey(Long userId, Integer type, String targetKey) {
		return this.favoriteMapper.selectByUserIdAndTypeAndTargetKey(userId, type, targetKey);
	}

	/**
	 * 根据UserIdAndTypeAndTargetKey修改
	 */
	@Override
	public Integer updateFavoriteByUserIdAndTypeAndTargetKey(Favorite bean, Long userId, Integer type, String targetKey) {
		return this.favoriteMapper.updateByUserIdAndTypeAndTargetKey(bean, userId, type, targetKey);
	}

	/**
	 * 根据UserIdAndTypeAndTargetKey删除
	 */
	@Override
	public Integer deleteFavoriteByUserIdAndTypeAndTargetKey(Long userId, Integer type, String targetKey) {
		return this.favoriteMapper.deleteByUserIdAndTypeAndTargetKey(userId, type, targetKey);
	}
}