package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.FollowQuery;
import org.example.rhizome_networkbackend.entity.po.Follow;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.FollowService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 用户关注表 Controller
 */
@RestController("followController")
@RequestMapping("/follow")
public class FollowController extends ABaseController{

	@Resource
	private FollowService followService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(FollowQuery query){
		return getSuccessResponseVO(followService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Follow bean) {
		followService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Follow> listBean) {
		followService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Follow> listBean) {
		followService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getFollowById")
	public ResponseVO getFollowById(Long id) {
		return getSuccessResponseVO(followService.getFollowById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateFollowById")
	public ResponseVO updateFollowById(Follow bean,Long id) {
		followService.updateFollowById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteFollowById")
	public ResponseVO deleteFollowById(Long id) {
		followService.deleteFollowById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndFollowedUid查询对象
	 */
	@RequestMapping("/getFollowByUserIdAndFollowedUid")
	public ResponseVO getFollowByUserIdAndFollowedUid(Long userId,Long followedUid) {
		return getSuccessResponseVO(followService.getFollowByUserIdAndFollowedUid(userId,followedUid));
	}

	/**
	 * 根据UserIdAndFollowedUid修改对象
	 */
	@RequestMapping("/updateFollowByUserIdAndFollowedUid")
	public ResponseVO updateFollowByUserIdAndFollowedUid(Follow bean,Long userId,Long followedUid) {
		followService.updateFollowByUserIdAndFollowedUid(bean,userId,followedUid);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndFollowedUid删除
	 */
	@RequestMapping("/deleteFollowByUserIdAndFollowedUid")
	public ResponseVO deleteFollowByUserIdAndFollowedUid(Long userId,Long followedUid) {
		followService.deleteFollowByUserIdAndFollowedUid(userId,followedUid);
		return getSuccessResponseVO(null);
	}
}