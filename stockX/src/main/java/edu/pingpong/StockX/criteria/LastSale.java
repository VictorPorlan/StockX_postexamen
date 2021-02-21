package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class LastSale implements Criteria{
    private List<Offer> sales = new ArrayList<Offer>();
    public LastSale(){}
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Criteria sales = new Sales();
        this.sales.add(sales.checkCriteria(sneaker).get(0));
        return this.sales;
    }
}
