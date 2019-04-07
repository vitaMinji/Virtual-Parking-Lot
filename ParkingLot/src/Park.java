import java.util.Scanner;

public class Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		Place lot = new Place();
		
		while(true) {
			System.out.println("Parking lot Situation");
			System.out.println("What do you want?");
			System.out.println("1.parking     2. exit     3.close");
			int act = scr.nextInt();
			
			if(act==1) {
				System.out.println("We show you empty places");
				lot.getPlace();
				System.out.println("Please put your car number.");
				int carNum = scr.nextInt();
				lot.setPlace(carNum);
				
			}else if(act==2){
				System.out.println("Please put your car number");
				int carNum = scr.nextInt();
				lot.exitCar(carNum);
			}else if(act == 3){
				scr.close();
				break;
			}
			
		}
		
	}

}
