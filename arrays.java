import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // initializing array
        int arr[]={22,44,56,789,200};
        System.out.println(Arrays.toString(arr));
        //accessing array
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modification of array
        arr[2]=45;
        arr[3]=345;
        System.out.println(Arrays.toString(arr));
    }
}   