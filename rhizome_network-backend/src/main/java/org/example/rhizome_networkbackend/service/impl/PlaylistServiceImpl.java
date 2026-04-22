package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.PlaylistQuery;
import org.example.rhizome_networkbackend.entity.po.Playlist;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.PlaylistMapper;
import org.example.rhizome_networkbackend.service.PlaylistService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 歌单表 业务接口实现
 */
@Service("playlistService")
public class PlaylistServiceImpl implements PlaylistService {

	@Resource
	private PlaylistMapper<Playlist, PlaylistQuery> playlistMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Playlist> findListByParam(PlaylistQuery param) {
		return this.playlistMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(PlaylistQuery param) {
		return this.playlistMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Playlist> findListByPage(PlaylistQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Playlist> list = this.findListByParam(param);
		PaginationResultVO<Playlist> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Playlist bean) {
		return this.playlistMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Playlist> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.playlistMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Playlist> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.playlistMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Playlist bean, PlaylistQuery param) {
		StringTools.checkParam(param);
		return this.playlistMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(PlaylistQuery param) {
		StringTools.checkParam(param);
		return this.playlistMapper.deleteByParam(param);
	}

	/**
	 * 根据PlaylistId获取对象
	 */
	@Override
	public Playlist getPlaylistByPlaylistId(Long playlistId) {
		return this.playlistMapper.selectByPlaylistId(playlistId);
	}

	/**
	 * 根据PlaylistId修改
	 */
	@Override
	public Integer updatePlaylistByPlaylistId(Playlist bean, Long playlistId) {
		return this.playlistMapper.updateByPlaylistId(bean, playlistId);
	}

	/**
	 * 根据PlaylistId删除
	 */
	@Override
	public Integer deletePlaylistByPlaylistId(Long playlistId) {
		return this.playlistMapper.deleteByPlaylistId(playlistId);
	}
}