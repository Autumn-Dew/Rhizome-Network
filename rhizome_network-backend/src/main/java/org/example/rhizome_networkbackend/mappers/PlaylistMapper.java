package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 歌单表 数据库操作接口
 */
public interface PlaylistMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据PlaylistId更新
	 */
	 Integer updateByPlaylistId(@Param("bean") T t,@Param("playlistId") Long playlistId);


	/**
	 * 根据PlaylistId删除
	 */
	 Integer deleteByPlaylistId(@Param("playlistId") Long playlistId);


	/**
	 * 根据PlaylistId获取对象
	 */
	 T selectByPlaylistId(@Param("playlistId") Long playlistId);


}
