import java.util.*;
class Is
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n]; 
        int l=0;
        for(int i=0;i<n;i++)
        {
        a[i]=in.nextInt();
        if(a[i]==k)
        l++;
        }
        if(l!=0)
        System.out.print("yes");
        else
        System.out.print("no");

}
}






