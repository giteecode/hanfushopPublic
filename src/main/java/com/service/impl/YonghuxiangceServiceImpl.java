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


import com.dao.YonghuxiangceDao;
import com.entity.YonghuxiangceEntity;
import com.service.YonghuxiangceService;
import com.entity.vo.YonghuxiangceVO;
import com.entity.view.YonghuxiangceView;

@Service("yonghuxiangceService")
public class YonghuxiangceServiceImpl extends ServiceImpl<YonghuxiangceDao, YonghuxiangceEntity> implements YonghuxiangceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuxiangceEntity> page = this.selectPage(
                new Query<YonghuxiangceEntity>(params).getPage(),
                new EntityWrapper<YonghuxiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuxiangceEntity> wrapper) {
		  Page<YonghuxiangceView> page =new Query<YonghuxiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuxiangceVO> selectListVO(Wrapper<YonghuxiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuxiangceVO selectVO(Wrapper<YonghuxiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuxiangceView> selectListView(Wrapper<YonghuxiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuxiangceView selectView(Wrapper<YonghuxiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
