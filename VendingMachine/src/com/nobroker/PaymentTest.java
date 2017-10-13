package com.nobroker;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {
    @Test
    public void getTotal() throws Exception {

        Payment payment = new Payment(10,4,1,0);

        assertEquals(40, payment.getTotal());

    }

}