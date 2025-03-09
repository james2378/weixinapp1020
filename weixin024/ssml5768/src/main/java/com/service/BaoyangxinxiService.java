package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoyangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoyangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoyangxinxiView;


/**
 * 保养信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
public interface BaoyangxinxiService extends IService<BaoyangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoyangxinxiVO> selectListVO(Wrapper<BaoyangxinxiEntity> wrapper);
   	
   	BaoyangxinxiVO selectVO(@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);
   	
   	List<BaoyangxinxiView> selectListView(Wrapper<BaoyangxinxiEntity> wrapper);
   	
   	BaoyangxinxiView selectView(@Param("ew") Wrapper<BaoyangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoyangxinxiEntity> wrapper);
   	
}

