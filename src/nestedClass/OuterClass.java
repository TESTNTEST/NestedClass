package nestedClass;

public class OuterClass {

    InnerClassA innerA = new InnerClassA();

    public void outerMethodA() {

        innerA.innerAMethodA();
        System.out.println("This is from outer MethodA");

    }

    public void outerMethodB() {

        System.out.println("This is from outer MethodB");

    }


    public class InnerClassA {

        public void innerAMethodA() {

            System.out.println("This is from InnerA MethodA");
        }


        public void innerAMethodB() {

            System.out.println("This is from InnerA MethodB");

        }

    }

    public class InnerClassB {

        public void innerBMethodA() {

            System.out.println("This is from InnerB MethodA");

        }

        public void innerBMethodB() {

            System.out.println("InnerB MethodB");

        }


    }
}
















            
            
