package com.jean.eventosrepasoexamen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jean.eventosrepasoexamen.models.Event;


@Repository
public interface EventRepo extends CrudRepository <Event, Long> {

}