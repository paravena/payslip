package com.myob.payslip;

import java.io.Serializable;
import java.util.Date;

public class PaySlipInput implements Serializable {
    private String name;
    private String lastName;
    private Integer annualSalary;
    private Double superRate;
    private Date paymentStartDate;

}
