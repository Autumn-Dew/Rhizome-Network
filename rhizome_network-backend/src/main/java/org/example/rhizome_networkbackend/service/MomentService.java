package org.example.rhizome_networkbackend.service;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.MomentQuery;
import org.example.rhizome_networkbackend.entity.po.Moment;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;


/**
 * 用户动态表 业务接口
 */
public interface MomentService {

	/**
	 * 根据条件查询列表
	 */
	List<Moment> findListByParam(MomentQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(MomentQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Moment> findListByPage(MomentQuery param);

	/**
	 * 新增
	 */
	Integer add(Moment bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Moment> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Moment> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Moment bean,MomentQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(MomentQuery param);

	/**
	 * 根据MomentId查询对象
	 */
	Moment getMomentByMomentId(Long momentId);


	/**
	 * 根据MomentId修改
	 */
	Integer updateMomentByMomentId(Moment bean,Long momentId);


	/**
	 * 根据MomentId删除
	 */
	Integer deleteMomentByMomentId(Long momentId);

}