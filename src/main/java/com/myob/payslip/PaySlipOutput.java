package com.myob.payslip;

import java.io.Serializable;

public class PaySlipOutput implements Serializable {
    private String name;
    private String lastName;
    private String payPeriod;
    private Double grossIncome;
    private Double incomeTax;
    private Double netIncome;
    private Double superAnnuation;

}
