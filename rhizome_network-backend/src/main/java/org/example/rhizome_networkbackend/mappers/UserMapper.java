package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 用户表 数据库操作接口
 */
public interface UserMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据UserId更新
	 */
	 Integer updateByUserId(@Param("bean") T t,@Param("userId") Long userId);


	/**
	 * 根据UserId删除
	 */
	 Integer deleteByUserId(@Param("userId") Long userId);


	/**
	 * 根据UserId获取对象
	 */
	 T selectByUserId(@Param("userId") Long userId);


	/**
	 * 根据Account更新
	 */
	 Integer updateByAccount(@Param("bean") T t,@Param("account") String account);


	/**
	 * 根据Account删除
	 */
	 Integer deleteByAccount(@Param("account") String account);


	/**
	 * 根据Account获取对象
	 */
	 T selectByAccount(@Param("account") String account);


}
