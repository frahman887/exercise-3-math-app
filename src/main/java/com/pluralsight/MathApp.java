package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
    /*QUESTIONS:
1. Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any
value you want. Print the answer (i.e "The highest salary is ...")


     */
        int bobSalary = 175000;
        int garySalary = 128000;
        int highestSalary = Math.max(bobSalary, garySalary);
        if (bobSalary == garySalary){
            System.out.println("Gary has the same salary as Bob of:$" + highestSalary);
        } else if (bobSalary == highestSalary) {
            System.out.println("Bob has the highest salary of :$" + highestSalary);
        }
          else{
            System.out.println("Gary has the highest salary of:$" + highestSalary);
        }
/*
2. Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want.

 */
        int carPrice = 12000;
        int truckPrice = 15000;
        int lowestPrice= Math.min(truckPrice, carPrice);
        if (carPrice == truckPrice){
            System.out.println(" both car and truck are the same price of $" + lowestPrice);}
          else if (carPrice == lowestPrice){
            System.out.println("car costs the lowest. it costs :$" + lowestPrice);
        } else {
            System.out.println("truck costs the lowest. it costs :$" + lowestPrice);
        }
/*
3. Find and display the area of a circle whose radius is 7.25
 */
    double circRadius = 7.25;
    double area = Math.PI * Math.pow(circRadius, 2);
    System.out.println("the area of the circle is: " + area);













    }
}
