package com.company.tests;

import com.company.java.Brand;
import com.company.java.Chair;
import com.company.java.NumberDetailsException;
import com.company.java.details.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;


class ChairTest {
    Chair ourChairAMF = new Chair(Brand.AMF, 100);
    Chair ourChairAMF1 = new Chair(Brand.AMF, 100);
    Chair ourChairAMF2 = new Chair(Brand.AMF, 100);
    Chair ourChairMONICA = new Chair(Brand.MONICA, 100);

    List<Detail> details = new ArrayList<>();

    @Test
    void testAddDetailIfSuccessBySimpleSizes() throws NumberDetailsException {
            details = ourChairAMF.addDetail(new ChairCover(30, 40));
            details = ourChairAMF.addDetail(new ChairLeg(4, 70));
            details = ourChairAMF.addDetail(new Bolt(6));

            assertEquals(3, details.size());
    }


    @Test
    void testEqualsIfSuccessAllSituations() {
        /*---рефлексивность----*/
        assertEquals(ourChairAMF, ourChairAMF);

        /*---симетричность---*/
        assertEquals(ourChairAMF, ourChairAMF1);
        assertEquals(ourChairAMF1, ourChairAMF2);

        /*---транзитивность----*/
        assertEquals(ourChairAMF, ourChairAMF1);
        assertEquals(ourChairAMF1, ourChairAMF2);
        assertEquals(ourChairAMF, ourChairAMF2);

        /*---согласованость----*/
        assertEquals(ourChairAMF, ourChairAMF1);

        /*----сравнение null----*/
        assertFalse(ourChairAMF.equals(null));
    }

    @Test
    void testHashCodeIfSuccess() {
        /*---рефлексивность----*/
        assertEquals(ourChairAMF.hashCode(), ourChairAMF.hashCode());

        /*---симетричность---*/
        assertEquals(ourChairAMF.hashCode(), ourChairAMF1.hashCode());
    }


    /*--false--*/
    @Test
    void testEqualsIfObjectsAreNotSimple() {
        assertFalse(ourChairAMF.equals(ourChairMONICA));
    }

    @Test
    void testToStringChairDetailsWeNeed() {
        String result = "AMF -> you need: ChairCover(width, length) -> (30.0, 40.0); " +
                "Legs -> 4; bolts -> 6";
        assertEquals(result, ourChairAMF.toString());
    }
}