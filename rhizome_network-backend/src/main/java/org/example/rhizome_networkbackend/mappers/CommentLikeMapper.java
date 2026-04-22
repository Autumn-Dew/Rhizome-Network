package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 评论点赞表 数据库操作接口
 */
public interface CommentLikeMapper<T,P> extends BaseMapper<T,P> {

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
	 * 根据UserIdAndCommentId更新
	 */
	 Integer updateByUserIdAndCommentId(@Param("bean") T t,@Param("userId") Long userId,@Param("commentId") Long commentId);


	/**
	 * 根据UserIdAndCommentId删除
	 */
	 Integer deleteByUserIdAndCommentId(@Param("userId") Long userId,@Param("commentId") Long commentId);


	/**
	 * 根据UserIdAndCommentId获取对象
	 */
	 T selectByUserIdAndCommentId(@Param("userId") Long userId,@Param("commentId") Long commentId);


}
