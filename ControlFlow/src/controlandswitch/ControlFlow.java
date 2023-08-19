package controlandswitch;

public class ControlFlow {
    public static void main(String[] args) {

        int a=10;

        //nested if
        if(a==10)
        {
            System.out.println("a==10");  // 1
            if(a>100)
            {
                System.out.println("yes less then 100"); //2
                if (a%2==0)
                {
                    System.out.println("Even"); //3
                    if(a>10)
                    {
                        System.out.println("No");
                    }
                    else
                    {
                        System.out.println("Yes"); //4
                        if(a>2)
                        {
                            System.out.println("Yes a gt 2");
                            if(a%2!=0)
                            {
                                System.out.println("Odd");
                            }
                            else
                            {
                                System.out.println("yes");
                                if(a==10)
                                {
                                    System.out.println("THE END");
                                }
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("a not equal to 10");
            }
        }
    }
}
