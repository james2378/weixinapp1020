package com.dao;

import com.entity.DiscusspeijianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusspeijianxinxiVO;
import com.entity.view.DiscusspeijianxinxiView;


/**
 * 配件信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface DiscusspeijianxinxiDao extends BaseMapper<DiscusspeijianxinxiEntity> {
	
	List<DiscusspeijianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);
	
	DiscusspeijianxinxiVO selectVO(@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);
	
	List<DiscusspeijianxinxiView> selectListView(@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);

	List<DiscusspeijianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);
	
	DiscusspeijianxinxiView selectView(@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);
	
}
