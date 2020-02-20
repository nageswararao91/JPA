package com.signant.addressbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signant.addressbook.entities.Address;

@Repository
public interface AddressBootRepository extends CrudRepository<Address, Long>
{

}
