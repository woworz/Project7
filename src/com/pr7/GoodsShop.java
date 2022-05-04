package com.pr7;

public class GoodsShop {
    public double money = 0;
    // 定义卖商品这个行为
    public double sellGoods(Goods goods) {
        double price = goods.getPrince();
        return money+=price; // 卖商品收入
    }
    public double getMoney() {
        return money; // 最后返回总收入
    }
}
