package ConstructorEx;

public class Demo {
    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample();
//        constructorExample.setId(1);
//        constructorExample.setName("nam");

        System.out.println(constructorExample.getId() + " " + constructorExample.getName());

        ConstructorExample constructorExample1 = new ConstructorExample(2,"van");

        System.out.println(constructorExample1.getId() + " " + constructorExample1.getName());
    }
}
