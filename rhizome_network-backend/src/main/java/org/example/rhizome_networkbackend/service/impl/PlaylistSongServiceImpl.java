package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.PlaylistSongQuery;
import org.example.rhizome_networkbackend.entity.po.PlaylistSong;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.PlaylistSongMapper;
import org.example.rhizome_networkbackend.service.PlaylistSongService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 歌单歌曲关联表 业务接口实现
 */
@Service("playlistSongService")
public class PlaylistSongServiceImpl implements PlaylistSongService {

	@Resource
	private PlaylistSongMapper<PlaylistSong, PlaylistSongQuery> playlistSongMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<PlaylistSong> findListByParam(PlaylistSongQuery param) {
		return this.playlistSongMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(PlaylistSongQuery param) {
		return this.playlistSongMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<PlaylistSong> findListByPage(PlaylistSongQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<PlaylistSong> list = this.findListByParam(param);
		PaginationResultVO<PlaylistSong> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(PlaylistSong bean) {
		return this.playlistSongMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<PlaylistSong> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.playlistSongMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<PlaylistSong> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.playlistSongMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(PlaylistSong bean, PlaylistSongQuery param) {
		StringTools.checkParam(param);
		return this.playlistSongMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(PlaylistSongQuery param) {
		StringTools.checkParam(param);
		return this.playlistSongMapper.deleteByParam(param);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public PlaylistSong getPlaylistSongById(Long id) {
		return this.playlistSongMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updatePlaylistSongById(PlaylistSong bean, Long id) {
		return this.playlistSongMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deletePlaylistSongById(Long id) {
		return this.playlistSongMapper.deleteById(id);
	}
}