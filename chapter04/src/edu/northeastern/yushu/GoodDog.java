package edu.northeastern.yushu;

public class GoodDog {
    int counter=0;
    private int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        this.size=s;
    }
    void bark(){
        if (size>60){
            System.out.println("Woof!");
        }else if (size>14){
            System.out.println("Ruff!");
        }else {
            System.out.println("Yip!");
        }
    }
    public static void main(String[] args) {
        GoodDog g1=new GoodDog();
        g1.setSize(55);
        System.out.println(g1.getSize());
        g1.bark();
        GoodDog[] dogs=new GoodDog[2];
        dogs[0]=new  GoodDog();
        dogs[1]=new  GoodDog();
        dogs[0].setSize(77);
        dogs[1].setSize(9);
        System.out.println(dogs[1].getSize());
        //Exercise
        int count =0;
        GoodDog[] m=new GoodDog[20];
        int x=0;
        while (x<9){
            m[x]=new GoodDog();
            m[x].counter=m[x].counter+1;
            count=count+1;
            count=count+m[x].maybeNew(x);
            x=x+1;
        }
        System.out.println(count+" "+m[1].counter);
    }
    public int maybeNew(int index){
        if (index<5){
            GoodDog m4=new GoodDog();
            m4.counter=m4.counter+1;
            return 1;
        }
        return 0;
    }
}
