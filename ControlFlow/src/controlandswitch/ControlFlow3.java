package controlandswitch;

public class ControlFlow3 {
    public static void main(String[] args) {

        int a=90;
        if(a>=100)
        {
            System.out.println("Excellent");
        }
        else if (a>=70)
        {
            System.out.println("Good Job!");
            if(a==90)
            {
                System.out.println("Yes 90");
                if(a>100)
                {
                    System.out.println("less then 100");
                }
                else if(a>120)
                {
                    System.out.println("gt 120");
                }
                else if (a<10) {
                    System.out.println("ls 10");
                }
                else if (a==90) {
                    System.out.println("Yes a==90");
                }
                else {
                    System.out.println("Not found");
                }
            }
        }
        else if (a>=50)
        {
            System.out.println("Keep Learning...");
        }
        else {
            System.out.println("Need Improvement");
        }
    }
}
