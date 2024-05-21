package com.entity.view;

import com.entity.HanfuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汉服知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
@TableName("hanfuzhishi")
public class HanfuzhishiView  extends HanfuzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HanfuzhishiView(){
	}
 
 	public HanfuzhishiView(HanfuzhishiEntity hanfuzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, hanfuzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
