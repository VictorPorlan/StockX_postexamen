package edu.pingpong.StockX.item;

public class Sale implements Offer{
    private String size;
    private Integer sale;
    public Sale(String size, Integer sale){
        this.size = size;
        this.sale = sale;

    }
    @Override
    public String toString(){
        return "\n\t\t"+ size() +"\t\t"+ value();
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.sale;
    }
}
