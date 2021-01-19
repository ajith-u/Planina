import java.util.*;

public class Planina{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int n=kb.nextInt();
    if(1<=n && n<=15){
      int x=2;
      for(int i=1;i<=n;i++) x+=x-1;
      System.out.print(x*x);
    }
  }  
} 