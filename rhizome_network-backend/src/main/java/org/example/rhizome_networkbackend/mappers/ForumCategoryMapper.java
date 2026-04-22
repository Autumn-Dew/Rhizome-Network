package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 论坛分类表 数据库操作接口
 */
public interface ForumCategoryMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据CategoryId更新
	 */
	 Integer updateByCategoryId(@Param("bean") T t,@Param("categoryId") Long categoryId);


	/**
	 * 根据CategoryId删除
	 */
	 Integer deleteByCategoryId(@Param("categoryId") Long categoryId);


	/**
	 * 根据CategoryId获取对象
	 */
	 T selectByCategoryId(@Param("categoryId") Long categoryId);


}
