
public class p160_exam2 {

	public static void main(String[] args) {
		int o = 0;
		for(int i = 1; i <= 100; i++) {
			if(i %3 == 0) {
				o += i;
				
			}
		}System.out.println("3의배수 합"+o);

		
		//4*x + 5*y = 60이 되는 x,y의 수
		for (int x = 1; x <=10; x++) {
			for (int y = 1; y <=10; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("x = " + x + " y = " + y);
				}
				
			}
		 }
		
		
	for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
