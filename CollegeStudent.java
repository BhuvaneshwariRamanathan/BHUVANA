package inheritance;

class CollegeStudent extends Student{
int year;
String major;
CollegeStudent(){
	System.out.println("Default-CollegeStudent");
}
CollegeStudent(String name,char section,int id,int year,String major){
	super(name,section,id);
	this.year=year;
	this.major=major;
}
public int getYear() {
	return year;
}

public String getMajor() {
	return major;
}


}