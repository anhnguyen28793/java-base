package vn.com.base.service.impl;

import org.springframework.stereotype.Service;
import vn.com.base.request.Customer;
import vn.com.base.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> getCustomers() {
        try {
            return mockData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    private synchronized List<Customer> mockData() throws InterruptedException {
        Map<String, Customer> map = new HashMap<>();
        System.out.println("START MOCK DATA 2");
        Thread.sleep(10000);
        for (int i = 0; i < 10000000; i++) {
            Customer customer1 = new Customer(1,"001xxx", "Nguyen Van Anh", "M");
            Customer customer2 = new Customer(2,"002xxx", "Nguyen Van Anh 2", "F");
            map.put("c1", customer1);
            map.put("c2", customer2);
        }
        System.out.println("END MOCK DATA 2");

        return map.values().stream().collect(Collectors.toList());
    }
}
