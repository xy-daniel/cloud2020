package com.crudsavior.springcloud.service.impl;

import com.crudsavior.springcloud.dao.PaymentDao;
import com.crudsavior.springcloud.entities.Payment;
import com.crudsavior.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * PaymentServiceImpl
 *
 * @author arctic
 * @date 2020/11/17
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
