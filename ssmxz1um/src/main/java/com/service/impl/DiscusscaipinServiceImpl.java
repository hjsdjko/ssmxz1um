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


import com.dao.DiscusscaipinDao;
import com.entity.DiscusscaipinEntity;
import com.service.DiscusscaipinService;
import com.entity.vo.DiscusscaipinVO;
import com.entity.view.DiscusscaipinView;

@Service("discusscaipinService")
public class DiscusscaipinServiceImpl extends ServiceImpl<DiscusscaipinDao, DiscusscaipinEntity> implements DiscusscaipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscaipinEntity> page = this.selectPage(
                new Query<DiscusscaipinEntity>(params).getPage(),
                new EntityWrapper<DiscusscaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscaipinEntity> wrapper) {
		  Page<DiscusscaipinView> page =new Query<DiscusscaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscaipinVO> selectListVO(Wrapper<DiscusscaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscaipinVO selectVO(Wrapper<DiscusscaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscaipinView> selectListView(Wrapper<DiscusscaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscaipinView selectView(Wrapper<DiscusscaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
