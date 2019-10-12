package com.company.designprinciple.DIP;

/**
 * 依赖倒置原则
 *
 * @author 郁农欣 部门：电商事业部
 * @version V1.0
 * @copyright Copyright 2014-2019 Chinalife-clec All Right Reserved
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class DIPTest
{
    public static void main(String[] args)
    {
        Customer wang=new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new ShaoguanShop());
        wang.shopping(new WuyuanShop());
    }
}
//商店
interface Shop
{
    public String sell(); //卖
}
//韶关网店
class ShaoguanShop implements Shop
{
    public String sell()
    {
        return "韶关土特产：香菇、木耳……";
    }
}
//婺源网店
class WuyuanShop implements Shop
{
    public String sell()
    {
        return "婺源土特产：绿茶、酒糟鱼……";
    }
}
//顾客
class Customer
{
    public void shopping(Shop shop)
    {
        //购物
        System.out.println(shop.sell());
    }
}
