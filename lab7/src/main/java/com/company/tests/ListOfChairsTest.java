package com.company.tests;

import com.company.java.Brand;
import com.company.java.Chair;
import com.company.java.ListOfChairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOfChairsTest {
    ListOfChairs list = new ListOfChairs();
    Chair ourChair1 = new Chair(Brand.AMF, 100);


    @Test
    void testAddChair() {
        assertEquals(ListOfChairs.addChair(ourChair1).size(), 1);
    }

    @Test
    void countAllPriceOfKind() {
        assertEquals(list.countAllPriceOfKind("AMF"), 100);
    }

    @Test
    void findElementWithMaxPrice() {
        String res = "AMF -> you need: ChairCover(width, length) -> (30.0, 40.0); Legs -> 4; bolts -> 6";
        assertEquals(list.findElementWithMaxPrice(), res);
    }

    @Test
    void findAveragePrice() {
        assertEquals(list.findAveragePrice(), 100);
    }

    @Test
    void groupByPrice() {
        String res = "{cheap=[AMF -> you need: ChairCover(width, length) -> (30.0, 40.0); Legs -> 4; bolts -> 6]}";
        assertEquals(list.groupByPrice(), res);
    }
}