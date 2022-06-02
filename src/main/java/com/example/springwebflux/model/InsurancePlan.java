package com.example.springwebflux.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("InsurancePlan")
public class InsurancePlan {

    @Id
    String id;
    String name;
    String type;
    String desc;
    @Field("monthly premium")
    String monthlyPremium;
    @Field("visitor travel")
    String visitorTravel;
    @Field("plan deductible")
    String planDeductible;
    @Field("maximum out of pocket")
    String maximumOutOfPocket;
    @Field("services")
    Services [] serviceAndNetworks;

    public InsurancePlan(String name, String type, String desc, String monthlyPremium, String visitorTravel,
                         String planDeductible, String maximumOutOfPocket, Services[] serviceAndNetworks) {
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.monthlyPremium = monthlyPremium;
        this.visitorTravel = visitorTravel;
        this.planDeductible = planDeductible;
        this.maximumOutOfPocket = maximumOutOfPocket;
        this.serviceAndNetworks = serviceAndNetworks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(String monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public String getVisitorTravel() {
        return visitorTravel;
    }

    public void setVisitorTravel(String visitorTravel) {
        this.visitorTravel = visitorTravel;
    }

    public String getPlanDeductible() {
        return planDeductible;
    }

    public void setPlanDeductible(String planDeductible) {
        this.planDeductible = planDeductible;
    }

    public String getMaximumOutOfPocket() {
        return maximumOutOfPocket;
    }

    public void setMaximumOutOfPocket(String maximumOutOfPocket) {
        this.maximumOutOfPocket = maximumOutOfPocket;
    }

    public Services[] getServiceAndNetworks() {
        return serviceAndNetworks;
    }

    public void setServiceAndNetworks(Services[] serviceAndNetworks) {
        this.serviceAndNetworks = serviceAndNetworks;
    }
}
