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


import com.dao.ChangyongziliaoDao;
import com.entity.ChangyongziliaoEntity;
import com.service.ChangyongziliaoService;
import com.entity.vo.ChangyongziliaoVO;
import com.entity.view.ChangyongziliaoView;

@Service("changyongziliaoService")
public class ChangyongziliaoServiceImpl extends ServiceImpl<ChangyongziliaoDao, ChangyongziliaoEntity> implements ChangyongziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangyongziliaoEntity> page = this.selectPage(
                new Query<ChangyongziliaoEntity>(params).getPage(),
                new EntityWrapper<ChangyongziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangyongziliaoEntity> wrapper) {
		  Page<ChangyongziliaoView> page =new Query<ChangyongziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangyongziliaoVO> selectListVO(Wrapper<ChangyongziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangyongziliaoVO selectVO(Wrapper<ChangyongziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangyongziliaoView> selectListView(Wrapper<ChangyongziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangyongziliaoView selectView(Wrapper<ChangyongziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
