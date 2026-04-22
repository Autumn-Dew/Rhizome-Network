package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 论坛帖子表 数据库操作接口
 */
public interface ForumPostMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据PostId更新
	 */
	 Integer updateByPostId(@Param("bean") T t,@Param("postId") Long postId);


	/**
	 * 根据PostId删除
	 */
	 Integer deleteByPostId(@Param("postId") Long postId);


	/**
	 * 根据PostId获取对象
	 */
	 T selectByPostId(@Param("postId") Long postId);


}
