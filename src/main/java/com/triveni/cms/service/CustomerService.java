package com.triveni.cms.service;

import com.triveni.cms.dao.CustomerDao;
import com.triveni.cms.exceptions.CustomerNotFoundException;
import com.triveni.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    private int customerIdcount =1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        /*customer.setCustomerid(customerIdcount);
        customerList.add(customer);
        customerIdcount++;
        return customer;*/
        return customerDao.save(customer);
    }
    public List<Customer> getCustomer(){
       // return customerList;
        return customerDao.findAll();
    }
public Customer getCustomerId(int customerid){
      /*return customerList.stream().filter(c->c.getCustomerid() == customerid)
                .findFirst()
                .get();*/
   Optional<Customer> optional=customerDao.findById(customerid);
   if(!optional.isPresent()){
       throw new CustomerNotFoundException("Customer record is not available....");
   }
    return optional.get();

}
public Customer updateCustomer(int customerid,Customer customer) {
   /* customerList.stream().forEach(c -> {
        if (c.getCustomerid() == customerid) {
            c.setCustomerfirstname(customer.getCustomerfirstname());
            c.setCustomerlastname(customer.getCustomerlastname());
            c.setCustomeremail(customer.getCustomeremail());
        }
    });
    return customerList.stream().filter(c -> c.getCustomerid() == customerid)
            .findFirst()
            .get();*/
    customer.setCustomerid(customerid);
    return customerDao.save(customer);
}
public void deleteCustomer(int customerid){
       /* customerList.stream()
                .forEach(c ->{
                    if(c.getCustomerid() == customerid) {
                        customerList.remove(customerid);
                    }
                });*/
    customerDao.deleteById(customerid);

                        }

    }
