package nestedClass;

public class TestOuterClass {

    public static void main(String[] args) {

        OuterClass outerClass =new OuterClass();

        outerClass.outerMethodA();
        outerClass.outerMethodB();

        outerClass.innerA.innerAMethodA();
        outerClass.innerA.innerAMethodB();

    }
}
