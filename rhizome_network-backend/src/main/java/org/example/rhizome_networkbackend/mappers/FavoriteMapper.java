package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 收藏表 数据库操作接口
 */
public interface FavoriteMapper<T,P> extends BaseMapper<T,P> {

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
	 * 根据UserIdAndTypeAndTargetKey更新
	 */
	 Integer updateByUserIdAndTypeAndTargetKey(@Param("bean") T t,@Param("userId") Long userId,@Param("type") Integer type,@Param("targetKey") String targetKey);


	/**
	 * 根据UserIdAndTypeAndTargetKey删除
	 */
	 Integer deleteByUserIdAndTypeAndTargetKey(@Param("userId") Long userId,@Param("type") Integer type,@Param("targetKey") String targetKey);


	/**
	 * 根据UserIdAndTypeAndTargetKey获取对象
	 */
	 T selectByUserIdAndTypeAndTargetKey(@Param("userId") Long userId,@Param("type") Integer type,@Param("targetKey") String targetKey);


}
