package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 用户关注表 数据库操作接口
 */
public interface FollowMapper<T,P> extends BaseMapper<T,P> {

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
	 * 根据UserIdAndFollowedUid更新
	 */
	 Integer updateByUserIdAndFollowedUid(@Param("bean") T t,@Param("userId") Long userId,@Param("followedUid") Long followedUid);


	/**
	 * 根据UserIdAndFollowedUid删除
	 */
	 Integer deleteByUserIdAndFollowedUid(@Param("userId") Long userId,@Param("followedUid") Long followedUid);


	/**
	 * 根据UserIdAndFollowedUid获取对象
	 */
	 T selectByUserIdAndFollowedUid(@Param("userId") Long userId,@Param("followedUid") Long followedUid);


}
