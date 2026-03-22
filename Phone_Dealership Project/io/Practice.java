package io;
import java.io.IOException;
import java.
public class Practice {
    public static void main(String[] args){

        Smartphone sm1 = new Smartphone("iphone 11",65000,"red");
        Smartphone sm2 = new Smartphone("iphone 12",700000,"blue");
        Smartphone sm3 = new Smartphone("Galaxy  Flip3",85000,"black");
        Smartphone sm4 = new Smartphone("Galaxy fol 3",150000,"White");

        //create  a threee employees
        Employee e1 = new Employee("Shiv",1);
        Employee e2 = new Employee("Pankaj",2);
        Employee e3 = new Employee("Prince",3);

        //create  a customer
        Customer cm1 = new Customer("A",80000);
        Customer cm2 = new Customer("B",90000);
        Customer cm3 = new Customer("C",40000);

        //Calling buy method from Customer
                                //output:
        cm1.buy(sm1);          //Trying to buy the smartphones iphone 11 red 65000
        e1.sellPhone(cm1,sm1); //sold the smartphone to the customer A

                                //output:
        cm2.buy(sm4);          //  Trying to buy the smartphones Galaxy fol 3 White 150000
        e2.sellPhone(cm2,sm4); // The 12-month emi for buying this smartphones will be : 12500.0

                                //output:
        cm3.buy(sm2);           //Trying to buy the smartphones iphone 12 blue 700000
        e3.sellPhone(cm3,sm2);  // The 12-month emi for buying this smartphones will be : 58333.333333333336

    }
}
