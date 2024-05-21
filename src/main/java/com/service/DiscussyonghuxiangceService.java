package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyonghuxiangceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyonghuxiangceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyonghuxiangceView;


/**
 * 用户相册评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface DiscussyonghuxiangceService extends IService<DiscussyonghuxiangceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyonghuxiangceVO> selectListVO(Wrapper<DiscussyonghuxiangceEntity> wrapper);
   	
   	DiscussyonghuxiangceVO selectVO(@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);
   	
   	List<DiscussyonghuxiangceView> selectListView(Wrapper<DiscussyonghuxiangceEntity> wrapper);
   	
   	DiscussyonghuxiangceView selectView(@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyonghuxiangceEntity> wrapper);
   	
}

