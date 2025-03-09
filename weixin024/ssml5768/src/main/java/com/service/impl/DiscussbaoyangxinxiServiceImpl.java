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


import com.dao.DiscussbaoyangxinxiDao;
import com.entity.DiscussbaoyangxinxiEntity;
import com.service.DiscussbaoyangxinxiService;
import com.entity.vo.DiscussbaoyangxinxiVO;
import com.entity.view.DiscussbaoyangxinxiView;

@Service("discussbaoyangxinxiService")
public class DiscussbaoyangxinxiServiceImpl extends ServiceImpl<DiscussbaoyangxinxiDao, DiscussbaoyangxinxiEntity> implements DiscussbaoyangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaoyangxinxiEntity> page = this.selectPage(
                new Query<DiscussbaoyangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussbaoyangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaoyangxinxiEntity> wrapper) {
		  Page<DiscussbaoyangxinxiView> page =new Query<DiscussbaoyangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaoyangxinxiVO> selectListVO(Wrapper<DiscussbaoyangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaoyangxinxiVO selectVO(Wrapper<DiscussbaoyangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaoyangxinxiView> selectListView(Wrapper<DiscussbaoyangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaoyangxinxiView selectView(Wrapper<DiscussbaoyangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
