package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FuzhuangleibieDao;
import com.entity.FuzhuangleibieEntity;
import com.service.FuzhuangleibieService;
import com.entity.vo.FuzhuangleibieVO;
import com.entity.view.FuzhuangleibieView;

@Service("fuzhuangleibieService")
public class FuzhuangleibieServiceImpl extends ServiceImpl<FuzhuangleibieDao, FuzhuangleibieEntity> implements FuzhuangleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangleibieEntity> page = this.selectPage(
                new Query<FuzhuangleibieEntity>(params).getPage(),
                new EntityWrapper<FuzhuangleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangleibieEntity> wrapper) {
		  Page<FuzhuangleibieView> page =new Query<FuzhuangleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangleibieVO> selectListVO(Wrapper<FuzhuangleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangleibieVO selectVO(Wrapper<FuzhuangleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangleibieView> selectListView(Wrapper<FuzhuangleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangleibieView selectView(Wrapper<FuzhuangleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
