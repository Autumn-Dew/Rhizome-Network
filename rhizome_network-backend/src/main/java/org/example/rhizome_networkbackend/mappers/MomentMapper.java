package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 用户动态表 数据库操作接口
 */
public interface MomentMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据MomentId更新
	 */
	 Integer updateByMomentId(@Param("bean") T t,@Param("momentId") Long momentId);


	/**
	 * 根据MomentId删除
	 */
	 Integer deleteByMomentId(@Param("momentId") Long momentId);


	/**
	 * 根据MomentId获取对象
	 */
	 T selectByMomentId(@Param("momentId") Long momentId);


}
