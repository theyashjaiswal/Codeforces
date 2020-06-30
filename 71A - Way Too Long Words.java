import java.util.*;
import java.io.*;
 
public class Main
{
    public static void main(String args[])
    {  
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        String[] words=new String[n+1];
        for(int i=0;i<n+1;i++)
        {
            words[i]=input.nextLine();
        }
        for(int j=0;j<n+1;j++)
        {
            if(words[j].length()>10){
                String firstchar = Character.toString(words[j].charAt(0));
                String lastchar = Character.toString(words[j].charAt(words[j].length()-1));
                String wordlength = Integer.toString(words[j].length()-2);
                System.out.print(firstchar.concat(wordlength).concat(lastchar));
            }
            else{
                System.out.print(words[j]);
            }
            
            System.out.print("\n");
        }
    }
}
