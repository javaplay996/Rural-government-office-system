package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjubaochuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjubaochuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjubaochuliView;


/**
 * 举报处理评论表
 *
 * @author 
 * @email 
 * @date 2023-03-07 13:32:30
 */
public interface DiscussjubaochuliService extends IService<DiscussjubaochuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjubaochuliVO> selectListVO(Wrapper<DiscussjubaochuliEntity> wrapper);
   	
   	DiscussjubaochuliVO selectVO(@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);
   	
   	List<DiscussjubaochuliView> selectListView(Wrapper<DiscussjubaochuliEntity> wrapper);
   	
   	DiscussjubaochuliView selectView(@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjubaochuliEntity> wrapper);
   	

}

