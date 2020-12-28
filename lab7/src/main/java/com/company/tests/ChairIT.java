package com.company.tests;

import com.company.java.Chair;
import com.company.java.NumberDetailsException;
import com.company.java.details.ChairCover;
import com.company.java.details.Detail;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;


class ChairIT {

    List<Detail> details = new ArrayList<>();
    @Test
    void testAddDetailIfSuccessMockito() throws NumberDetailsException {
            Chair chair = spy(Chair.class);

            details = chair.addDetail(new ChairCover(30, 40));

            when(chair.addDetail(new ChairCover(30, 40)).size()).thenReturn(1);
            assertEquals(chair.addDetail(new ChairCover(30, 40)).size(), details.size());
            verify(chair).addDetail(new ChairCover(30, 40));
    }


    @Test
    void testToStringChairDetailsWeNeed() {
        Chair chair = Mockito.mock(Chair.class);


        String result = "AMF -> you need: ChairCover(width, length) -> (30.0, 40.0); " +
                "Legs -> 4; bolts -> 6";
        when(chair.toString()).thenReturn(result);
        assertEquals(chair.toString(), result);
    }
}