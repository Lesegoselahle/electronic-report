/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsreport;

import java.util.Scanner;

public class electronicsreport{
    @SuppressWarnings("empty-statement")
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //single dimensinal array for cities
String [] cities = {"cape town","Port elizabeth","Pretoria"};
//two dimensional array for sales[city][console]
//0 =PS5 , 1 = XBOX ,3 = SWITCH
int[] sales;
        sales = {1000, 2000, 3000};
        {2000, 3000, 4000}
        {1500,1100,1200}
    };
    private String[] cities;
    private String[][] sales;
    private String topCITY;
    System.out.printin("GAMING COMSOLE REPORT")
            System.out.println("CITY\t\t PS5\t XBOS\t SWITCH");
    for(int i = 0; i<3; i++){
    System.out.println(cities[i] +"\t" + sales[i][0] + "\t" +sales[i][2] +"\t" + sales[i][3]);
    System.out.print("\n TOTALS FOR EACH CITY");
    int biggest = 0;
    String topCity = "";
    for(int i = 0 ;i<3 ;i++){
    int total = sales[i][0]+ sales[i][1] + sales[i][2];
    System.out.println(cities[i] + "-" + total);
    
    if(total> biggest){
    biggest= total;
    topCity= cities[i];
}
}
    System.out.println("\nCity WITH MOST SALES: " + topCITY):
}
}
    


       
        
       
    
    


    