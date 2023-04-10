package common;


public class Main {

	public static void main(String[] args) {
		System.out.printf("%-20s %-15s %-6s\n", "Họ tên", "Ngày sinh", "Mã SV");
		System.out.println("----- Thông tin sinh viên -----");
		Student student = new Student();
		student.hoTen = "Cao Trần Đại";
		student.ngaySinh = "29/08/199x";
		student.maSV = 1;
				
		student.inThongTin();
		
		Student student1 = new Student();
		student.hoTen = "Cao Trần Đại 001";
		student.ngaySinh = "29/08/199x";
		student.maSV = 1;
				
		student.inThongTin();
		System.out.printf("%-20s %-15s %-6s\n", "Họ tên", "Ngày sinh", "Mã SV");
		System.out.println("----- Thông tin giáo viên -----");
		Teacher teacher = new Teacher();
		teacher.hoTen = "Cao Trần Đại";
		teacher.ngaySinh = "29/08/199x";
		teacher.maGV = 123;
			
		teacher.inThongTin();
		
		Teacher teacher1 = new Teacher();
		teacher1.hoTen = "Cao Trần Đại 001";
		teacher1.ngaySinh = "29/08/19xx";
		teacher1.maGV = 124;
			
		teacher1.inThongTin();
	}
}
	


