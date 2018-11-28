package com.example.thymleaf.testThymleaf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

public class TestCalc {

    @Mock
    Calc calc;

    @InjectMocks
    CalcService calcService = new CalcService();

    @Test
    public void testAdd(){
        when(calc.add(2,3)).thenReturn(5);
        assertEquals(calcService.add(2,3),5,0);

    }

}
