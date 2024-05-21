package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HanfuzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HanfuzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HanfuzhishiView;


/**
 * 汉服知识
 *
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface HanfuzhishiService extends IService<HanfuzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HanfuzhishiVO> selectListVO(Wrapper<HanfuzhishiEntity> wrapper);
   	
   	HanfuzhishiVO selectVO(@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);
   	
   	List<HanfuzhishiView> selectListView(Wrapper<HanfuzhishiEntity> wrapper);
   	
   	HanfuzhishiView selectView(@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HanfuzhishiEntity> wrapper);
   	
}

