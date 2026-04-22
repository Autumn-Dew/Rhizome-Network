package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 回复点赞表 数据库操作接口
 */
public interface ForumReplyLikeMapper<T,P> extends BaseMapper<T,P> {

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
	 * 根据UserIdAndReplyId更新
	 */
	 Integer updateByUserIdAndReplyId(@Param("bean") T t,@Param("userId") Long userId,@Param("replyId") Long replyId);


	/**
	 * 根据UserIdAndReplyId删除
	 */
	 Integer deleteByUserIdAndReplyId(@Param("userId") Long userId,@Param("replyId") Long replyId);


	/**
	 * 根据UserIdAndReplyId获取对象
	 */
	 T selectByUserIdAndReplyId(@Param("userId") Long userId,@Param("replyId") Long replyId);


}
