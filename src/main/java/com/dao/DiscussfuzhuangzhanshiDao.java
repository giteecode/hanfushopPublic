package com.dao;

import com.entity.DiscussfuzhuangzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuzhuangzhanshiVO;
import com.entity.view.DiscussfuzhuangzhanshiView;


/**
 * 服装展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface DiscussfuzhuangzhanshiDao extends BaseMapper<DiscussfuzhuangzhanshiEntity> {
	
	List<DiscussfuzhuangzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
	
	DiscussfuzhuangzhanshiVO selectVO(@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
	
	List<DiscussfuzhuangzhanshiView> selectListView(@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);

	List<DiscussfuzhuangzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
	
	DiscussfuzhuangzhanshiView selectView(@Param("ew") Wrapper<DiscussfuzhuangzhanshiEntity> wrapper);
	
}
