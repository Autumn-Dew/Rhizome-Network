package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.PlaylistQuery;
import org.example.rhizome_networkbackend.entity.po.Playlist;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.PlaylistService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 歌单表 Controller
 */
@RestController("playlistController")
@RequestMapping("/playlist")
public class PlaylistController extends ABaseController{

	@Resource
	private PlaylistService playlistService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(PlaylistQuery query){
		return getSuccessResponseVO(playlistService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Playlist bean) {
		playlistService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Playlist> listBean) {
		playlistService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Playlist> listBean) {
		playlistService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PlaylistId查询对象
	 */
	@RequestMapping("/getPlaylistByPlaylistId")
	public ResponseVO getPlaylistByPlaylistId(Long playlistId) {
		return getSuccessResponseVO(playlistService.getPlaylistByPlaylistId(playlistId));
	}

	/**
	 * 根据PlaylistId修改对象
	 */
	@RequestMapping("/updatePlaylistByPlaylistId")
	public ResponseVO updatePlaylistByPlaylistId(Playlist bean,Long playlistId) {
		playlistService.updatePlaylistByPlaylistId(bean,playlistId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PlaylistId删除
	 */
	@RequestMapping("/deletePlaylistByPlaylistId")
	public ResponseVO deletePlaylistByPlaylistId(Long playlistId) {
		playlistService.deletePlaylistByPlaylistId(playlistId);
		return getSuccessResponseVO(null);
	}
}