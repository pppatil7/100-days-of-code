package learn.corejava;

public class TestArray{  
public static void main(String args[]){  
int a[][]={{1,3,4},{1,4,7},{3,7,7}};
int b[][]= {{3,4,5},{3,7,9},{4,7,7}};

int c[][]=new int[3][3];

for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		c[i][j]=0;
		for(int k=0;k<3;k++) {
			c[i][j]+=a[i][k]*b[j][k];
		}
	
		System.out.println(c[i][j]+" ");
		
	}
	System.out.println();
	
}

}
}