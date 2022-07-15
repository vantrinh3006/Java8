package DefaultMethod;

interface Interface3 {
    default void doJobA() {
        System.out.println("do job A in Interface3");
    }
}
public class DefaultMethod_MethodSuperClassSameName {
        void doJobA() {
            System.out.println("do job A in super class");
        }

        public static void main(String[] args) {
            DefaultMethod.DefaultMethod_MethodSuperClassSameName object = new DefaultMethod.DefaultMethod_MethodSuperClassSameName();
            object.doJobA();
        }
}