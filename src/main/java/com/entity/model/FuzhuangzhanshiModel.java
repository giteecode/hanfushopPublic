package com.entity.model;

import com.entity.FuzhuangzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 服装展示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-16 21:40:23
 */
public class FuzhuangzhanshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服装名称
	 */
	
	private String fuzhuangmingcheng;
		
	/**
	 * 服装类别
	 */
	
	private String fuzhuangleibie;
		
	/**
	 * 服装颜色
	 */
	
	private String fuzhuangyanse;
		
	/**
	 * 服装介绍
	 */
	
	private String fuzhuangjieshao;
		
	/**
	 * 服装图片
	 */
	
	private String fuzhuangtupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：服装名称
	 */
	 
	public void setFuzhuangmingcheng(String fuzhuangmingcheng) {
		this.fuzhuangmingcheng = fuzhuangmingcheng;
	}
	
	/**
	 * 获取：服装名称
	 */
	public String getFuzhuangmingcheng() {
		return fuzhuangmingcheng;
	}
				
	
	/**
	 * 设置：服装类别
	 */
	 
	public void setFuzhuangleibie(String fuzhuangleibie) {
		this.fuzhuangleibie = fuzhuangleibie;
	}
	
	/**
	 * 获取：服装类别
	 */
	public String getFuzhuangleibie() {
		return fuzhuangleibie;
	}
				
	
	/**
	 * 设置：服装颜色
	 */
	 
	public void setFuzhuangyanse(String fuzhuangyanse) {
		this.fuzhuangyanse = fuzhuangyanse;
	}
	
	/**
	 * 获取：服装颜色
	 */
	public String getFuzhuangyanse() {
		return fuzhuangyanse;
	}
				
	
	/**
	 * 设置：服装介绍
	 */
	 
	public void setFuzhuangjieshao(String fuzhuangjieshao) {
		this.fuzhuangjieshao = fuzhuangjieshao;
	}
	
	/**
	 * 获取：服装介绍
	 */
	public String getFuzhuangjieshao() {
		return fuzhuangjieshao;
	}
				
	
	/**
	 * 设置：服装图片
	 */
	 
	public void setFuzhuangtupian(String fuzhuangtupian) {
		this.fuzhuangtupian = fuzhuangtupian;
	}
	
	/**
	 * 获取：服装图片
	 */
	public String getFuzhuangtupian() {
		return fuzhuangtupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
