package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.MomentQuery;
import org.example.rhizome_networkbackend.entity.po.Moment;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.MomentMapper;
import org.example.rhizome_networkbackend.service.MomentService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 用户动态表 业务接口实现
 */
@Service("momentService")
public class MomentServiceImpl implements MomentService {

	@Resource
	private MomentMapper<Moment, MomentQuery> momentMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Moment> findListByParam(MomentQuery param) {
		return this.momentMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(MomentQuery param) {
		return this.momentMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Moment> findListByPage(MomentQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Moment> list = this.findListByParam(param);
		PaginationResultVO<Moment> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Moment bean) {
		return this.momentMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Moment> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.momentMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Moment> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.momentMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Moment bean, MomentQuery param) {
		StringTools.checkParam(param);
		return this.momentMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(MomentQuery param) {
		StringTools.checkParam(param);
		return this.momentMapper.deleteByParam(param);
	}

	/**
	 * 根据MomentId获取对象
	 */
	@Override
	public Moment getMomentByMomentId(Long momentId) {
		return this.momentMapper.selectByMomentId(momentId);
	}

	/**
	 * 根据MomentId修改
	 */
	@Override
	public Integer updateMomentByMomentId(Moment bean, Long momentId) {
		return this.momentMapper.updateByMomentId(bean, momentId);
	}

	/**
	 * 根据MomentId删除
	 */
	@Override
	public Integer deleteMomentByMomentId(Long momentId) {
		return this.momentMapper.deleteByMomentId(momentId);
	}
}