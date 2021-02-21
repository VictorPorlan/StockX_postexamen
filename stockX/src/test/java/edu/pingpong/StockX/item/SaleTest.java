package edu.pingpong.StockX.item;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class SaleTest {
    Sale sale;
    @Before
    public void setupBid(){
        this.sale = new Sale("13", 200);
    }
    @Test
    public void constructorTest(){
        assertNotNull(sale);
        assertEquals("\n\t\t"+ "13" +"\t\t"+ "200", sale.toString());
    }
}