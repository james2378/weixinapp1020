package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaoyangxinxiDao;
import com.entity.BaoyangxinxiEntity;
import com.service.BaoyangxinxiService;
import com.entity.vo.BaoyangxinxiVO;
import com.entity.view.BaoyangxinxiView;

@Service("baoyangxinxiService")
public class BaoyangxinxiServiceImpl extends ServiceImpl<BaoyangxinxiDao, BaoyangxinxiEntity> implements BaoyangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoyangxinxiEntity> page = this.selectPage(
                new Query<BaoyangxinxiEntity>(params).getPage(),
                new EntityWrapper<BaoyangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoyangxinxiEntity> wrapper) {
		  Page<BaoyangxinxiView> page =new Query<BaoyangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoyangxinxiVO> selectListVO(Wrapper<BaoyangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoyangxinxiVO selectVO(Wrapper<BaoyangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoyangxinxiView> selectListView(Wrapper<BaoyangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoyangxinxiView selectView(Wrapper<BaoyangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
