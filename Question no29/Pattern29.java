import java.util.*;
public class Pattern29{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i =0 ;i<n;i++){
     for(int j =0; j<n+i ; j++){
       if(j<n-i-1){
        System.out.print("\t");
       }else{
        if(j==n-1-i || j == n+i-1 ) System.out.print((i+1)+"\t");
        else System.out.print("0\t");
       }
     }
     System.out.println();
    System.out.println(); 
   }

  }
}