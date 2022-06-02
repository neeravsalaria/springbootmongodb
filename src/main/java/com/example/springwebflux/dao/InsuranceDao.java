package com.example.springwebflux.dao;

import com.example.springwebflux.model.*;
import com.example.springwebflux.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class InsuranceDao {

    @Autowired
    private CustomerRepository customerRepository;


    @Autowired
    private PlanTypeRepository planTypeRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private CostTypeRepository costTypeRepository;

    @Autowired
    private NetworkTypeRepository networkTypeRepository;

    @Autowired
    private InsurancePlanRepository insurancePlanRepository;

//    public List<Customer> getCustomerList() throws InterruptedException {
//        return IntStream.rangeClosed(1, 50)
//                .peek(CustomerDao::sleepExecution)
//                .peek(i-> System.out.println("processing value at "+i))
//                .mapToObj(i->new Customer(i, "customer"+i))
//                .collect(Collectors.toList());
//    }

    public Flux<Customer> getCustomerListStream() throws InterruptedException {
//        return Flux.range(1, 50)
//                .delayElements(Duration.ofMillis(1000))
//                .doOnNext(i-> System.out.println("processing value at "+i))
//                .map(i->new Customer(i, "customer"+i));
        return customerRepository.findAll();
    }


    public Flux<PlanType> getPlanTypeListStream() throws InterruptedException {
        return planTypeRepository.findAll();
    }

    public Flux<Services> getServiceListStream() throws InterruptedException {
        return serviceRepository.findAll();
    }

    public Flux<CostType> getCostTypeListStream() throws InterruptedException {
        return costTypeRepository.findAll();
    }

    public Flux<NetworkType> getNetworkTypeListStream() throws InterruptedException {
        return networkTypeRepository.findAll();
    }

    public Flux<InsurancePlan> getInsurancePlanListStream() throws InterruptedException {
        return insurancePlanRepository.findAll();
    }

    public Mono<InsurancePlan> getInsurancePlanByName(String name) throws InterruptedException {
        return insurancePlanRepository.findInsurancePlanByName(name);
    }

    public Flux<InsurancePlan> getInsurancePlanByType(String type) throws InterruptedException {
        return insurancePlanRepository.findInsurancePlanByType(type);
    }

//    public Flux<InsurancePlan> getInsurancePlanByServiceName(String name) throws InterruptedException {
//        return insurancePlanRepository.findInsurancePlanByServices_Name(name);
//    }



    private static void sleepExecution(int i) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
