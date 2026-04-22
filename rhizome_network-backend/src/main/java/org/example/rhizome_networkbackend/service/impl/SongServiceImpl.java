package org.example.rhizome_networkbackend.service.impl;

import java.util.List;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import org.example.rhizome_networkbackend.entity.enums.PageSize;
import org.example.rhizome_networkbackend.entity.query.SongQuery;
import org.example.rhizome_networkbackend.entity.po.Song;
import org.example.rhizome_networkbackend.entity.vo.PaginationResultVO;
import org.example.rhizome_networkbackend.entity.query.SimplePage;
import org.example.rhizome_networkbackend.mappers.SongMapper;
import org.example.rhizome_networkbackend.service.SongService;
import org.example.rhizome_networkbackend.utils.StringTools;


/**
 * 歌曲信息表 业务接口实现
 */
@Service("songService")
public class SongServiceImpl implements SongService {

	@Resource
	private SongMapper<Song, SongQuery> songMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Song> findListByParam(SongQuery param) {
		return this.songMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SongQuery param) {
		return this.songMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Song> findListByPage(SongQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Song> list = this.findListByParam(param);
		PaginationResultVO<Song> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Song bean) {
		return this.songMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Song> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.songMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Song> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.songMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Song bean, SongQuery param) {
		StringTools.checkParam(param);
		return this.songMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(SongQuery param) {
		StringTools.checkParam(param);
		return this.songMapper.deleteByParam(param);
	}

	/**
	 * 根据SongId获取对象
	 */
	@Override
	public Song getSongBySongId(Long songId) {
		return this.songMapper.selectBySongId(songId);
	}

	/**
	 * 根据SongId修改
	 */
	@Override
	public Integer updateSongBySongId(Song bean, Long songId) {
		return this.songMapper.updateBySongId(bean, songId);
	}

	/**
	 * 根据SongId删除
	 */
	@Override
	public Integer deleteSongBySongId(Long songId) {
		return this.songMapper.deleteBySongId(songId);
	}

	/**
	 * 根据Songkey获取对象
	 */
	@Override
	public Song getSongBySongkey(String songkey) {
		return this.songMapper.selectBySongkey(songkey);
	}

	/**
	 * 根据Songkey修改
	 */
	@Override
	public Integer updateSongBySongkey(Song bean, String songkey) {
		return this.songMapper.updateBySongkey(bean, songkey);
	}

	/**
	 * 根据Songkey删除
	 */
	@Override
	public Integer deleteSongBySongkey(String songkey) {
		return this.songMapper.deleteBySongkey(songkey);
	}
}