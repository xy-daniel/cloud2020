package com.crudsavior.springcloud.dao;

import com.crudsavior.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * PaymentDao
 *
 * @author arctic
 * @date 2020/11/16
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
