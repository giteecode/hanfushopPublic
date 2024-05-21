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


import com.dao.DiscussyonghuxiangceDao;
import com.entity.DiscussyonghuxiangceEntity;
import com.service.DiscussyonghuxiangceService;
import com.entity.vo.DiscussyonghuxiangceVO;
import com.entity.view.DiscussyonghuxiangceView;

@Service("discussyonghuxiangceService")
public class DiscussyonghuxiangceServiceImpl extends ServiceImpl<DiscussyonghuxiangceDao, DiscussyonghuxiangceEntity> implements DiscussyonghuxiangceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyonghuxiangceEntity> page = this.selectPage(
                new Query<DiscussyonghuxiangceEntity>(params).getPage(),
                new EntityWrapper<DiscussyonghuxiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyonghuxiangceEntity> wrapper) {
		  Page<DiscussyonghuxiangceView> page =new Query<DiscussyonghuxiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyonghuxiangceVO> selectListVO(Wrapper<DiscussyonghuxiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyonghuxiangceVO selectVO(Wrapper<DiscussyonghuxiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyonghuxiangceView> selectListView(Wrapper<DiscussyonghuxiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyonghuxiangceView selectView(Wrapper<DiscussyonghuxiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
