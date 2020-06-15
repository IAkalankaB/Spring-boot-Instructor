package com.collections.collections.repository;

import com.collections.collections.model.Collection;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CollectionRepository extends MongoRepository<Collection,Integer> {

}
