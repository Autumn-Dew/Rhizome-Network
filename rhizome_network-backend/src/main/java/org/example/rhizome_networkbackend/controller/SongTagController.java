package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.SongTagQuery;
import org.example.rhizome_networkbackend.entity.po.SongTag;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.SongTagService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 歌曲标签关联表 Controller
 */
@RestController("songTagController")
@RequestMapping("/songTag")
public class SongTagController extends ABaseController{

	@Resource
	private SongTagService songTagService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(SongTagQuery query){
		return getSuccessResponseVO(songTagService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(SongTag bean) {
		songTagService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<SongTag> listBean) {
		songTagService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SongTag> listBean) {
		songTagService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getSongTagById")
	public ResponseVO getSongTagById(Long id) {
		return getSuccessResponseVO(songTagService.getSongTagById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updateSongTagById")
	public ResponseVO updateSongTagById(SongTag bean,Long id) {
		songTagService.updateSongTagById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteSongTagById")
	public ResponseVO deleteSongTagById(Long id) {
		songTagService.deleteSongTagById(id);
		return getSuccessResponseVO(null);
	}
}