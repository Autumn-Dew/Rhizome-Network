package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.PlayRecordQuery;
import org.example.rhizome_networkbackend.entity.po.PlayRecord;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.PlayRecordMapper;
import org.example.rhizome_networkbackend.service.PlayRecordService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 播放记录表 业务接口实现
 */
@Service("playRecordService")
public class PlayRecordServiceImpl implements PlayRecordService {

	@Resource
	private PlayRecordMapper<PlayRecord, PlayRecordQuery> playRecordMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<PlayRecord> findListByParam(PlayRecordQuery param) {
		return this.playRecordMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(PlayRecordQuery param) {
		return this.playRecordMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<PlayRecord> findListByPage(PlayRecordQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<PlayRecord> list = this.findListByParam(param);
		PaginationResultVO<PlayRecord> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(PlayRecord bean) {
		return this.playRecordMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<PlayRecord> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.playRecordMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<PlayRecord> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.playRecordMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(PlayRecord bean, PlayRecordQuery param) {
		StringTools.checkParam(param);
		return this.playRecordMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(PlayRecordQuery param) {
		StringTools.checkParam(param);
		return this.playRecordMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public PlayRecord getPlayRecordById(Long id) {
		return this.playRecordMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updatePlayRecordById(PlayRecord bean, Long id) {
		return this.playRecordMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deletePlayRecordById(Long id) {
		return this.playRecordMapper.deleteById(id);
	}

	/**
	 * 根据UserIdAndSongkey获取对象
	 */
	@Override
	public PlayRecord getPlayRecordByUserIdAndSongkey(Long userId, String songkey) {
		return this.playRecordMapper.selectByUserIdAndSongkey(userId, songkey);
	}

	/**
	 * 根据UserIdAndSongkey修改
	 */
	@Override
	public Integer updatePlayRecordByUserIdAndSongkey(PlayRecord bean, Long userId, String songkey) {
		return this.playRecordMapper.updateByUserIdAndSongkey(bean, userId, songkey);
	}

	/**
	 * 根据UserIdAndSongkey删除
	 */
	@Override
	public Integer deletePlayRecordByUserIdAndSongkey(Long userId, String songkey) {
		return this.playRecordMapper.deleteByUserIdAndSongkey(userId, songkey);
	}
}