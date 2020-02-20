package com.signant.addressbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signant.addressbook.entities.Cities;
@Repository
public interface CityReposiroty extends CrudRepository<Cities, Long>
{

}
