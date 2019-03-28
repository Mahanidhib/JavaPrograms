package com.bridgelabz.util;
public class StackImplementation <T> {
//	static class stack  
//    { 
        int top=-1; 
        char items[] = new char[100]; 
  
      public  void push(char x) 
        { 
            if (top == 99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = x; 
            } 
        } 
  
     public   char pop()  
        { 
            if (top == -1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }  
            else 
            { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        } 
  
      public  boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
    } 

