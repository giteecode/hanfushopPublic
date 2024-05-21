package com.dao;

import com.entity.DiscussyonghuxiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyonghuxiangceVO;
import com.entity.view.DiscussyonghuxiangceView;


/**
 * 用户相册评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface DiscussyonghuxiangceDao extends BaseMapper<DiscussyonghuxiangceEntity> {
	
	List<DiscussyonghuxiangceVO> selectListVO(@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);
	
	DiscussyonghuxiangceVO selectVO(@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);
	
	List<DiscussyonghuxiangceView> selectListView(@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);

	List<DiscussyonghuxiangceView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);
	
	DiscussyonghuxiangceView selectView(@Param("ew") Wrapper<DiscussyonghuxiangceEntity> wrapper);
	
}
