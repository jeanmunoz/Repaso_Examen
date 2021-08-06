package com.jean.eventosrepasoexamen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jean.eventosrepasoexamen.models.Message;

@Repository
public interface MessageRepo extends CrudRepository <Message, Long>{

}
