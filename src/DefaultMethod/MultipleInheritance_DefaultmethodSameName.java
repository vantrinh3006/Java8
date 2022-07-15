package DefaultMethod;

interface Interface1{
    default void doJobA(){
        System.out.println("do job A in Interface1");
    }
    void doX();
}

interface Interface2{
    default void doJobA(){
        System.out.println("do job A in Interface2");
    }
}

class MultipleInheritance_SameName implements Interface1,Interface2 {

    @Override
    public void doJobA() {
        Interface1.super.doJobA();      //solution1
        //   System.out.println("C");       //solution2
    }

    @Override
    public void doX() {

    }

    public static void main(String[] args) {
        // object = new MultipleInheritance_SameName();
        MultipleInheritance_SameName object = new MultipleInheritance_SameName();
        object.doJobA();

    }
}

