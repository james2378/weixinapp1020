package com.entity.view;

import com.entity.DiscussbaoyangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保养信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
@TableName("discussbaoyangxinxi")
public class DiscussbaoyangxinxiView  extends DiscussbaoyangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaoyangxinxiView(){
	}
 
 	public DiscussbaoyangxinxiView(DiscussbaoyangxinxiEntity discussbaoyangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaoyangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
