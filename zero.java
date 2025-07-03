import java.util.Scanner;
public class zero {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");

        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr1[i]=0;
        }
        for(int i=0;i<n;i++){
            
            if(arr[i]>0){
                arr1[k]=arr[i];
                k++;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]);
    
        }

        sc.close();
    }
}
