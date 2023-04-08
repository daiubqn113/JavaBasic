package day3;
/*
 * Modify the program to sum only the odd numbers from 1 to 100, and compute the average. (HINTS: n is an odd number if n % 2 is not 0.)

 */
public class tinhtongsole {

	public static void main(String[] args) {
		
		int sum =0; 
		int count = 0;
		double avegare = 0;
		
		for( int i=1; i <= 100;i++ ) {
			if(i%2==1) {
				sum = sum + i;
				count++;
			}
			
		}
		System.out.println("Tổng là : " + sum);
		
	
		avegare = (double)sum/(double) count;
		System.out.println("Tổng trung bình: " + Math.round(avegare*100.0)/100.0);
		
	}

}
