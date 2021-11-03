public class unique
{
	public static void main(String[] args)  
{  
int rows=5;      
for (int i= 1  ; i<=rows ; i++)  
{ 
for (int j=1; j<=rows; j++)  
{ 
     if(j==i)
    { System.out.print("0 ");
    for(int k=0; k<rows-j; k++)
      System.out.print(j + " ");
    }
    if(j<i)
    {
       System.out.print(j + " ");
    }
}  
System.out.println();  
}  
}  
}
