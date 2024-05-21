package com.dao;

import com.entity.FuzhuangzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangzhanshiVO;
import com.entity.view.FuzhuangzhanshiView;


/**
 * 服装展示
 * 
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface FuzhuangzhanshiDao extends BaseMapper<FuzhuangzhanshiEntity> {
	
	List<FuzhuangzhanshiVO> selectListVO(@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);
	
	FuzhuangzhanshiVO selectVO(@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);
	
	List<FuzhuangzhanshiView> selectListView(@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);

	List<FuzhuangzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);
	
	FuzhuangzhanshiView selectView(@Param("ew") Wrapper<FuzhuangzhanshiEntity> wrapper);
	
}
