import java.util.*;
class Saree
{
    String color;
    Saree()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the color of saree you want");
        color=sc.nextLine();
    }
}
class CottonSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    CottonSaree()
    {
       cost=300;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 100 and no of sarees you want ");
         while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=100)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=100)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class SilkSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    SilkSaree()
    {
       cost=250;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 100 and no of sarees you want ");
         while(true)
        {
             no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=100)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=100)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class FashionSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    FashionSaree()
    {
       cost=500;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 100 and no of sarees you want ");
         while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=100)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=100)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class PattuSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    PattuSaree()
    {
       cost=1000;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 100 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=100)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=100)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class CottonAndSilkSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    CottonAndSilkSaree()
    {
       cost=550;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 200 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=200)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=200)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class CottonAndFashionSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    CottonAndFashionSaree()
    {
       cost=800;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 200 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=200)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=200)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class CottonAndPattuSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    CottonAndPattuSaree()
    {
       cost=1300;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 100 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=200)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=200)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class SilkAndPattuSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    SilkAndPattuSaree()
    {
       cost=1250;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 100 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=200)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=200)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class SilkAndFashionSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    SilkAndFashionSaree()
    {
       cost=750;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 200 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=200)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=200)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class FashionAndPattuSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    FashionAndPattuSaree()
    {
       cost=1500;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 200 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=200)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=200)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class CottonAndSilkAndFashionSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    CottonAndSilkAndFashionSaree()
    {
       cost=1050;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=300;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 300 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=300)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=300)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class SilkAndFashionAndPattuSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    SilkAndFashionAndPattuSaree()
    {
       cost=1750;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=300;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 300 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=300)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=300)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}
class CottonAndSilkAndFashionAndPattuSaree extends Saree
{
    int cost;
    int no_of_sarees,TotalCost,TotalSarees;

    CottonAndSilkAndFashionAndPattuSaree()
    {
       cost=2050;
       additionalStock();
    }
    void additionalStock()
    {
        int remainigStock=400;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values from 1 to 400 and no of sarees you want ");
        while(true)
        {
            no_of_sarees=sc.nextInt();
            if(no_of_sarees>0&&no_of_sarees<=100)
            {
                TotalCost=no_of_sarees*cost;
            }
            else{
                System.out.println("entered wrong number please enter correct number");
            }
            if(no_of_sarees>0&&no_of_sarees<=100)
                break;
        }
        TotalSarees=remainigStock-no_of_sarees;
        System.out.println("remaining sarees ="+TotalSarees+"cost you have to pay ="+TotalCost);

    }

}

class Project2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter To saree World");
        System.out.println("Enter the type of saree:");
        System.out.println("1.Cotton Saree");
        System.out.println("2.Silk Saree");
        System.out.println("3.Fashion Saree");
        System.out.println("4.Pattu Sarees");
        System.out.println("5.Cotton Saree and Silk Saree");
        System.out.println("6.Cotton and Fashion saree");
        System.out.println("7.cotton and Pattu Saree");
        System.out.println("8.Silk saree and Pattu Sarees");
        System.out.println("9. Silk saree and Fashion Sarees");
        System.out.println("10. Fashion and Pattu sarees");
        System.out.println("11. cotton and silk and Fashion sarees");
        System.out.println("12. silk and fashion and Pattu sarees");
        System.out.println("13. Cotton and Silk and Fashion and Pattu sarees");
        System.out.println("14. To Exit from Shopping")
        LinkedList<Saree> s=new LinkedList<>();
        while(true)
        {
            int n=sc.nextInt();
            switch(n)
            {
                case 1: s.add(new CottonSaree());
                        break;
                case 2: s.add(new SilkSaree());
                        break;
                case 3: s.add(new FashionSaree());
                        break;
                case 4: s.add(new PattuSaree());
                        break;
                case 5: s.add(new CottonAndSilkSaree());
                        break;
                case 6: s.add(new CottonAndFashionSaree());
                        break;
                case 7: s.add(new CottonAndPattuSaree());
                        break;
                case 8: s.add(new SilkAndPattuSaree());
                        break;
                case 9: s.add(new SilkAndFashionSaree());
                        break;
                case 10: s.add(new FashionAndPattuSaree());
                         break;
                case 11: s.add(new CottonAndSilkAndFashionSaree());
                         break;
                case 12: s.add(new SilkAndFashionAndPattuSaree());
                         break;
                case 13: s.add(new CottonAndSilkAndFashionAndPattuSaree());
                         break;
                case 14: System.out.println("Thank You And Visit Again");
                         break;
                default: System.out.println("Entered wrong number Thank You And Visit Again");
                         break;
            }
            if(n>13)
                break;
        }
        
    }
}