package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 保养信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
@TableName("baoyangxinxi")
public class BaoyangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoyangxinxiEntity() {
		
	}
	
	public BaoyangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 保养编号
	 */
					
	private String baoyangbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：保养编号
	 */
	public void setBaoyangbianhao(String baoyangbianhao) {
		this.baoyangbianhao = baoyangbianhao;
	}
	/**
	 * 获取：保养编号
	 */
	public String getBaoyangbianhao() {
		return baoyangbianhao;
	}
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
