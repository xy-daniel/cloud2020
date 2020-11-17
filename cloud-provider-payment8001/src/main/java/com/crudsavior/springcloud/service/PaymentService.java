package com.crudsavior.springcloud.service;

import com.crudsavior.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * PaymentService
 *
 * @author arctic
 * @date 2020/11/17
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}