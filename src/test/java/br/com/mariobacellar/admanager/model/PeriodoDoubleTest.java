package br.com.mariobacellar.admanager.model;

class PeriodoDoubleTest {

	public static void main(String[] args) {
		try {
			
			PeriodoDouble 
			periodoWage18_30 = new PeriodoDouble("renda-18-30");
			periodoWage18_30.setBeginDouble(18.00);
			periodoWage18_30.setEndDouble(30.00);
			
			PeriodoDouble 
			periodoWage31_50 = new PeriodoDouble("renda-31-50");
			periodoWage31_50.setBeginDouble(31.00);
			periodoWage31_50.setEndDouble(50.00);

			double	wageUserRequest20 = 18.01;
			double	wageUserRequest40 = 39.99;
			
			if ( periodoWage18_30.hasBetween(wageUserRequest20 )) 
				System.out.println("["+wageUserRequest20+"]  is between "+periodoWage18_30);
			else
				System.out.println("["+wageUserRequest20+"]  is NOT between "+periodoWage18_30);

			if ( periodoWage18_30.hasBetween(wageUserRequest40 )) 
				System.out.println("["+wageUserRequest40+"]  is between "+periodoWage18_30);
			else
				System.out.println("["+wageUserRequest40+"]  is NOT between "+periodoWage18_30);

			
			if ( periodoWage31_50.hasBetween(wageUserRequest20 )) 
				System.out.println("["+wageUserRequest20+"]  is between "+periodoWage31_50);
			else
				System.out.println("["+wageUserRequest20+"]  is NOT between "+periodoWage31_50);	
			
			if ( periodoWage31_50.hasBetween(wageUserRequest40 )) 
				System.out.println("["+wageUserRequest40+"]  is between "+periodoWage31_50);
			else
				System.out.println("["+wageUserRequest40+"]  is NOT between "+periodoWage31_50);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	}
}
