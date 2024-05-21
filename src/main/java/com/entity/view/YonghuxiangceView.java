package com.entity.view;

import com.entity.YonghuxiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户相册
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
@TableName("yonghuxiangce")
public class YonghuxiangceView  extends YonghuxiangceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuxiangceView(){
	}
 
 	public YonghuxiangceView(YonghuxiangceEntity yonghuxiangceEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuxiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
