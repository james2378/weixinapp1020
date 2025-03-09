package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaoyangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaoyangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaoyangxinxiView;


/**
 * 保养信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface DiscussbaoyangxinxiService extends IService<DiscussbaoyangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaoyangxinxiVO> selectListVO(Wrapper<DiscussbaoyangxinxiEntity> wrapper);
   	
   	DiscussbaoyangxinxiVO selectVO(@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);
   	
   	List<DiscussbaoyangxinxiView> selectListView(Wrapper<DiscussbaoyangxinxiEntity> wrapper);
   	
   	DiscussbaoyangxinxiView selectView(@Param("ew") Wrapper<DiscussbaoyangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaoyangxinxiEntity> wrapper);
   	
}

