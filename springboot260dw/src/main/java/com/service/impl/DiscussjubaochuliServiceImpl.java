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


import com.dao.DiscussjubaochuliDao;
import com.entity.DiscussjubaochuliEntity;
import com.service.DiscussjubaochuliService;
import com.entity.vo.DiscussjubaochuliVO;
import com.entity.view.DiscussjubaochuliView;

@Service("discussjubaochuliService")
public class DiscussjubaochuliServiceImpl extends ServiceImpl<DiscussjubaochuliDao, DiscussjubaochuliEntity> implements DiscussjubaochuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjubaochuliEntity> page = this.selectPage(
                new Query<DiscussjubaochuliEntity>(params).getPage(),
                new EntityWrapper<DiscussjubaochuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjubaochuliEntity> wrapper) {
		  Page<DiscussjubaochuliView> page =new Query<DiscussjubaochuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjubaochuliVO> selectListVO(Wrapper<DiscussjubaochuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjubaochuliVO selectVO(Wrapper<DiscussjubaochuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjubaochuliView> selectListView(Wrapper<DiscussjubaochuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjubaochuliView selectView(Wrapper<DiscussjubaochuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
