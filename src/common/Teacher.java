package common;

public class Teacher extends user{
	// Attribute
	int maGV;
	
	public void inThongTin() {
		
		System.out.printf("%-20s %-15s %-6s\n", hoTen, ngaySinh, maGV);
	}
}
