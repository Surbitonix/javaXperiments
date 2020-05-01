package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone myPhone;
        myPhone = new DeskPhone(07415);
        myPhone.powerOn();
        myPhone.dial(1234165);
        myPhone.callPhone(07415);
        myPhone.answer();

        myPhone = new MobilePhone(123456);
        myPhone.callPhone(123456);
        myPhone.answer();
    }
}
