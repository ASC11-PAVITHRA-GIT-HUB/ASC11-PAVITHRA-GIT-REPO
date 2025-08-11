package com.demo.service;

import com.demo.entity.frdEntity;
import com.demo.model.frdModel;
import com.demo.repository.frdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class frdServiceImpl implements frdService {

    @Autowired
    private frdRepository repository;

    @Override
    public frdEntity saveFriendUsingEntity(frdEntity friend) {
        return repository.save(friend);
    }

    @Override
    public frdEntity saveFriendUsingModel(frdModel friendModel) {
        frdEntity entity = new frdEntity();
        entity.setName(friendModel.getName());
        entity.setEmail(friendModel.getEmail());
        entity.setPhone(friendModel.getPhone());
        return repository.save(entity);
    }

    @Override
    public List<frdEntity> getAllFriends() {
        return repository.findAll();
    }

    @Override
    public frdEntity getFriendById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public frdEntity updateFriend(Long id, frdEntity friend) {
        frdEntity existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(friend.getName());
            existing.setEmail(friend.getEmail());
            existing.setPhone(friend.getPhone());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteFriend(Long id) {
        repository.deleteById(id);
    }
}
