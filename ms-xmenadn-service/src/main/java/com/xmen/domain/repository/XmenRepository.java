package com.xmen.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.xmen.domain.models.dna;

public interface XmenRepository extends MongoRepository<dna, String>{

}
