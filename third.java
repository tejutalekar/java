public class Sum
{  
    
static int Sum(int n)   //method initialize
{   
int sum = 0;   
//executes until the condition becomes false  
for (int i = 1; i <= n; i++)    
//adding the value of i to the sum variable  
sum = sum + i;   
return sum;   
}    
public static void main(String args[])   
{   
int n=7;   //calling method and prints the sum  
System.out.println("Sum of Natural Numbers is: "+Sum(n));  
}    
}
