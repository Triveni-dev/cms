package com.triveni.cms.dao;

import com.triveni.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends CrudRepository<Customer , Integer> {

    public List<Customer> findAll();


}
