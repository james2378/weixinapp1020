package com.dao;

import com.entity.DiscussmendianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmendianxinxiVO;
import com.entity.view.DiscussmendianxinxiView;


/**
 * 门店信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface DiscussmendianxinxiDao extends BaseMapper<DiscussmendianxinxiEntity> {
	
	List<DiscussmendianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussmendianxinxiEntity> wrapper);
	
	DiscussmendianxinxiVO selectVO(@Param("ew") Wrapper<DiscussmendianxinxiEntity> wrapper);
	
	List<DiscussmendianxinxiView> selectListView(@Param("ew") Wrapper<DiscussmendianxinxiEntity> wrapper);

	List<DiscussmendianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmendianxinxiEntity> wrapper);
	
	DiscussmendianxinxiView selectView(@Param("ew") Wrapper<DiscussmendianxinxiEntity> wrapper);
	
}
