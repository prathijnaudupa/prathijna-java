public class Mul{  
public static void main(String args[]){  
   
int a[][]={{12,5,3},{1,2,3},{4,6,3}};    
int b[][]={{11,3,2},{5,6,2},{4,6,8}};    
    
int c[][]=new int[3][3];  
    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}  
System.out.print(c[i][j]+" ");    
} 
System.out.println();  
}    
}
}  