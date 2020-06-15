package com.collections.collections.controller;

import com.collections.collections.model.Collection;
import com.collections.collections.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/collection")
@CrossOrigin(origins = "http://localhost:3000")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @PostMapping("/post")
    public ResponseEntity<?> addCollection(@Valid @RequestBody Collection collection){
        Collection newCollection = collectionService.saveCollection(collection);
        return new ResponseEntity<Collection>(newCollection, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public Iterable<Collection> getCollection(){
        return collectionService.findAll();
    }


}
