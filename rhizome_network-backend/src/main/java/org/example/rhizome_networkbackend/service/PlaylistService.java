package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.PlaylistQuery;
import org.example.rhizome_networkbackend.entity.po.Playlist;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 歌单表 业务接口
 */
public interface PlaylistService {

	/**
	 * 根据条件查询列表
	 */
	List<Playlist> findListByParam(PlaylistQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(PlaylistQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Playlist> findListByPage(PlaylistQuery param);

	/**
	 * 新增
	 */
	Integer add(Playlist bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Playlist> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Playlist> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Playlist bean,PlaylistQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(PlaylistQuery param);

	/**
	 * 根据PlaylistId查询对象
	 */
	Playlist getPlaylistByPlaylistId(Long playlistId);


	/**
	 * 根据PlaylistId修改
	 */
	Integer updatePlaylistByPlaylistId(Playlist bean,Long playlistId);


	/**
	 * 根据PlaylistId删除
	 */
	Integer deletePlaylistByPlaylistId(Long playlistId);

}