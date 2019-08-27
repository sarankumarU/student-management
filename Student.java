package com.decoders;
class Student{  
    int id;  
    String name;
    String college;
     
    void insert(int i, String y, String z) {  
        id=i;  
        name=y;  
        college=z;
    }  
    void display(){System.out.println(id+" "+name+" "+college+" ");}  
}  