import java.util.Scanner;
public class target {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int p=0,q=0;
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    p=i;
                    q=j;
                    break;
                }
            }
        }
        System.out.println("First index ="+p+" Second index ="+q);
        sc.close();
    }
}
