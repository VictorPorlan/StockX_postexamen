package edu.pingpong.StockX.criteria;
import java.util.ArrayList;

import edu.pingpong.StockX.item.Ask;
import edu.pingpong.StockX.item.Sale;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;
import java.util.List;

public class Sales implements Criteria{
    private List<Offer> sales = new ArrayList<Offer>();
    public Sales(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        sneaker.offers().stream().filter(s -> s instanceof Sale).forEach(sales :: add);
        return sales;
    }
}