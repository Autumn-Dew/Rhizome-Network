package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 歌曲信息表 数据库操作接口
 */
public interface SongMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据SongId更新
	 */
	 Integer updateBySongId(@Param("bean") T t,@Param("songId") Long songId);


	/**
	 * 根据SongId删除
	 */
	 Integer deleteBySongId(@Param("songId") Long songId);


	/**
	 * 根据SongId获取对象
	 */
	 T selectBySongId(@Param("songId") Long songId);


	/**
	 * 根据Songkey更新
	 */
	 Integer updateBySongkey(@Param("bean") T t,@Param("songkey") String songkey);


	/**
	 * 根据Songkey删除
	 */
	 Integer deleteBySongkey(@Param("songkey") String songkey);


	/**
	 * 根据Songkey获取对象
	 */
	 T selectBySongkey(@Param("songkey") String songkey);


}
