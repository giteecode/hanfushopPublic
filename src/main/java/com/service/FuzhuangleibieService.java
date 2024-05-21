package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangleibieView;


/**
 * 服装类别
 *
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public interface FuzhuangleibieService extends IService<FuzhuangleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangleibieVO> selectListVO(Wrapper<FuzhuangleibieEntity> wrapper);
   	
   	FuzhuangleibieVO selectVO(@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);
   	
   	List<FuzhuangleibieView> selectListView(Wrapper<FuzhuangleibieEntity> wrapper);
   	
   	FuzhuangleibieView selectView(@Param("ew") Wrapper<FuzhuangleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangleibieEntity> wrapper);
   	
}

