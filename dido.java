import java.util.Scanner;
public class dido {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");

        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=0;
        int sum=0;
        float avg=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.print("reverse =");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j]>arr[i]){
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println("max="+max);
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
        System.out.println("Second largest="+arr[n-1]+" Third largest="+arr[n-2]);

        sc.close();
    }
}
