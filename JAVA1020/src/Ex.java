
public class Ex {

	public static void main(String[] args) {
		/*
		 * Object 타입을 파라미터로 갖는 경우
		 * 모든 데이터 타입을 전달받을 수 있으므로 
		 * 모든 객체를 전달할 수 있기 때문에 데이터 저장 시 편리함
		 * 그러나, 객체를 꺼내서 사용해야할 경우 형변환이 필요하며
		 * 잘못된 변환 수행 시  classCastException이 발생할 수도 있다
		 */
		NormalBox box = new NormalBox();
		box.setItem(new toy());
		Object item = box.getItem();
//		toy toy = (toy) item; //형변환을 통해 Toy 타입으로 변환
		//=>만약, toy가 아닌 다른 객체일 경우 문제 발생 하므로
		//		형변환 전 변환 가능 여부를 판별해야 한다
		//=>instanceof 연산자를 통해 변환 가능 여부 판별
		if(item instanceof toy) {//item객체를 toy 타입으로 변환 가능한가?
			toy toy = (toy) item;
		}else if(item instanceof icecream){//icecream 타입으로 변환 가능한가?
			icecream icecream = (icecream)item;
		}else {
			System.out.println("변환 불가능한 객체");
		}
		
		
		box.setItem(new icecream());
		item=box.getItem();
		icecream icecream = (icecream) item;
	}
	public static void addBox() {
		
	}
}

class icecream{
	String icecreamName;
}
class toy{
	String toyName;
}
class NormalBox{
	Object item;

	public NormalBox(Object item) {
		this.item = item;
	}

	public NormalBox() {	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

}