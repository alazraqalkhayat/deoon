package com.mokh.deoon.items;

public class Items_of_all_customers {

    String customer_name,customer_phone_number;

    public Items_of_all_customers(String customer_name, String customer_phone_number) {
        this.customer_name = customer_name;
        this.customer_phone_number = customer_phone_number;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_phone_number() {
        return customer_phone_number;
    }
}
