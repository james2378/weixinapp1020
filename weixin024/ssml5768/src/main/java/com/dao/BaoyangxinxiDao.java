package com.dao;

import com.entity.BaoyangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoyangxinxiVO;
import com.entity.view.BaoyangxinxiView;


/**
 * 保养信息
 * 
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface BaoyangxinxiDao extends BaseMapper<BaoyangxinxiEntity> {
	
	List<BaoyangxinxiVO> selectListVO(@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);
	
	BaoyangxinxiVO selectVO(@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);
	
	List<BaoyangxinxiView> selectListView(@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);

	List<BaoyangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);
	
	BaoyangxinxiView selectView(@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);
	
}
