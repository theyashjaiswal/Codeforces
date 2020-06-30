import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {  
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        if(n%2==0 && n>2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
