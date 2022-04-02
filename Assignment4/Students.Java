package Week3.day1;

public class Students {
	


	public static void main(String[] args) {
	
		Students stud=new Students();
		stud.getStudentInfo(321);
		stud.getStudentInfo(321, "Gayathri");
		stud.getStudentInfo("stud@gmail.com", 999999999);

	}
	
	public void getStudentInfo(int studId)
	{
		System.out.println("Student Id:"+studId);
	}
	public void getStudentInfo(int studId,String studName)
	{
		System.out.println("\n Student Id:"+studId + "\n Student Name:"+studName);
	}
	public void getStudentInfo(String studEmail,long studPhoneNo)
	{
		System.out.println("\n Student Email:"+studEmail + "\n Student Phone Number:"+studPhoneNo);
	}
	
}
