package com.surbitonix97;

public class DeskPhone implements ITelephone {

    private long myNumber;
    private boolean isRinging;

    public DeskPhone(long myNumber)
    {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("phone is always on");

    }

    @Override
    public void dial(long phoneNumber) {
        System.out.println("now calling "+phoneNumber);

    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Answering the desk phone");
        }else
            {
                isRinging=false;
            }

    }

    @Override
    public boolean callPhone(long phoneNumber) {
        if (phoneNumber==myNumber)
        {
            isRinging = true;
            System.out.println("Buzz buzz");
        } else
            {
                isRinging = false;
            }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
