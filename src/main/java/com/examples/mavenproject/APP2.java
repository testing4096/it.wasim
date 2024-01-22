package com.examples.mavenproject;
import java.util.Scanner;
public class APP2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the first number from the user
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Get the second number from the user
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Get the operation from the user
	        System.out.print("Choose an operation (+, -, *, /,%): ");
	        char operation = scanner.next().charAt(0);

	        double result = 0;

	        // Perform the selected operation
	        switch (operation) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                                        	
	                } else {
	                    System.out.println("Error: Cannot divide by zero.");
	                    return;
	                }
	                break;
	            case'%':
	            	result =num1%num2;
	            	break;
	            default:
	                System.out.println("Error: Invalid operation.");
	                return;
	        }

	        // Display the result
	        System.out.println("Result: " + result);

	        // Close the scanner to avoid resource leaks
	        scanner.close();
	    }
	}


