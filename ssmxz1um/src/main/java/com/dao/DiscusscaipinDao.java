package com.dao;

import com.entity.DiscusscaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscaipinVO;
import com.entity.view.DiscusscaipinView;


/**
 * 菜品评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-29 12:06:28
 */
public interface DiscusscaipinDao extends BaseMapper<DiscusscaipinEntity> {
	
	List<DiscusscaipinVO> selectListVO(@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);
	
	DiscusscaipinVO selectVO(@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);
	
	List<DiscusscaipinView> selectListView(@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);

	List<DiscusscaipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);
	
	DiscusscaipinView selectView(@Param("ew") Wrapper<DiscusscaipinEntity> wrapper);
	

}
