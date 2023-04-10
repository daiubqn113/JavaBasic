package day5;

public class Student {
	// Attribute
	String hoTen;
	String ngaySinh;
	int maSV;
	
	public void inThongTin() {
		System.out.printf("%-20s %-15s %-6s\n","Họ tên" ,"Ngày sinh" ,"Mã SV");
		System.out.printf("%-20s %-15s %-6s\n" , hoTen , ngaySinh , maSV);
		
		
	}
	
}
