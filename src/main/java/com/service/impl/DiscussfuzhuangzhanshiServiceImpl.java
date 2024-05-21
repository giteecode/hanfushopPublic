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


import com.dao.DiscussfuzhuangzhanshiDao;
import com.entity.DiscussfuzhuangzhanshiEntity;
import com.service.DiscussfuzhuangzhanshiService;
import com.entity.vo.DiscussfuzhuangzhanshiVO;
import com.entity.view.DiscussfuzhuangzhanshiView;

@Service("discussfuzhuangzhanshiService")
public class DiscussfuzhuangzhanshiServiceImpl extends ServiceImpl<DiscussfuzhuangzhanshiDao, DiscussfuzhuangzhanshiEntity> implements DiscussfuzhuangzhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuzhuangzhanshiEntity> page = this.selectPage(
                new Query<DiscussfuzhuangzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussfuzhuangzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuzhuangzhanshiEntity> wrapper) {
		  Page<DiscussfuzhuangzhanshiView> page =new Query<DiscussfuzhuangzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuzhuangzhanshiVO> selectListVO(Wrapper<DiscussfuzhuangzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuzhuangzhanshiVO selectVO(Wrapper<DiscussfuzhuangzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuzhuangzhanshiView> selectListView(Wrapper<DiscussfuzhuangzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuzhuangzhanshiView selectView(Wrapper<DiscussfuzhuangzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
