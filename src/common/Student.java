package common;

public class Student extends AbstractUser{
	// Attribute
	int maSV;

	public void inThongTin() {
		
		System.out.printf("%-20s %-15s %-6s\n", hoTen, ngaySinh, maSV);
	}

}
