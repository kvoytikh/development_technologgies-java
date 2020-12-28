package com.company.tests;

import com.company.java.Brand;
import com.company.java.Chair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChairStateTest {
    Chair ourChair1 = new Chair(Brand.AMF, 100);
    @Test
    void testToStringWriteChairState() {
        String result = " not  ready ";
        assertEquals(result, ourChair1.getState().toString());
    }

}