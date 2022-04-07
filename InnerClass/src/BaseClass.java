public final class BaseClass {
    private int num1;
    static double pi = 3.1416;

    public BaseClass(int num1) {
        this.num1 = num1;
        System.out.println("\n----------Base Class----------\n");
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void ShowNum1() {
        System.out.println("Num1 : " + num1);
    }

    public void ShowPi() {
        System.out.println("Pi : " + pi);
    }

    public void info()
    {
        
        String con = "BD";

        class InClass
        {
            private int road;

            public InClass()
            {
                road = 500;
                System.out.println("\n----------Method Locla Inner Class----------\n");
            }

            public void setRoad(int road)
            {
                this.road = road;
            }

            public void getRoad()
            {
                System.out.println("Road : " + this.road + "    Country : " + con + "  num1 : " + num1);
            }
        }



        InClass obj = new InClass();

        obj.getRoad();
        obj.setRoad(1111);
        obj.getRoad();
    }



    public class InnerClass {
        private int num2;

        public InnerClass() {
            num2 = 20;
            System.out.println("\n----------Inner Class----------\n");
        }

        public InnerClass(int num2) {
            this.num2 = num2;
            System.out.println("\n----------Inner Class----------\n");
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }

        public void ShowNum2() {
            System.out.println("Num2 : " + num2);
        }

        public void ShowInner() {
            System.out.println("Num1 : " + num1);
            System.out.println("Num2 : " + num2 + "\n");
        }
    }


    public static class NestedInnerClass {
        private int num3;

        public NestedInnerClass() {
            System.out.println("\n----------Nested Inner Class----------\n");
        }

        public NestedInnerClass(int num3) {
            this.num3 = num3;
            System.out.println("\n----------Nested Inner Class----------\n");
        }

        public void setNum3(int num3) {
            this.num3 = num3;
        }

        public void ShowNum3() {
            System.out.println("Num3 : " + num3);
        }

        public void ShowNestedInner() {
            // System.out.println("Num1 : " + num1);
            System.out.println("Num3 : " + num3 + "\n");
        }
    }
}
