package com.dao;

import com.entity.FuzhuangleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangleibieVO;
import com.entity.view.FuzhuangleibieView;


/**
 * 服装类别
 * 
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface FuzhuangleibieDao extends BaseMapper<FuzhuangleibieEntity> {
	
	List<FuzhuangleibieVO> selectListVO(@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);
	
	FuzhuangleibieVO selectVO(@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);
	
	List<FuzhuangleibieView> selectListView(@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);

	List<FuzhuangleibieView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);
	
	FuzhuangleibieView selectView(@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);
	
}
