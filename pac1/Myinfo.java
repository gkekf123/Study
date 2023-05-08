package modi.cls.pac1;

public class Myinfo {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		if( year < 1 || year > 2020) {
			System.out.println("잘못 된 값 입력");
		} else {
			this.year = year;
		}
	}

//	public int getMonth() {
//		return month;
//	}
//
//	public void setMonth(int month) {
//		this.month = month;
//	}
//
//	public int getDay() {
//		return day;
//	}
//
//	public void setDay(int day) {
//		this.day = day;
//	}
//
//	public String getSsn() {
//		return ssn;
//	}
//
//	public void setSsn(String ssn) {
//		this.ssn = ssn;
//	}



	void info() {
		System.out.println("내 생일은 : " + year + " 년" + month + "월" + day + "일");
		System.out.println("주민번호 : " + ssn);
	}
	
}
