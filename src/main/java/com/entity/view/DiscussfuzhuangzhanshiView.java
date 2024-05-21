package com.entity.view;

import com.entity.DiscussfuzhuangzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装展示评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
@TableName("discussfuzhuangzhanshi")
public class DiscussfuzhuangzhanshiView  extends DiscussfuzhuangzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfuzhuangzhanshiView(){
	}
 
 	public DiscussfuzhuangzhanshiView(DiscussfuzhuangzhanshiEntity discussfuzhuangzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfuzhuangzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
