package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.PlayRecordQuery;
import org.example.rhizome_networkbackend.entity.po.PlayRecord;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 播放记录表 业务接口
 */
public interface PlayRecordService {

	/**
	 * 根据条件查询列表
	 */
	List<PlayRecord> findListByParam(PlayRecordQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(PlayRecordQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<PlayRecord> findListByPage(PlayRecordQuery param);

	/**
	 * 新增
	 */
	Integer add(PlayRecord bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<PlayRecord> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<PlayRecord> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(PlayRecord bean,PlayRecordQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(PlayRecordQuery param);

	/**
	 * 根据Id查询对象
	 */
	PlayRecord getPlayRecordById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updatePlayRecordById(PlayRecord bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deletePlayRecordById(Long id);


	/**
	 * 根据UserIdAndSongkey查询对象
	 */
	PlayRecord getPlayRecordByUserIdAndSongkey(Long userId,String songkey);


	/**
	 * 根据UserIdAndSongkey修改
	 */
	Integer updatePlayRecordByUserIdAndSongkey(PlayRecord bean,Long userId,String songkey);


	/**
	 * 根据UserIdAndSongkey删除
	 */
	Integer deletePlayRecordByUserIdAndSongkey(Long userId,String songkey);

}