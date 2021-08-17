package com.coveros.demo.helloworld;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
// Your First Program
// Making new changes to the code 
// at 2.38 pm
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now(); 
        System.out.println(dtf.format(now));
	
    }
}
