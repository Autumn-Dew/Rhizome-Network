package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 播放记录表 数据库操作接口
 */
public interface PlayRecordMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据Id更新
	 */
	 Integer updateById(@Param("bean") T t,@Param("id") Long id);


	/**
	 * 根据Id删除
	 */
	 Integer deleteById(@Param("id") Long id);


	/**
	 * 根据Id获取对象
	 */
	 T selectById(@Param("id") Long id);


	/**
	 * 根据UserIdAndSongkey更新
	 */
	 Integer updateByUserIdAndSongkey(@Param("bean") T t,@Param("userId") Long userId,@Param("songkey") String songkey);


	/**
	 * 根据UserIdAndSongkey删除
	 */
	 Integer deleteByUserIdAndSongkey(@Param("userId") Long userId,@Param("songkey") String songkey);


	/**
	 * 根据UserIdAndSongkey获取对象
	 */
	 T selectByUserIdAndSongkey(@Param("userId") Long userId,@Param("songkey") String songkey);


}
