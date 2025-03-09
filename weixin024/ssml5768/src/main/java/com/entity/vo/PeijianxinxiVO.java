package com.entity.vo;

import com.entity.PeijianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 配件信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public class PeijianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配件名称
	 */
	
	private String peijianmingcheng;
		
	/**
	 * 配件类型
	 */
	
	private String peijianleixing;
		
	/**
	 * 配件信息
	 */
	
	private String peijianxinxi;
		
	/**
	 * 配件图片
	 */
	
	private String peijiantupian;
		
	/**
	 * 生产地
	 */
	
	private String shengchandi;
		
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
	 * 设置：配件名称
	 */
	 
	public void setPeijianmingcheng(String peijianmingcheng) {
		this.peijianmingcheng = peijianmingcheng;
	}
	
	/**
	 * 获取：配件名称
	 */
	public String getPeijianmingcheng() {
		return peijianmingcheng;
	}
				
	
	/**
	 * 设置：配件类型
	 */
	 
	public void setPeijianleixing(String peijianleixing) {
		this.peijianleixing = peijianleixing;
	}
	
	/**
	 * 获取：配件类型
	 */
	public String getPeijianleixing() {
		return peijianleixing;
	}
				
	
	/**
	 * 设置：配件信息
	 */
	 
	public void setPeijianxinxi(String peijianxinxi) {
		this.peijianxinxi = peijianxinxi;
	}
	
	/**
	 * 获取：配件信息
	 */
	public String getPeijianxinxi() {
		return peijianxinxi;
	}
				
	
	/**
	 * 设置：配件图片
	 */
	 
	public void setPeijiantupian(String peijiantupian) {
		this.peijiantupian = peijiantupian;
	}
	
	/**
	 * 获取：配件图片
	 */
	public String getPeijiantupian() {
		return peijiantupian;
	}
				
	
	/**
	 * 设置：生产地
	 */
	 
	public void setShengchandi(String shengchandi) {
		this.shengchandi = shengchandi;
	}
	
	/**
	 * 获取：生产地
	 */
	public String getShengchandi() {
		return shengchandi;
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
