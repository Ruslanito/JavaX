package com.ruslanito.Tutorials.TkachYura.Practice;

import java.util.Date;

/**
 * Created by Ruslanito on 11.02.2017.
 */

/**
public class DealsInfo {


    public class Party {// стороны сделок
        private String name;

        public String getName() {//вывод имени стороны сделки
            return name;
        }

        public void setName(String newvalue) { //ввод имени стороны сделки
            this.name = newvalue;
        }
    }

    public class Product {// товары отражённые в сделке
        private String title;
        private int price;
        private int quantity;
        int cost;

        public String getTitle() {
            return title;
        }

        public void setTitle(String newtitle) {
            this.title = newtitle;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(int newprice) {
            this.price = newprice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int newquantity) {
            this.quantity = newquantity;
        }

        public  int getCost (){
            cost = price*quantity;
            return cost;
        }
    }

    public class Deal {
        private Date date = new Date();
        private Party seller;
        private Party buyer;
        private Product[] products;
        int summ = 0;

        public Date getDate() {
            return date;
        }

        public String getSeller() {
            return String.valueOf(seller);
        }

        public String getBuyer() {
            return String.valueOf(buyer);
        }

        public Product[] getProducts() {
            return products;
        }

        //конструктор сделок
        public Deal (Party buyer, Party seller, Product[] product){
            date = new Date();
            this.seller = seller;
            this.buyer = buyer;
            this.products = product;
        }

        public int getSumm(){
            for (Product prod: products) {
                summ = summ + Product.getCost();
            }
            return summ;


        }
    }


}

*/