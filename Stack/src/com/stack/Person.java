package com.stack;

public class Person {
    private  String  name;
    private String roolno;
            public Person(String name,String roolno)
            {
                this.name=name;
                this.roolno=roolno;
            }
            public String toString(){
        return "Name :" + this.name + "RollNo :" + this.roolno;
            }
}
