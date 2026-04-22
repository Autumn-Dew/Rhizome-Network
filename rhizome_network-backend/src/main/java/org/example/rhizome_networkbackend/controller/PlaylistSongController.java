package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.PlaylistSongQuery;
import org.example.rhizome_networkbackend.entity.po.PlaylistSong;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.PlaylistSongService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 歌单歌曲关联表 Controller
 */
@RestController("playlistSongController")
@RequestMapping("/playlistSong")
public class PlaylistSongController extends ABaseController{

	@Resource
	private PlaylistSongService playlistSongService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(PlaylistSongQuery query){
		return getSuccessResponseVO(playlistSongService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(PlaylistSong bean) {
		playlistSongService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<PlaylistSong> listBean) {
		playlistSongService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<PlaylistSong> listBean) {
		playlistSongService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getPlaylistSongById")
	public ResponseVO getPlaylistSongById(Long id) {
		return getSuccessResponseVO(playlistSongService.getPlaylistSongById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updatePlaylistSongById")
	public ResponseVO updatePlaylistSongById(PlaylistSong bean,Long id) {
		playlistSongService.updatePlaylistSongById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deletePlaylistSongById")
	public ResponseVO deletePlaylistSongById(Long id) {
		playlistSongService.deletePlaylistSongById(id);
		return getSuccessResponseVO(null);
	}
}