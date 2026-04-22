package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.SongTagQuery;
import org.example.rhizome_networkbackend.entity.po.SongTag;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.SongTagMapper;
import org.example.rhizome_networkbackend.service.SongTagService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 歌曲标签关联表 业务接口实现
 */
@Service("songTagService")
public class SongTagServiceImpl implements SongTagService {

	@Resource
	private SongTagMapper<SongTag, SongTagQuery> songTagMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SongTag> findListByParam(SongTagQuery param) {
		return this.songTagMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SongTagQuery param) {
		return this.songTagMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SongTag> findListByPage(SongTagQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SongTag> list = this.findListByParam(param);
		PaginationResultVO<SongTag> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SongTag bean) {
		return this.songTagMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SongTag> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.songTagMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SongTag> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.songTagMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(SongTag bean, SongTagQuery param) {
		StringTools.checkParam(param);
		return this.songTagMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(SongTagQuery param) {
		StringTools.checkParam(param);
		return this.songTagMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public SongTag getSongTagById(Long id) {
		return this.songTagMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateSongTagById(SongTag bean, Long id) {
		return this.songTagMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteSongTagById(Long id) {
		return this.songTagMapper.deleteById(id);
	}
}