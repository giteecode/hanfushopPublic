package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangzhanshiView;


/**
 * 服装展示
 *
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface FuzhuangzhanshiService extends IService<FuzhuangzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangzhanshiVO> selectListVO(Wrapper<FuzhuangzhanshiEntity> wrapper);
   	
   	FuzhuangzhanshiVO selectVO(@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);
   	
   	List<FuzhuangzhanshiView> selectListView(Wrapper<FuzhuangzhanshiEntity> wrapper);
   	
   	FuzhuangzhanshiView selectView(@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangzhanshiEntity> wrapper);
   	
}

