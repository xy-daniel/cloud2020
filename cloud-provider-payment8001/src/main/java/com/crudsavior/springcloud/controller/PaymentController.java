package com.crudsavior.springcloud.controller;

import com.crudsavior.springcloud.entities.CommonResult;
import com.crudsavior.springcloud.entities.Payment;
import com.crudsavior.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * PaymentController
 *
 * @author arctic
 * @date 2020/11/17
 **/
@RestController
@RequestMapping("/payment/")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "create")
    public CommonResult<Integer> create(Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果："+result);
        if (result>0){
            return new CommonResult<>(200, "success", result);
        }
        return new CommonResult<>(501, "fail");
    }

    @GetMapping(value = "get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果："+result);
        log.info("测试devtools一次");
        log.info("测试devtools二次");
        if (result != null){
            return new CommonResult<>(200, "success", result);
        }
        return new CommonResult<>(501, "fail");
    }

}