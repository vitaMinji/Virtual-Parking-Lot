
public class Place {
	int []array = {1,1,1,1,1,1,1,1,1,1,1};
	
	Place(){
		
	}
	
	Place(int a){
		
	}
	
	public void getPlace(){
		System.out.println("********************************************************");
		for(int i=0; i<10; i++) {
			if(array[i+1]==1) {
				System.out.print(i+1);
			}
		}
		System.out.println();
		System.out.println("********************************************************");
	}
	
	public void setPlace(int car) {
		for(int i=0; i<10; i++) {
			if(array[i+1]==1) {
				array[i+1]=car;
				System.out.println("Success!");
				break;
			}
		}
	}
	
	public void exitCar(int car) {
		int count=0;
		for(int i=0; i<10; i++){
			if(array[i+1]==car) {
				array[i+1]=1;
				count++;
				System.out.println("Success!");
				break;
			}
		}
		if(count==10) {
			System.out.println("You have't park car");
		}
	}
	
}
