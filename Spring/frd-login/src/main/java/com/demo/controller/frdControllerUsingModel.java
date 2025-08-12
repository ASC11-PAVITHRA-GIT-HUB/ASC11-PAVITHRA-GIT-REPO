package com.demo.controller;

import com.demo.entity.frdEntity;
import com.demo.model.frdModel;
import com.demo.service.frdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/model/friends")
public class frdControllerUsingModel {

    @Autowired
    private frdService service;

    @PostMapping
    public frdEntity createFriend(@RequestBody frdModel friendModel) {
        return service.saveFriendUsingModel(friendModel);
    }
}
