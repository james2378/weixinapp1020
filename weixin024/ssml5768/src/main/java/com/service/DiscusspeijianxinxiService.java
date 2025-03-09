package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusspeijianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusspeijianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusspeijianxinxiView;


/**
 * 配件信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface DiscusspeijianxinxiService extends IService<DiscusspeijianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusspeijianxinxiVO> selectListVO(Wrapper<DiscusspeijianxinxiEntity> wrapper);
   	
   	DiscusspeijianxinxiVO selectVO(@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);
   	
   	List<DiscusspeijianxinxiView> selectListView(Wrapper<DiscusspeijianxinxiEntity> wrapper);
   	
   	DiscusspeijianxinxiView selectView(@Param("ew") Wrapper<DiscusspeijianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusspeijianxinxiEntity> wrapper);
   	
}

