package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.MomentQuery;
import org.example.rhizome_networkbackend.entity.po.Moment;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.MomentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 用户动态表 Controller
 */
@RestController("momentController")
@RequestMapping("/moment")
public class MomentController extends ABaseController{

    @Resource
    private MomentService momentService;
    /**
     * 根据条件分页查询
     */
    @RequestMapping("/loadDataList")
    public ResponseVO loadDataList(MomentQuery query){
        return getSuccessResponseVO(momentService.findListByPage(query));
    }

    /**
     * 新增
     */
    @RequestMapping("/add")
    public ResponseVO add(Moment bean) {
        momentService.add(bean);
        return getSuccessResponseVO(null);
    }

    /**
     * 批量新增
     */
    @RequestMapping("/addBatch")
    public ResponseVO addBatch(@RequestBody List<Moment> listBean) {
        momentService.addBatch(listBean);
        return getSuccessResponseVO(null);
    }

    /**
     * 批量新增/修改
     */
    @RequestMapping("/addOrUpdateBatch")
    public ResponseVO addOrUpdateBatch(@RequestBody List<Moment> listBean) {
        momentService.addBatch(listBean);
        return getSuccessResponseVO(null);
    }

    /**
     * 根据MomentId查询对象
     */
    @RequestMapping("/getMomentByMomentId")
    public ResponseVO getMomentByMomentId(Long momentId) {
        return getSuccessResponseVO(momentService.getMomentByMomentId(momentId));
    }

    /**
     * 根据MomentId修改对象
     */
    @RequestMapping("/updateMomentByMomentId")
    public ResponseVO updateMomentByMomentId(Moment bean,Long momentId) {
        momentService.updateMomentByMomentId(bean,momentId);
        return getSuccessResponseVO(null);
    }

    /**
     * 根据MomentId删除
     */
    @RequestMapping("/deleteMomentByMomentId")
    public ResponseVO deleteMomentByMomentId(Long momentId) {
        momentService.deleteMomentByMomentId(momentId);
        return getSuccessResponseVO(null);
    }
}