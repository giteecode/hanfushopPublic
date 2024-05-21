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


import com.dao.FuzhuangzhanshiDao;
import com.entity.FuzhuangzhanshiEntity;
import com.service.FuzhuangzhanshiService;
import com.entity.vo.FuzhuangzhanshiVO;
import com.entity.view.FuzhuangzhanshiView;

@Service("fuzhuangzhanshiService")
public class FuzhuangzhanshiServiceImpl extends ServiceImpl<FuzhuangzhanshiDao, FuzhuangzhanshiEntity> implements FuzhuangzhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangzhanshiEntity> page = this.selectPage(
                new Query<FuzhuangzhanshiEntity>(params).getPage(),
                new EntityWrapper<FuzhuangzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangzhanshiEntity> wrapper) {
		  Page<FuzhuangzhanshiView> page =new Query<FuzhuangzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangzhanshiVO> selectListVO(Wrapper<FuzhuangzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangzhanshiVO selectVO(Wrapper<FuzhuangzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangzhanshiView> selectListView(Wrapper<FuzhuangzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangzhanshiView selectView(Wrapper<FuzhuangzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
