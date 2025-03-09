package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BaoyangxinxiEntity;
import com.entity.view.BaoyangxinxiView;

import com.service.BaoyangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 保养信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
@RestController
@RequestMapping("/baoyangxinxi")
public class BaoyangxinxiController {
    @Autowired
    private BaoyangxinxiService baoyangxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaoyangxinxiEntity baoyangxinxi, HttpServletRequest request){

        EntityWrapper<BaoyangxinxiEntity> ew = new EntityWrapper<BaoyangxinxiEntity>();
		PageUtils page = baoyangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoyangxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaoyangxinxiEntity baoyangxinxi, HttpServletRequest request){
        EntityWrapper<BaoyangxinxiEntity> ew = new EntityWrapper<BaoyangxinxiEntity>();
		PageUtils page = baoyangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoyangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaoyangxinxiEntity baoyangxinxi){
       	EntityWrapper<BaoyangxinxiEntity> ew = new EntityWrapper<BaoyangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baoyangxinxi, "baoyangxinxi")); 
        return R.ok().put("data", baoyangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaoyangxinxiEntity baoyangxinxi){
        EntityWrapper< BaoyangxinxiEntity> ew = new EntityWrapper< BaoyangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baoyangxinxi, "baoyangxinxi")); 
		BaoyangxinxiView baoyangxinxiView =  baoyangxinxiService.selectView(ew);
		return R.ok("查询保养信息成功").put("data", baoyangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaoyangxinxiEntity baoyangxinxi = baoyangxinxiService.selectById(id);
        return R.ok().put("data", baoyangxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaoyangxinxiEntity baoyangxinxi = baoyangxinxiService.selectById(id);
        return R.ok().put("data", baoyangxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        BaoyangxinxiEntity baoyangxinxi = baoyangxinxiService.selectById(id);
        if(type.equals("1")) {
        	baoyangxinxi.setThumbsupnum(baoyangxinxi.getThumbsupnum()+1);
        } else {
        	baoyangxinxi.setCrazilynum(baoyangxinxi.getCrazilynum()+1);
        }
        baoyangxinxiService.updateById(baoyangxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaoyangxinxiEntity baoyangxinxi, HttpServletRequest request){
    	baoyangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoyangxinxi);

        baoyangxinxiService.insert(baoyangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody BaoyangxinxiEntity baoyangxinxi, HttpServletRequest request){
    	baoyangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoyangxinxi);

        baoyangxinxiService.insert(baoyangxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaoyangxinxiEntity baoyangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baoyangxinxi);
        baoyangxinxiService.updateById(baoyangxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baoyangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BaoyangxinxiEntity> wrapper = new EntityWrapper<BaoyangxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = baoyangxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
