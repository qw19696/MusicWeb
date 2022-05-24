package com.zf.musicweb.service.impl;

import com.zf.musicweb.entity.Consumer;
import com.zf.musicweb.dao.ConsumerMapper;
import com.zf.musicweb.service.ConsumerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2022-01-05
 */
@Service
public class ConsumerServiceImpl extends ServiceImpl<ConsumerMapper, Consumer> implements ConsumerService {

    @Autowired
    private ConsumerMapper consumerMapper;

    public boolean addUser(Consumer consumer){
        return consumerMapper.insert(consumer)>0?true:false;
    }

    @Override
    public boolean updateUserMsg(Consumer consumer) {
        return consumerMapper.updateUserMsg(consumer)>0?true:false;
    }

    public boolean veritypasswd(String username, String password){
        return consumerMapper.verifyPassword(username,password)>0?true:false;
    }

    public List<Consumer> loginStatus(String username){
        return consumerMapper.loginStatus(username);
    }

    public List<Consumer> allUser(){
        return consumerMapper.allUser();
    }

    @Override
    public boolean updateUserAvator(Consumer consumer) {
        return consumerMapper.updateUserAvator(consumer)>0?true:false;
    }
}
