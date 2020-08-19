
public class Ex2 {

	public static void main(String[] args) {
		WalkBad wb = new WalkBad();
		wb.walk();
		wb.walk(2);
		wb.walk(2, "m"); //m로 변환
		wb.walk(2, "cm"); //cm로 변환
		wb.walk(2, "inch"); //계산 불가능한 단위라고 가정
		WalkGood wg = new WalkGood();
		wg.walk();
		wg.walk(2);
		wg.walk(2, "cm");
	}

}
class WalkBad{
	public void walk() {
		System.out.println("100cm 이동");
	}
	public void walk(int step) {
		System.out.println(step * 100 + "cm 이동");
	}
	//사람 걸음 수에 따른 이동 거리를 지정한 단위에 따라 cm 변환 후 출력
	public void walk(int step, String unit) {
		//ex) 2걸음  = 100 * 2 = 200cm / 100 = 2m 한 결과를 출력
		//switch -case 문을 사용하여 단위 판별 ("cm" or "inch")
		double distance = 0.0;
		switch(unit) {
		case "cm" : //step * 100 결과를 m로 변환하기 위해 /100
				System.out.println(step * 100 + "cm 이동");
				break;
		case "m" :
				System.out.println(step * 100 / 100 + "m 이동");
				break;
		default :
				System.out.println("알수 없는 단위 이므로 출력 불가");
		}
	}
}

class WalkGood{
	//오버로딩 된 메서드끼리 수행할 작업이 중복되는 경우
	//하나의 메서드에서 다른 메서드를 호출하여
	//필요한 데이터를 전달함으로중복되는 코드를  제거할 수 있다
	public void walk() {
//		System.out.println("100cm 이동");
		walk(1, "cm");
	}
	public void walk(int step) { 
//		System.out.println(step * 100 + "cm 이동");
		walk(step, "cm");
	}
	//사람 걸음 수에 따른 이동 거리를 지정한 단위에 따라 cm 변환 후 출력
	public void walk(int step, String unit) {
		//ex) 2걸음  = 100 * 2 = 200cm / 100 = 2m 한 결과를 출력
		//switch -case 문을 사용하여 단위 판별 ("cm" or "inch")
		switch(unit) {
		case "cm" : //step * 100 결과를 m로 변환하기 위해 /100
				System.out.println(step * 100 + "cm 이동");
				break;
		case "m" :
				System.out.println(step * 100 / 100 + "m 이동");
				break;
		default :
				System.out.println("알수 없는 단위 이므로 출력 불가");
		}
	}
}