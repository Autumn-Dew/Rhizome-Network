package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.PlayRecordQuery;
import org.example.rhizome_networkbackend.entity.po.PlayRecord;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.PlayRecordService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 播放记录表 Controller
 */
@RestController("playRecordController")
@RequestMapping("/playRecord")
public class PlayRecordController extends ABaseController{

	@Resource
	private PlayRecordService playRecordService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(PlayRecordQuery query){
		return getSuccessResponseVO(playRecordService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(PlayRecord bean) {
		playRecordService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<PlayRecord> listBean) {
		playRecordService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<PlayRecord> listBean) {
		playRecordService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("/getPlayRecordById")
	public ResponseVO getPlayRecordById(Long id) {
		return getSuccessResponseVO(playRecordService.getPlayRecordById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("/updatePlayRecordById")
	public ResponseVO updatePlayRecordById(PlayRecord bean,Long id) {
		playRecordService.updatePlayRecordById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deletePlayRecordById")
	public ResponseVO deletePlayRecordById(Long id) {
		playRecordService.deletePlayRecordById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndSongkey查询对象
	 */
	@RequestMapping("/getPlayRecordByUserIdAndSongkey")
	public ResponseVO getPlayRecordByUserIdAndSongkey(Long userId,String songkey) {
		return getSuccessResponseVO(playRecordService.getPlayRecordByUserIdAndSongkey(userId,songkey));
	}

	/**
	 * 根据UserIdAndSongkey修改对象
	 */
	@RequestMapping("/updatePlayRecordByUserIdAndSongkey")
	public ResponseVO updatePlayRecordByUserIdAndSongkey(PlayRecord bean,Long userId,String songkey) {
		playRecordService.updatePlayRecordByUserIdAndSongkey(bean,userId,songkey);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndSongkey删除
	 */
	@RequestMapping("/deletePlayRecordByUserIdAndSongkey")
	public ResponseVO deletePlayRecordByUserIdAndSongkey(Long userId,String songkey) {
		playRecordService.deletePlayRecordByUserIdAndSongkey(userId,songkey);
		return getSuccessResponseVO(null);
	}
}