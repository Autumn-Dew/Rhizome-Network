package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.SongQuery;
import org.example.rhizome_networkbackend.entity.po.Song;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 歌曲信息表 业务接口
 */
public interface SongService {

	/**
	 * 根据条件查询列表
	 */
	List<Song> findListByParam(SongQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SongQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Song> findListByPage(SongQuery param);

	/**
	 * 新增
	 */
	Integer add(Song bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Song> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Song> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Song bean,SongQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(SongQuery param);

	/**
	 * 根据SongId查询对象
	 */
	Song getSongBySongId(Long songId);


	/**
	 * 根据SongId修改
	 */
	Integer updateSongBySongId(Song bean,Long songId);


	/**
	 * 根据SongId删除
	 */
	Integer deleteSongBySongId(Long songId);


	/**
	 * 根据Songkey查询对象
	 */
	Song getSongBySongkey(String songkey);


	/**
	 * 根据Songkey修改
	 */
	Integer updateSongBySongkey(Song bean,String songkey);


	/**
	 * 根据Songkey删除
	 */
	Integer deleteSongBySongkey(String songkey);

}