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


import com.dao.JubaochuliDao;
import com.entity.JubaochuliEntity;
import com.service.JubaochuliService;
import com.entity.vo.JubaochuliVO;
import com.entity.view.JubaochuliView;

@Service("jubaochuliService")
public class JubaochuliServiceImpl extends ServiceImpl<JubaochuliDao, JubaochuliEntity> implements JubaochuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubaochuliEntity> page = this.selectPage(
                new Query<JubaochuliEntity>(params).getPage(),
                new EntityWrapper<JubaochuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubaochuliEntity> wrapper) {
		  Page<JubaochuliView> page =new Query<JubaochuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubaochuliVO> selectListVO(Wrapper<JubaochuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubaochuliVO selectVO(Wrapper<JubaochuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubaochuliView> selectListView(Wrapper<JubaochuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubaochuliView selectView(Wrapper<JubaochuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
