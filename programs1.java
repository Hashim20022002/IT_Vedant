
import java.lang.Math;

public class programs1 {
    public static void main(String[] args) {
        // for(int i=1;i<=10;i++) {
        // System.out.println(i);
        // }

        // int sum=0;
        // for (int j=1;j<=10;j++) {
        // sum=sum+j;
        // }
        // System.out.println("Sum is:"+sum);
        // }

        // prime number
        // int n=2;
        // int count=0;
        // for(int i=2;i<=n/2;i++) {
        // if(n%i==0) {
        // count++;
        // }}
        // if(count>0) {
        // System.out.println("not prime number");
        // }
        // else {
        // System.out.println("prime number");
        // }
        // }

        // print all prime numbers between 2 to 100
        // for(int n=2;n<=100;n++){
        // int count=0;
        // for(int i=2;i<=n/2;i++){
        // if(n%i==0){
        // count++;
        // }
        // }
        // if(count==0){
        // System.out.println(n);
        // }
        // }

        // fibonacci series
        // int a=0,b=1,c;
        // System.out.println(a);
        // System.out.println(b);
        // for(int i=1;i<=10;i++){
        // c=a+b;
        // System.out.println(c);
        // a=b;
        // b=c;
        // }

        // reverse a number & Palindrome
        // int n=56761,temp=n, rem, rev=0;
        // while(n!=0)
        // {
        // rem=n%10;
        // rev=rev*10+rem;
        // n=n/10;
        // }
        // System.out.println("Reversed Number: "+rev);
        // if(rev==temp)
        // {
        // System.out.println("Palindrome Number");
        // }
        // else
        // {
        // System.out.println("Not a Palindrome Number");

        // }

        // Strong Number
        // 145 = 1! + 4! + 5!
        // int n = 145, sum = 1, mainsum = 0, rem, temp = n;
        // while (n != 0) {

        //     rem = n % 10;

        //     for (int i = 1; i <= rem; i++) {
        //         sum = sum * i;
        //     }
        //     mainsum = mainsum + sum;
        //     n = n / 10;
        //     sum = 1;
           
        // }
        //  System.out.println(mainsum);
        //  if(mainsum==temp)
        //  {
        //     System.out.println("Strong Number");
        //  }
        //  else
        //  {
        //     System.out.println("Not a Strong Number");
        //  }
        
// Armstrong Number
// 153 = 1^3 + 5^3 + 3^3
// 9474 = 9^4 + 4^4 + 7^4 + 4^4
//         int n=9474,  count=0, temp=n, sum=0, rem, j=n;
// while(temp!=0)
// {
// count++;
// temp=temp/10;
// }
// while(n!=0)
// {
// rem=n%10;
// sum=sum+(int)Math.pow(rem, count);
// n=n/10;
// }
// System.out.println(sum);
    
//     if(j==sum)
//     {
//         System.out.println("Armstrong Number");
//     }
//     else
//     {
//         System.out.println("Not an Armstrong Number");
//     }


// print individual numbers in a number
// 157= 1,5,7
int n=15768, temp=n, count=0, i;

while(temp!=0)
{
count++;
temp=temp/10;
}
int a[]= new int[count];
for(i=0;i<count;i++)
{
a[i]=n%10;
n=n/10;
}
for(i=a.length-1;i>=0;i--)
{
System.out.println(a[i]);
}

}
}

