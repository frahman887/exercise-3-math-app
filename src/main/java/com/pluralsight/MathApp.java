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
//4. Find and display the square root a variable after it is set to 5.0
        double num = 5.0;
        double squarrt = Math.sqrt(num);
        System.out.println("your num sqrt is: " + squarrt);
//5. Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        int distX = x2 - x1;
        int distY = y2 - y1;
        double pythag = (double)Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
        System.out.println("your distance is: " + pythag);
//6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        float num1 = -3.8f;
        float absNum = Math.abs(num1);
        System.out.println("the abs value of your num is: "+ absNum);

//7. Find and display a random number between 0 and 1
        double randomNum = Math.random();
        System.out.println("Random number: " + randomNum);
//8. Calculate how many minutes are in 24 days, use a variable for each value you
//calculate with. BONUS: How many milliseconds?
        int days = 24;
        int hours = 24;
        int mins = 60;
        int calcMins = (days * hours) * mins;
        System.out.println("minutes in a day: " + calcMins);











    }
}
