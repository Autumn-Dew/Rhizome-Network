package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.PlaylistSongQuery;
import org.example.rhizome_networkbackend.entity.po.PlaylistSong;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 歌单歌曲关联表 业务接口
 */
public interface PlaylistSongService {

	/**
	 * 根据条件查询列表
	 */
	List<PlaylistSong> findListByParam(PlaylistSongQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(PlaylistSongQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<PlaylistSong> findListByPage(PlaylistSongQuery param);

	/**
	 * 新增
	 */
	Integer add(PlaylistSong bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<PlaylistSong> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<PlaylistSong> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(PlaylistSong bean,PlaylistSongQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(PlaylistSongQuery param);

	/**
	 * 根据Id查询对象
	 */
	PlaylistSong getPlaylistSongById(Long id);


	/**
	 * 根据Id修改
	 */
	Integer updatePlaylistSongById(PlaylistSong bean,Long id);


	/**
	 * 根据Id删除
	 */
	Integer deletePlaylistSongById(Long id);

}