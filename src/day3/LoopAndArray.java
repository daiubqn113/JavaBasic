package day3;

public class LoopAndArray {
/**
 * Loop
 * Bài 1:
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cách 1
//		inMang();
		//Cách 2
		LoopAndArray loop1 = new LoopAndArray();
		loop1.inMang();
	}
//Bài 1
//	Cách 1
//	public static void inMang() {
//		int[] a;
//		a = new int[] {1,3,5,7,9};
//		for(int i = 0; i < a.length ; i++ ) {
//			if(a[i]%2==1) {
//				System.out.println(a[i]);
//			}
//		}
//	}
//	Cách 2
	public void inMang() {
		int[] a;
		a = new int[] {1,3,5,7,9};
		for(int i = 0; i < a.length ; i++ ) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
				
			}
		}
	}
	

}
