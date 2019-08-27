package com.decoders;


public class TestStudent {  
public static void main(String[] args) {  
    Student s1=new Student();  
    Student s2=new Student();  
    Student s3=new Student();  
    s1.insert(1,"kumar", "x");  
    s2.insert(2,"irfan","y");  
    s3.insert(3,"nakul","z");  
    s1.display();  
    s2.display();  
    s3.display();  
}  
}  