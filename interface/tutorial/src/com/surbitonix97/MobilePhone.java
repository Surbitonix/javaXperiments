package com.surbitonix97;

public class MobilePhone implements ITelephone{
    private long myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(long myNumber)
    {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone is ON!");

    }

    @Override
    public void dial(long phoneNumber) {
        if (isOn)
        {
            System.out.println("now calling "+phoneNumber);
        }else
            {
                System.out.println("phone is off");
            }


    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Answering the mobile phone");
        }else
        {
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(long phoneNumber) {
        if (phoneNumber==myNumber && isOn)
        {
            isRinging = true;
            System.out.println("ringtone playing...");
        } else
        {
            isRinging = false;
            System.out.println("mobile phone is off or number is different");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
