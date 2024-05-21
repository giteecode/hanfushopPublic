package com.dao;

import com.entity.HanfuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HanfuzhishiVO;
import com.entity.view.HanfuzhishiView;


/**
 * 汉服知识
 * 
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface HanfuzhishiDao extends BaseMapper<HanfuzhishiEntity> {
	
	List<HanfuzhishiVO> selectListVO(@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);
	
	HanfuzhishiVO selectVO(@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);
	
	List<HanfuzhishiView> selectListView(@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);

	List<HanfuzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);
	
	HanfuzhishiView selectView(@Param("ew") Wrapper<HanfuzhishiEntity> wrapper);
	
}
