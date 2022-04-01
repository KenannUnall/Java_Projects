package hafta3_EnginDemirogKamp;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setName("Yasin Turan ");
		user1.setCompanyName("Hepsi Burada");
		user1.setNationalIdentity("123456789");
		
		Student student1 = new Student();
		student1.setName("Kenan Ünal");
		student1.setSchoolName("SUBÜ");
		student1.setNationalIdentity("123456789");
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Emir Tonkal");
		instructor1.setClassName("12ATP");
		instructor1.setNationalIdentity("123456789");
		
		UserManager UserManager1 = new UserManager();
		UserManager1.take(user1);
	
	
		
	}

}
