package com.company.tests;

import com.company.java.details.Details;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetailsTest {

    @Test
    void testToStringWriteDetais() {
        String result = "legs";
        assertEquals(result, Details.LEGS.toString());
    }
}