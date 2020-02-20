package com.signant.addressbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signant.addressbook.entities.States;
@Repository
public interface StateRepository extends CrudRepository<States, Long>
{

}
