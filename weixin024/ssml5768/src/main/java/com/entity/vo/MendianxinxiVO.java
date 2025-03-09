package com.entity.vo;

import com.entity.MendianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 门店信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public class MendianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 门店名称
	 */
	
	private String mendianmingcheng;
		
	/**
	 * 门店负责人
	 */
	
	private String mendianfuzeren;
		
	/**
	 * 门店位置
	 */
	
	private String mendianweizhi;
		
	/**
	 * 员工人数
	 */
	
	private String yuangongrenshu;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：门店负责人
	 */
	 
	public void setMendianfuzeren(String mendianfuzeren) {
		this.mendianfuzeren = mendianfuzeren;
	}
	
	/**
	 * 获取：门店负责人
	 */
	public String getMendianfuzeren() {
		return mendianfuzeren;
	}
				
	
	/**
	 * 设置：门店位置
	 */
	 
	public void setMendianweizhi(String mendianweizhi) {
		this.mendianweizhi = mendianweizhi;
	}
	
	/**
	 * 获取：门店位置
	 */
	public String getMendianweizhi() {
		return mendianweizhi;
	}
				
	
	/**
	 * 设置：员工人数
	 */
	 
	public void setYuangongrenshu(String yuangongrenshu) {
		this.yuangongrenshu = yuangongrenshu;
	}
	
	/**
	 * 获取：员工人数
	 */
	public String getYuangongrenshu() {
		return yuangongrenshu;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
			
}
