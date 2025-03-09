package com.entity.model;

import com.entity.BaoyangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 保养信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public class BaoyangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 保养名称
	 */
	
	private String baoyangmingcheng;
		
	/**
	 * 保养信息
	 */
	
	private String baoyangxinxi;
		
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 有效期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youxiaoqi;
		
	/**
	 * 门店名称
	 */
	
	private String mendianmingcheng;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：保养名称
	 */
	 
	public void setBaoyangmingcheng(String baoyangmingcheng) {
		this.baoyangmingcheng = baoyangmingcheng;
	}
	
	/**
	 * 获取：保养名称
	 */
	public String getBaoyangmingcheng() {
		return baoyangmingcheng;
	}
				
	
	/**
	 * 设置：保养信息
	 */
	 
	public void setBaoyangxinxi(String baoyangxinxi) {
		this.baoyangxinxi = baoyangxinxi;
	}
	
	/**
	 * 获取：保养信息
	 */
	public String getBaoyangxinxi() {
		return baoyangxinxi;
	}
				
	
	/**
	 * 设置：相关图片
	 */
	 
	public void setXiangguantupian(String xiangguantupian) {
		this.xiangguantupian = xiangguantupian;
	}
	
	/**
	 * 获取：相关图片
	 */
	public String getXiangguantupian() {
		return xiangguantupian;
	}
				
	
	/**
	 * 设置：有效期
	 */
	 
	public void setYouxiaoqi(Date youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	
	/**
	 * 获取：有效期
	 */
	public Date getYouxiaoqi() {
		return youxiaoqi;
	}
				
	
	/**
	 * 设置：门店名称
	 */
	 
	public void setMendianmingcheng(String mendianmingcheng) {
		this.mendianmingcheng = mendianmingcheng;
	}
	
	/**
	 * 获取：门店名称
	 */
	public String getMendianmingcheng() {
		return mendianmingcheng;
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
