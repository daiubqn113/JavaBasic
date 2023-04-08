package day3;
/** Đề bài
 * Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average. The output shall look like:
The sum is 5050
The average is 50.5

 */

public class tinhtong {

	public static void main(String[] args) {
		int sum =0; 
		float avegare = 0;
		
		for( int i=1; i <= 10;i++ ) {
			sum = sum + i;
		}
		System.out.println("Tổng là : " + sum);
		
		
		avegare = sum/100;
		System.out.println("Tổng trung bình là : " + avegare);
		
	}

//	public static void sumAndAverage() {
//		int sum =0; 
//		int avegare = 0;
//		for( int i=1; i <= 100;i++ ) {
//			sum = sum + i;
//		}
//	}
}
