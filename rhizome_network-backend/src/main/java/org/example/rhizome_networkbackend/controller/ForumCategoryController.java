package org.example.rhizome_networkbackend.controller;

import java.util.List;

import org.example.rhizome_networkbackend.entity.query.ForumCategoryQuery;
import org.example.rhizome_networkbackend.entity.po.ForumCategory;
import org.example.rhizome_networkbackend.entity.vo.ResponseVO;
import org.example.rhizome_networkbackend.service.ForumCategoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * 论坛分类表 Controller
 */
@RestController("forumCategoryController")
@RequestMapping("/forumCategory")
public class ForumCategoryController extends ABaseController{

    @Resource
    private ForumCategoryService forumCategoryService;
    /**
     * 根据条件分页查询
     */
    @RequestMapping("/loadDataList")
    public ResponseVO loadDataList(ForumCategoryQuery query){
        return getSuccessResponseVO(forumCategoryService.findListByPage(query));
    }

    /**
     * 新增
     */
    @RequestMapping("/add")
    public ResponseVO add(ForumCategory bean) {
        forumCategoryService.add(bean);
        return getSuccessResponseVO(null);
    }

    /**
     * 批量新增
     */
    @RequestMapping("/addBatch")
    public ResponseVO addBatch(@RequestBody List<ForumCategory> listBean) {
        forumCategoryService.addBatch(listBean);
        return getSuccessResponseVO(null);
    }

    /**
     * 批量新增/修改
     */
    @RequestMapping("/addOrUpdateBatch")
    public ResponseVO addOrUpdateBatch(@RequestBody List<ForumCategory> listBean) {
        forumCategoryService.addBatch(listBean);
        return getSuccessResponseVO(null);
    }

    /**
     * 根据CategoryId查询对象
     */
    @RequestMapping("/getForumCategoryByCategoryId")
    public ResponseVO getForumCategoryByCategoryId(Long categoryId) {
        return getSuccessResponseVO(forumCategoryService.getForumCategoryByCategoryId(categoryId));
    }

    /**
     * 根据CategoryId修改对象
     */
    @RequestMapping("/updateForumCategoryByCategoryId")
    public ResponseVO updateForumCategoryByCategoryId(ForumCategory bean,Long categoryId) {
        forumCategoryService.updateForumCategoryByCategoryId(bean,categoryId);
        return getSuccessResponseVO(null);
    }

    /**
     * 根据CategoryId删除
     */
    @RequestMapping("/deleteForumCategoryByCategoryId")
    public ResponseVO deleteForumCategoryByCategoryId(Long categoryId) {
        forumCategoryService.deleteForumCategoryByCategoryId(categoryId);
        return getSuccessResponseVO(null);
    }
}