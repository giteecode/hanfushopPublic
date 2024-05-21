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


import com.dao.HanfuzhishiDao;
import com.entity.HanfuzhishiEntity;
import com.service.HanfuzhishiService;
import com.entity.vo.HanfuzhishiVO;
import com.entity.view.HanfuzhishiView;

@Service("hanfuzhishiService")
public class HanfuzhishiServiceImpl extends ServiceImpl<HanfuzhishiDao, HanfuzhishiEntity> implements HanfuzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HanfuzhishiEntity> page = this.selectPage(
                new Query<HanfuzhishiEntity>(params).getPage(),
                new EntityWrapper<HanfuzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HanfuzhishiEntity> wrapper) {
		  Page<HanfuzhishiView> page =new Query<HanfuzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HanfuzhishiVO> selectListVO(Wrapper<HanfuzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HanfuzhishiVO selectVO(Wrapper<HanfuzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HanfuzhishiView> selectListView(Wrapper<HanfuzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HanfuzhishiView selectView(Wrapper<HanfuzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
