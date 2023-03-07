//Currency Converter project is made with the help of core java.
    import java.util.Scanner;
	public class currencycounter{

		public static void main(String[] args) {
			try (Scanner sk = new Scanner(System.in)) {
                System.out.println("WElcome!!\nCurrency converter ");
                 System.out.print("What do you want to convert\n1.Dollar to INR \n2.INR to Dollar\n3.Inr to Dinar\n4.Dinar to INR\n");
                 int s=sk.nextInt();
                 System.out.println("Enter the amount of currency:");
                 double currency=sk.nextDouble();
  
                 switch(s) 
                 {
                 case 1:
                	 System.out.println("1 Dollar is equal to 81.64\n");
                	   
                  currency= ((currency)*(81.64)); 
                  System.out.println("The INR to Dollar is:"+currency+"dollar.\n");
                 break;
                 case 2:
                	 System.out.println("1 Dollar is equal to 81.64\n");
                  	  currency= ((currency)/(81.64));
                  System.out.println("The Dollar to INR is:"+currency+"rupees.\n");
                 break;
                 case 3 :
                	 System.out.print("1 Dinar is equal to 265.37 rupees\n");
                	  currency= ((currency)/(265.37));
System.out.print("The INR to dinar is"+currency+"dinar\n");
                 break;
                 case 4:
                	 System.out.print("1 Dinar is equal to 265.37 rupees\n");
                 	  currency= ((currency)*(265.37));
                 	System.out.print("The Dinar to INR is"+currency+"rupees\n");
                 break;
                 }
            }
	     

		}}


