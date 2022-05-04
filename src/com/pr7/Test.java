package com.pr7;

public class Test {
    public static void main(String[] args) {
        /*
        * 将卖商品和商品分开
        * 当需要添加商品时，只需要添加商品类即可，无需更改GoodsShop
         */
        GoodsShop shop = new GoodsShop();
        Goods goods1 = new Cola();
        Goods goods2 = new Fanta();
        shop.sellGoods(goods1);
        shop.sellGoods(goods2);
        double money = shop.getMoney();
        System.out.println("一共售出价格："+money);
    }
}
