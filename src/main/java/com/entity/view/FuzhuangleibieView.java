package com.entity.view;

import com.entity.FuzhuangleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
@TableName("fuzhuangleibie")
public class FuzhuangleibieView  extends FuzhuangleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzhuangleibieView(){
	}
 
 	public FuzhuangleibieView(FuzhuangleibieEntity fuzhuangleibieEntity){
 	try {
			BeanUtils.copyProperties(this, fuzhuangleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
