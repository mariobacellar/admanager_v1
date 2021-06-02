package br.com.mariobacellar.admanager.model;

public class PeriodoIntDTOTest {

	public static void main(String[] args) {
		try {
			
			PeriodoInt 
			periodoAnos18_30 = new PeriodoInt("anos-18-30");
			periodoAnos18_30.setBeginInt(18);
			periodoAnos18_30.setEndInt(30);
			
			PeriodoInt 
			periodoAnos31_50 = new PeriodoInt("anos-31-50");
			periodoAnos31_50.setBeginInt(31);
			periodoAnos31_50.setEndInt(50);

			int	ageUserRequest20 = 18;
			int	ageUserRequest40 = 51;
			
			if ( periodoAnos18_30.hasBetween(ageUserRequest20 )) System.out.println("["+ageUserRequest20+"]  is between "+periodoAnos18_30);
			if ( periodoAnos18_30.hasBetween(ageUserRequest40 )) System.out.println("["+ageUserRequest40+"]  is between "+periodoAnos18_30);
			
			if ( periodoAnos31_50.hasBetween(ageUserRequest20 )) System.out.println("["+ageUserRequest20+"]  is between "+periodoAnos31_50);
			if ( periodoAnos31_50.hasBetween(ageUserRequest40 )) System.out.println("["+ageUserRequest40+"]  is between "+periodoAnos31_50);

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}	
	
}
