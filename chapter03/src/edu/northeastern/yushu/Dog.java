package edu.northeastern.yushu;

public class Dog {
    String name;
    public void bark(){
        System.out.println(name+"   Ruff!");
    }
    public static void main(String[] args) {
	Dog d1=new Dog();
    d1.bark();
    d1.name="Bart";
    Dog[] d2=new Dog[3];
    d2[0]=new Dog();
    d2[1]=new Dog();
    d2[2]=d1;
    d2[0].name="Alice";
    d2[1].name="Smokey";
        System.out.println(d2[2].name);
        int x=0;
        while (x<d2.length){
            d2[x].bark();
            x=x+1;
        }
    }
}
