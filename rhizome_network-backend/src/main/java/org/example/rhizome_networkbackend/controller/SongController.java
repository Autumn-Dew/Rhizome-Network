package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.SongQuery;
import org.example.rhizome_networkbackend.entity.po.Song;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.SongService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 歌曲信息表 Controller
 */
@RestController("songController")
@RequestMapping("/song")
public class SongController extends ABaseController{

	@Resource
	private SongService songService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(SongQuery query){
		return getSuccessResponseVO(songService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Song bean) {
		songService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Song> listBean) {
		songService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Song> listBean) {
		songService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据SongId查询对象
	 */
	@RequestMapping("/getSongBySongId")
	public ResponseVO getSongBySongId(Long songId) {
		return getSuccessResponseVO(songService.getSongBySongId(songId));
	}

	/**
	 * 根据SongId修改对象
	 */
	@RequestMapping("/updateSongBySongId")
	public ResponseVO updateSongBySongId(Song bean,Long songId) {
		songService.updateSongBySongId(bean,songId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据SongId删除
	 */
	@RequestMapping("/deleteSongBySongId")
	public ResponseVO deleteSongBySongId(Long songId) {
		songService.deleteSongBySongId(songId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Songkey查询对象
	 */
	@RequestMapping("/getSongBySongkey")
	public ResponseVO getSongBySongkey(String songkey) {
		return getSuccessResponseVO(songService.getSongBySongkey(songkey));
	}

	/**
	 * 根据Songkey修改对象
	 */
	@RequestMapping("/updateSongBySongkey")
	public ResponseVO updateSongBySongkey(Song bean,String songkey) {
		songService.updateSongBySongkey(bean,songkey);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Songkey删除
	 */
	@RequestMapping("/deleteSongBySongkey")
	public ResponseVO deleteSongBySongkey(String songkey) {
		songService.deleteSongBySongkey(songkey);
		return getSuccessResponseVO(null);
	}
}