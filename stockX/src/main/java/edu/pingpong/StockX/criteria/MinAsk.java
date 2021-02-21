package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria{
    private List<Offer> minAsk = new ArrayList<Offer>();
    private List<Offer> soloAsks;
    Criteria ask = new Asks();
    public MinAsk() {}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        soloAsks = ask.checkCriteria(sneaker);
        Offer minAk = soloAsks.stream().filter(o -> o!=null).min(Comparator.comparing(o -> o.value())).orElse(null);
        minAsk.add(minAk);
        return minAsk;
}}
