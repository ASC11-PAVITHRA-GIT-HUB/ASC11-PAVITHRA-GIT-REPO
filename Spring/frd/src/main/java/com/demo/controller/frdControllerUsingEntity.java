package com.demo.controller;

import com.demo.entity.frdEntity;
import com.demo.service.frdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entity/friends")
public class frdControllerUsingEntity {

    @Autowired
    private frdService service;

    @PostMapping
    public frdEntity createFriend(@RequestBody frdEntity friend) {
        return service.saveFriendUsingEntity(friend);
    }

    @GetMapping
    public List<frdEntity> getAllFriends() {
        return service.getAllFriends();
    }

    @GetMapping("/{id}")
    public frdEntity getFriendById(@PathVariable Long id) {
        return service.getFriendById(id);
    }

    @PutMapping("/{id}")
    public frdEntity updateFriend(@PathVariable Long id, @RequestBody frdEntity friend) {
        return service.updateFriend(id, friend);
    }

    @DeleteMapping("/{id}")
    public void deleteFriend(@PathVariable Long id) {
        service.deleteFriend(id);
    }
}
