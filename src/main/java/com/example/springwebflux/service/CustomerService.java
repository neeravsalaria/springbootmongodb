package com.example.springwebflux.service;

import com.example.springwebflux.dao.InsuranceDao;
import com.example.springwebflux.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    @Autowired
    InsuranceDao insuranceDao;

//    public List<Customer> loadList() throws InterruptedException {
//        return  customerDao.getCustomerList();
//    }
//
//    public Flux<Customer> streamList() throws InterruptedException {
//        return  customerDao.getCustomerListStream();
//    }

    public Flux<PlanType> streamPlanTypeList() throws InterruptedException {
        return  insuranceDao.getPlanTypeListStream();
    }

    public Flux<Services> streamServicesList() throws InterruptedException {
        return  insuranceDao.getServiceListStream();
    }

    public Flux<CostType> streamCostTypeList() throws InterruptedException {
        return  insuranceDao.getCostTypeListStream();
    }

    public Flux<NetworkType> streamNetworkTypeList() throws InterruptedException {
        return  insuranceDao.getNetworkTypeListStream();
    }

    public Flux<InsurancePlan> streamInsurancePlanList() throws InterruptedException {
        return  insuranceDao.getInsurancePlanListStream();
    }

    public Mono<InsurancePlan> getInsurancePlanByName(String name) throws InterruptedException {
        return  insuranceDao.getInsurancePlanByName(name);
    }

    public Flux<InsurancePlan> getInsurancePlanByType(String type) throws InterruptedException {
        return  insuranceDao.getInsurancePlanByType(type);
    }

//    public Flux<InsurancePlan> getInsurancePlanByServiceName(String name) throws InterruptedException {
//        return  insuranceDao.getInsurancePlanByServiceName(name);
//    }
}
