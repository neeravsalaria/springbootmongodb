package com.example.springwebflux.controller;

import com.example.springwebflux.model.*;
import com.example.springwebflux.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/insurance")
public class CustomerController {

    @Autowired
    CustomerService customerService;
//
//    @GetMapping("/list")
//    public List<Customer> getCustomerList() throws InterruptedException {
//         return customerService.loadList();
//    }

//    @GetMapping("/stream")
//    public Flux<Customer> getCustomerListStream() throws InterruptedException {
//        return customerService.streamList();
//    }


    @GetMapping("/planTypes")
    public Flux<PlanType> getInsurancePlanType() throws InterruptedException {
        return customerService.streamPlanTypeList();
    }

    @GetMapping("/services")
    public Flux<Services> getInsuranceServices() throws InterruptedException {
        return customerService.streamServicesList();
    }

    @GetMapping("/costType")
    public Flux<CostType> getInsuranceCostType() throws InterruptedException {
        return customerService.streamCostTypeList();
    }

    @GetMapping("/networkType")
    public Flux<NetworkType> getInsuranceNetworkType() throws InterruptedException {
        return customerService.streamNetworkTypeList();
    }

    @GetMapping("/plans")
    public Flux<InsurancePlan> getInsurancePlans() throws InterruptedException {
        return customerService.streamInsurancePlanList();
    }

    @GetMapping("/plans/{name}")
    public Mono<InsurancePlan> getInsurancePlanByName(@PathVariable String name) throws InterruptedException {
        return customerService.getInsurancePlanByName(name);
    }

    @GetMapping("/plans/type/{type}")
    public Flux<InsurancePlan> getInsurancePlanByType(@PathVariable String type) throws InterruptedException {
        return customerService.getInsurancePlanByType(type);
    }

//    @GetMapping("/plans/services/{name}")
//    public Flux<InsurancePlan> getInsurancePlanByServiceName(@PathVariable String name) throws InterruptedException {
//        return customerService.getInsurancePlanByServiceName(name);
//    }
}
