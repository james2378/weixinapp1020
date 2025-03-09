package com.dao;

import com.entity.DiscussbaoyangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaoyangxinxiVO;
import com.entity.view.DiscussbaoyangxinxiView;


/**
 * 保养信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface DiscussbaoyangxinxiDao extends BaseMapper<DiscussbaoyangxinxiEntity> {
	
	List<DiscussbaoyangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);
	
	DiscussbaoyangxinxiVO selectVO(@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);
	
	List<DiscussbaoyangxinxiView> selectListView(@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);

	List<DiscussbaoyangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);
	
	DiscussbaoyangxinxiView selectView(@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);
	
}
