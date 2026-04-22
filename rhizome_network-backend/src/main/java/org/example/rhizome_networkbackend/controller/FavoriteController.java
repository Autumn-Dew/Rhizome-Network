package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.FavoriteQuery;
import org.example.rhizome_networkbackend.entity.po.Favorite;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.FavoriteService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 收藏表 Controller
 */
@RestController("favoriteController")
@RequestMapping("/favorite")
public class FavoriteController extends ABaseController{

	@Resource
	private FavoriteService favoriteService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(FavoriteQuery query){
		return getSuccessResponseVO(favoriteService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Favorite bean) {
		favoriteService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Favorite> listBean) {
		favoriteService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Favorite> listBean) {
		favoriteService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getFavoriteById")
	public ResponseVO getFavoriteById(Long id) {
		return getSuccessResponseVO(favoriteService.getFavoriteById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateFavoriteById")
	public ResponseVO updateFavoriteById(Favorite bean,Long id) {
		favoriteService.updateFavoriteById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteFavoriteById")
	public ResponseVO deleteFavoriteById(Long id) {
		favoriteService.deleteFavoriteById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndTypeAndTargetKey查询对象
	 */
	@RequestMapping("/getFavoriteByUserIdAndTypeAndTargetKey")
	public ResponseVO getFavoriteByUserIdAndTypeAndTargetKey(Long userId,Integer type,String targetKey) {
		return getSuccessResponseVO(favoriteService.getFavoriteByUserIdAndTypeAndTargetKey(userId,type,targetKey));
	}

	/**
	 * 根据UserIdAndTypeAndTargetKey修改对象
	 */
	@RequestMapping("/updateFavoriteByUserIdAndTypeAndTargetKey")
	public ResponseVO updateFavoriteByUserIdAndTypeAndTargetKey(Favorite bean,Long userId,Integer type,String targetKey) {
		favoriteService.updateFavoriteByUserIdAndTypeAndTargetKey(bean,userId,type,targetKey);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndTypeAndTargetKey删除
	 */
	@RequestMapping("/deleteFavoriteByUserIdAndTypeAndTargetKey")
	public ResponseVO deleteFavoriteByUserIdAndTypeAndTargetKey(Long userId,Integer type,String targetKey) {
		favoriteService.deleteFavoriteByUserIdAndTypeAndTargetKey(userId,type,targetKey);
		return getSuccessResponseVO(null);
	}
}