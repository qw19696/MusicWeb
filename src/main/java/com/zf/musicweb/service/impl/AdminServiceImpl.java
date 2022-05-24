package com.zf.musicweb.service.impl;

import com.zf.musicweb.entity.Admin;
import com.zf.musicweb.dao.AdminMapper;
import com.zf.musicweb.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2022-01-05
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean veritypasswd(String name, String password) {
        return adminMapper.verifyPassword(name,password)>0?true:false;
    }
}
