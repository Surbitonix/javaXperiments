package com.surbitonix97;

public class Printer {
    private int tonerLevel = 0;
    private int pagesPrinted;
    private boolean printerDuplex;

    public Printer(int tonerLevel, int pagesPrinted)
    {
        if (tonerLevel > 0 || tonerLevel <= 100)
        {
            this.tonerLevel=tonerLevel;
        }

        this.pagesPrinted=pagesPrinted;
        //this.printerDuplex=printerDuplex;

    }

    public void  printingPages(int printOrder, boolean printerDuplex)
    {
        if (this.printerDuplex)
        {
            printOrder = printOrder / 2;

        }
        this.pagesPrinted+= printOrder;
        this.tonerLevel-=printOrder;

        System.out.println("total number of printed pages are "+this.pagesPrinted);
        System.out.println("toner level is "+this.tonerLevel);

    }

    public void fillToner(int inkAdd)
    {
        this.tonerLevel+=inkAdd;
        if (this.tonerLevel > 100 )
        {
            System.out.println("Toner level exceeded\nsetting maximum level");
            this.tonerLevel = 100;
        }
        System.out.println("toner level added " + inkAdd + "\n this is the new level " + this.tonerLevel);
    }

}
