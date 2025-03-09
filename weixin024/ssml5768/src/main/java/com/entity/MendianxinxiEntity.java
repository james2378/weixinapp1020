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
 * 门店信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
@TableName("mendianxinxi")
public class MendianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MendianxinxiEntity() {
		
	}
	
	public MendianxinxiEntity(T t) {
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
	 * 门店编号
	 */
					
	private String mendianbianhao;
	
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
	 * 设置：门店编号
	 */
	public void setMendianbianhao(String mendianbianhao) {
		this.mendianbianhao = mendianbianhao;
	}
	/**
	 * 获取：门店编号
	 */
	public String getMendianbianhao() {
		return mendianbianhao;
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
