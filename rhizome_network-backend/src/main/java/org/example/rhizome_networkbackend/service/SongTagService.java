package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.SongTagQuery;
import org.example.rhizome_networkbackend.entity.po.SongTag;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 歌曲标签关联表 业务接口
 */
public interface SongTagService {

	/**
	 * 根据条件查询列表
	 */
	List<SongTag> findListByParam(SongTagQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SongTagQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SongTag> findListByPage(SongTagQuery param);

	/**
	 * 新增
	 */
	Integer add(SongTag bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SongTag> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SongTag> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(SongTag bean,SongTagQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(SongTagQuery param);

	/**
	 * 根据Id查询对象
	 */
	SongTag getSongTagById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updateSongTagById(SongTag bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deleteSongTagById(Long id);

}