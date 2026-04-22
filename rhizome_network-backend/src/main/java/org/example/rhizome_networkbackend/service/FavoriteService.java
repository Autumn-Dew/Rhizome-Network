package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.FavoriteQuery;
import org.example.rhizome_networkbackend.entity.po.Favorite;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 收藏表 业务接口
 */
public interface FavoriteService {

	/**
	 * 根据条件查询列表
	 */
	List<Favorite> findListByParam(FavoriteQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(FavoriteQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Favorite> findListByPage(FavoriteQuery param);

	/**
	 * 新增
	 */
	Integer add(Favorite bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Favorite> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Favorite> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Favorite bean,FavoriteQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(FavoriteQuery param);

	/**
	 * 根据Id查询对象
	 */
	Favorite getFavoriteById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updateFavoriteById(Favorite bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deleteFavoriteById(Long id);


	/**
	 * 根据UserIdAndTypeAndTargetKey查询对象
	 */
	Favorite getFavoriteByUserIdAndTypeAndTargetKey(Long userId,Integer type,String targetKey);


	/**
	 * 根据UserIdAndTypeAndTargetKey修改
	 */
	Integer updateFavoriteByUserIdAndTypeAndTargetKey(Favorite bean,Long userId,Integer type,String targetKey);


	/**
	 * 根据UserIdAndTypeAndTargetKey删除
	 */
	Integer deleteFavoriteByUserIdAndTypeAndTargetKey(Long userId,Integer type,String targetKey);

}