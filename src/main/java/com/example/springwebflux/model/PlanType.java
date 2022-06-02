package com.example.springwebflux.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("InsurancePlanType")
public class PlanType {
    @Id
    private String id;
    private String type;
    private String desc;
    private String[] benefits;

    public PlanType() {
    }

    public PlanType(String type, String desc, String[] benefits) {
        this.type = type;
        this.desc = desc;
        this.benefits = benefits;
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

    public String[] getBenefits() {
        return benefits;
    }

    public void setBenefits(String[] benefits) {
        this.benefits = benefits;
    }

}
