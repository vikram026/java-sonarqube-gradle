package com.nisum.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    private Service service =new Service();

    @Test
    public void testSum(){
        int result=service.sum(1,2);

        Assertions.assertEquals(3,result);
    }

}
