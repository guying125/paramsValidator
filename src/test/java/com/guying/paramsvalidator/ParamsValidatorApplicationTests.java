package com.guying.paramsvalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParamsValidatorApplicationTests {
    @Test
    void contextLoads() {
        String s = "1";
        Assertions.assertEquals(1, Integer.valueOf(s));
    }
}
