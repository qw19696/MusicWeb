package com.zf.musicweb.service.impl;

import com.zf.musicweb.entity.Collect;
import com.zf.musicweb.dao.CollectMapper;
import com.zf.musicweb.service.CollectService;
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
public class CollectServiceImpl extends ServiceImpl<CollectMapper, Collect> implements CollectService {

    @Autowired
    private CollectMapper collectMapper;


    @Override
    public boolean existSongId(Integer userId, Integer songId) {
        return collectMapper.existSongId(userId,songId)>0?true:false ;
    }

    @Override
    public boolean addCollection(Collect collect) {
        return collectMapper.insert(collect)>0?true:false;
    }

    @Override
    public boolean updateCollectMsg(Collect collect) {
        return collectMapper.updateById(collect)>0?true:false;
    }

    @Override
    public boolean deleteCollect(Integer userId, Integer songId) {
        return collectMapper.deleteCollect(userId,songId)>0?true:false;
    }

    @Override
    public List<Collect> allCollect() {
        return collectMapper.allCollect();
    }

    @Override
    public List<Collect> collectionOfUser(Integer userId) {
        return collectMapper.collectionOfUser(userId);
    }
}
