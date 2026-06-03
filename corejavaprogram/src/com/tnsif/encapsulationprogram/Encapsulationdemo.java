package com.tnsif.encapsulationprogram;

public class Encapsulationdemo {
        
        int serialnumber;// properties or data member
        String name; // Declaration 
        int age;
        
        void show() {  // member function 
                System.out.println(serialnumber );
                System.out.println("name");
                System.out.println("56");
        }
        
        public static void main(String[] args) {
                Encapsulationdemo e=new Encapsulationdemo();
                e.serialnumber=9;
                e.name="harisha";
                e.age=56;
                
                e.show();
        }
}
