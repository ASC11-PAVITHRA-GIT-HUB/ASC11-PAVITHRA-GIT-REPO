package com.demo.service;

import com.demo.entity.frdEntity;
import com.demo.model.frdModel;

import java.util.List;

public interface frdService {
    frdEntity saveFriendUsingEntity(frdEntity friend);
    frdEntity saveFriendUsingModel(frdModel friendModel);
    List<frdEntity> getAllFriends();
    frdEntity getFriendById(Long id);
    frdEntity updateFriend(Long id, frdEntity friend);
    void deleteFriend(Long id);
}
