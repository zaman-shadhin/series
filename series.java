import java.util.Scanner;
public class series {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter initial number : ");  
    int m = input.nextInt();
    System.out.println("eNTER final number : ");  
    int n = input.nextInt();
    int sum=0;
    int i;
    for(i=m;i<=n;i=i+2){
        System.out.print(i+" + ");
        sum=sum+i;   
    }
    System.out.print(" = "+sum);  
    }
   
}
