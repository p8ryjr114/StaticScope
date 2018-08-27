# StaticScope
This repository shows the scope of an object when we are working with static variables

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscope;
import java.util.Scanner;
/**
 *
 * @author p8ryjr114
 */
public class MyScope {
    static int counter;

    public int method1(int v){
        counter = 3+v;
        System.out.println("count = 3 + v (v is " + v + ")");
        return(counter);
}
    public int method2(int v){

        counter = counter * v;
        System.out.println("count = count * v (count currently is " + counter + " as v is " + v + ")");
        return(counter);

}
    public double method3(int v){
        counter = counter / v;
        System.out.println("count = count /v (count currently is " + counter + " as v is " + v + ")");
        return(counter);
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        MyScope instance1 = new MyScope ();

        System.out.println("method 1 --> " + instance1.method1(2) + "\n");
        System.out.println("method 2 --> " + instance1.method2(4) + "\n");
        System.out.println("method 3 --> " + instance1.method3(6) + "\n");
        counter = counter + 11;
        System.out.println("We added 11 onto counter so counter is now " + counter);
        MyScope instance2 = new MyScope();
        System.out.println("method 2 --> " + instance2.method2(4) + "\n");
        System.out.println("method 3 --> " + instance2.method3(6) + "\n");
        MyScope instance3 = new MyScope();
        System.out.println("method 1 --> " + instance3.method1(2) + "\n");
        System.out.println("method 2 --> " + instance3.method2(4) + "\n");
    }
    
}
