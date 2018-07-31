import java.util.*;
class Dl
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int l=0,d=0;
        for(int i=0;i<a.length();i++)
        {
        if(Character.isLetter(a.charAt(i)))
             l++;
        else if(Character.isDigit(a.charAt(i)))
        d++;
        }
        if(l!=0 && d!=0)
        System.out.print("yes");
        else
        System.out.print("no");

}
}






