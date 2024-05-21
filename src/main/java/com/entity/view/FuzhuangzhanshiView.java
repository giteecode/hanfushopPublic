package com.entity.view;

import com.entity.FuzhuangzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装展示
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
@TableName("fuzhuangzhanshi")
public class FuzhuangzhanshiView  extends FuzhuangzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzhuangzhanshiView(){
	}
 
 	public FuzhuangzhanshiView(FuzhuangzhanshiEntity fuzhuangzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, fuzhuangzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
