import java.io.*;
import java.util.*;
class revstring2
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char charr[] = str.toCharArray();
        int len = charr.length;
        int i ;
        for(i=len -1;i>=0;i--)
        {
            System.out.print(charr[i]);
        }
    }}
    
            