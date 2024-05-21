package com.entity.view;

import com.entity.DiscussyonghuxiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户相册评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
@TableName("discussyonghuxiangce")
public class DiscussyonghuxiangceView  extends DiscussyonghuxiangceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyonghuxiangceView(){
	}
 
 	public DiscussyonghuxiangceView(DiscussyonghuxiangceEntity discussyonghuxiangceEntity){
 	try {
			BeanUtils.copyProperties(this, discussyonghuxiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
