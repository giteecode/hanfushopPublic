package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuzhuangzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuzhuangzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuzhuangzhanshiView;


/**
 * 服装展示评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface DiscussfuzhuangzhanshiService extends IService<DiscussfuzhuangzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuzhuangzhanshiVO> selectListVO(Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
   	
   	DiscussfuzhuangzhanshiVO selectVO(@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
   	
   	List<DiscussfuzhuangzhanshiView> selectListView(Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
   	
   	DiscussfuzhuangzhanshiView selectView(@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
   	
}

