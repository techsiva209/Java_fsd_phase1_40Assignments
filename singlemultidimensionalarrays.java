
public class singlemultidimensionalarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a[], b = { 10 };
        a = new int[2][2];
        b = new int[2];
  
        // print single dimensional arrays
        for (int i = 0; i < 2; i++)
            System.out.println(b[i]);
  
        // print multi dimensional  arrays
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = 100;
                System.out.println(a[i][j]);
            }
        }
    
	}

}
