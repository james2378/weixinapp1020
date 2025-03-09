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


import com.dao.DiscusspeijianxinxiDao;
import com.entity.DiscusspeijianxinxiEntity;
import com.service.DiscusspeijianxinxiService;
import com.entity.vo.DiscusspeijianxinxiVO;
import com.entity.view.DiscusspeijianxinxiView;

@Service("discusspeijianxinxiService")
public class DiscusspeijianxinxiServiceImpl extends ServiceImpl<DiscusspeijianxinxiDao, DiscusspeijianxinxiEntity> implements DiscusspeijianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusspeijianxinxiEntity> page = this.selectPage(
                new Query<DiscusspeijianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusspeijianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusspeijianxinxiEntity> wrapper) {
		  Page<DiscusspeijianxinxiView> page =new Query<DiscusspeijianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusspeijianxinxiVO> selectListVO(Wrapper<DiscusspeijianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusspeijianxinxiVO selectVO(Wrapper<DiscusspeijianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusspeijianxinxiView> selectListView(Wrapper<DiscusspeijianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusspeijianxinxiView selectView(Wrapper<DiscusspeijianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
