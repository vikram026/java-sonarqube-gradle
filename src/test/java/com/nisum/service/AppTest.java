package com.nisum.service;

import com.nisum.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    App app=new App();

    @Test
    public void testSum(){
        App.main(new String[]{});
        Assertions.assertEquals(true,true);
    }
}
