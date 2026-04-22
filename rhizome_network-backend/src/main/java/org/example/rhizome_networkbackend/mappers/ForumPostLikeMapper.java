package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 帖子点赞表 数据库操作接口
 */
public interface ForumPostLikeMapper<T,P> extends BaseMapper<T,P> {

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
	 * 根据UserIdAndPostId更新
	 */
	 Integer updateByUserIdAndPostId(@Param("bean") T t,@Param("userId") Long userId,@Param("postId") Long postId);


	/**
	 * 根据UserIdAndPostId删除
	 */
	 Integer deleteByUserIdAndPostId(@Param("userId") Long userId,@Param("postId") Long postId);


	/**
	 * 根据UserIdAndPostId获取对象
	 */
	 T selectByUserIdAndPostId(@Param("userId") Long userId,@Param("postId") Long postId);


}
