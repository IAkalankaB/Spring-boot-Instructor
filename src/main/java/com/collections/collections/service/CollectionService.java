package com.collections.collections.service;

import com.collections.collections.model.Collection;
import com.collections.collections.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository collectionRepository;

    public Collection saveCollection(Collection collection){
        return collectionRepository.save(collection);
    }

    public Iterable<Collection> findAll(){
        return collectionRepository.findAll();
    }

}
