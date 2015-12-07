package com.myob.payslip.domain;

import java.io.Serializable;

public class PaySlipOutput implements Serializable {
    private String name;
    private String lastName;
    private String payPeriod;
    private Double grossIncome;
    private Double incomeTax;
    private Double netIncome;
    private Double superAnnuation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public Double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(Double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public Double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(Double netIncome) {
        this.netIncome = netIncome;
    }

    public Double getSuperAnnuation() {
        return superAnnuation;
    }

    public void setSuperAnnuation(Double superAnnuation) {
        this.superAnnuation = superAnnuation;
    }
}
