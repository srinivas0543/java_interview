package java_interview;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,},{3,4}};
	
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
		 System.out.println("Transposed Matrix");
		 
		 for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length; j++) {
	            	
	            		  System.out.print(a[j][i]+" ");
	            	
	            }
	            System.out.println();
	        }
	}

}
