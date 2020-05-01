package com.surbitonix97;

public interface ITelephone {
    //define the methods to be used...the code is still in the class
    void powerOn();
    void dial(long phoneNumber);
    void answer();
    boolean callPhone(long phoneNumber);
    boolean isRinging();

}
