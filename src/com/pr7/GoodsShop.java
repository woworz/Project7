package com.pr7;

public class GoodsShop {
    public double money = 0;
    public double sellGoods(Goods goods) {
        double price = goods.getPrince();
        return money+=price;
    }
    public double getMoney() {
        return money;
    }
}
