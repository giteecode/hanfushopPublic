package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuxiangceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuxiangceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuxiangceView;


/**
 * 用户相册
 *
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface YonghuxiangceService extends IService<YonghuxiangceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuxiangceVO> selectListVO(Wrapper<YonghuxiangceEntity> wrapper);
   	
   	YonghuxiangceVO selectVO(@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);
   	
   	List<YonghuxiangceView> selectListView(Wrapper<YonghuxiangceEntity> wrapper);
   	
   	YonghuxiangceView selectView(@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuxiangceEntity> wrapper);
   	
}

