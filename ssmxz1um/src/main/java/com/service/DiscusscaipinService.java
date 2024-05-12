package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscaipinView;


/**
 * 菜品评论表
 *
 * @author 
 * @email 
 * @date 2022-04-29 12:06:28
 */
public interface DiscusscaipinService extends IService<DiscusscaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscaipinVO> selectListVO(Wrapper<DiscusscaipinEntity> wrapper);
   	
   	DiscusscaipinVO selectVO(@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);
   	
   	List<DiscusscaipinView> selectListView(Wrapper<DiscusscaipinEntity> wrapper);
   	
   	DiscusscaipinView selectView(@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscaipinEntity> wrapper);
   	

}

