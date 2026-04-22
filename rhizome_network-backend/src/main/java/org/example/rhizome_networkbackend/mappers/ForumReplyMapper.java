package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 论坛回复表 数据库操作接口
 */
public interface ForumReplyMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据ReplyId更新
	 */
	 Integer updateByReplyId(@Param("bean") T t,@Param("replyId") Long replyId);


	/**
	 * 根据ReplyId删除
	 */
	 Integer deleteByReplyId(@Param("replyId") Long replyId);


	/**
	 * 根据ReplyId获取对象
	 */
	 T selectByReplyId(@Param("replyId") Long replyId);


}
