package org.example.rhizome_networkbackend.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 歌曲标签表 数据库操作接口
 */
public interface TagMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据TagId更新
	 */
	 Integer updateByTagId(@Param("bean") T t,@Param("tagId") Long tagId);


	/**
	 * 根据TagId删除
	 */
	 Integer deleteByTagId(@Param("tagId") Long tagId);


	/**
	 * 根据TagId获取对象
	 */
	 T selectByTagId(@Param("tagId") Long tagId);


	/**
	 * 根据TagName更新
	 */
	 Integer updateByTagName(@Param("bean") T t,@Param("tagName") String tagName);


	/**
	 * 根据TagName删除
	 */
	 Integer deleteByTagName(@Param("tagName") String tagName);


	/**
	 * 根据TagName获取对象
	 */
	 T selectByTagName(@Param("tagName") String tagName);


}
