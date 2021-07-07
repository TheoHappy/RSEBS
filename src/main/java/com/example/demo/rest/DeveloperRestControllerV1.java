//package com.example.demo.rest;
//
//import com.example.demo.model.Customer;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@RestController
//@RequestMapping("/api/v1/customers")
//public class DeveloperRestControllerV1 {
//
//    private List<Customer> Customers = Stream.of(
//            new Customer(1L, "Violina", "Eladii"),
//            new Customer(2L, "Elena", "Carlos"),
//            new Customer(3L, "Maxim", "Grey")
//    ).collect(Collectors.toList());
//
//    @GetMapping
//    public List<Customer> getAll() {
//        return Customers;
//    }
//
//    @GetMapping("/{id}")
//    @PreAuthorize("hasAuthority('customers:read')")
//    public Customer getById(@PathVariable Long id) {
//        return Customers.stream().filter(customer -> customer.getId().equals(id))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @PostMapping
//    @PreAuthorize("hasAuthority('customers:write')")
//    public Customer create(@RequestBody Customer customer) {
//        this.Customers.add(customer);
//        return customer;
//    }
//
//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAuthority('customers:write')")
//    public void deleteById(@PathVariable Long id) {
//        this.Customers.removeIf(customer -> customer.getId().equals(id));
//    }
//}
