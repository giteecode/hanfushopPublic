package com.dao;

import com.entity.YonghuxiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuxiangceVO;
import com.entity.view.YonghuxiangceView;


/**
 * 用户相册
 * 
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface YonghuxiangceDao extends BaseMapper<YonghuxiangceEntity> {
	
	List<YonghuxiangceVO> selectListVO(@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);
	
	YonghuxiangceVO selectVO(@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);
	
	List<YonghuxiangceView> selectListView(@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);

	List<YonghuxiangceView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);
	
	YonghuxiangceView selectView(@Param("ew") Wrapper<YonghuxiangceEntity> wrapper);
	
}
