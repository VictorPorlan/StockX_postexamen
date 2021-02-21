package edu.pingpong.StockX.criteria;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item sneaker);
}
