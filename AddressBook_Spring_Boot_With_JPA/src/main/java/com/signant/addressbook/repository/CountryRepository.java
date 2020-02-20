package com.signant.addressbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signant.addressbook.entities.Countries;

@Repository
public interface CountryRepository extends CrudRepository<Countries, Integer>
{

}
