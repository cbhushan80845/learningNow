package printShape;

public class Print{  
public static void main(String[] args){  
int lines=10;  
int i=1;  
int j;  
for(i=1;i<=lines;i++){// this loop is used to print the lines  
	//System.out.print(i);
for(j=1;j<=i;j++){// this loop is used to print lines  
	System.out.print(i*j+" ");
//System.out.print(i*j+" ");  
}  
System.out.println(" ");  
}  
}  
}  
