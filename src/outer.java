 class outer {
    static int num1;
    outer()
    {
        num1=10;
    }
    static class inner {
        int num2;

        inner() {
            num2 = 50;
        }

        public void display() {
            System.out.println(num1);
            System.out.println(num2);
        }


    }
}
class test{
    public static void main(String[] args) {
        outer.inner obj=new outer.inner();
        obj.display();
        outer obj2=new outer();
        System.out.println(obj2.num1);
    }
}
