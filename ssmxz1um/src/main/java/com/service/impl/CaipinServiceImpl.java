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


import com.dao.CaipinDao;
import com.entity.CaipinEntity;
import com.service.CaipinService;
import com.entity.vo.CaipinVO;
import com.entity.view.CaipinView;

@Service("caipinService")
public class CaipinServiceImpl extends ServiceImpl<CaipinDao, CaipinEntity> implements CaipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinEntity> page = this.selectPage(
                new Query<CaipinEntity>(params).getPage(),
                new EntityWrapper<CaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinEntity> wrapper) {
		  Page<CaipinView> page =new Query<CaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipinVO> selectListVO(Wrapper<CaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipinVO selectVO(Wrapper<CaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipinView> selectListView(Wrapper<CaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinView selectView(Wrapper<CaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
