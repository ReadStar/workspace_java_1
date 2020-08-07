
public class p200_Exam4 {

	public static void main(String[] args) {
		int max = 0; //최대값 저장 변수 
		
		int[ ] array = {1, 5, 3, 8, 2};
		//배열 내의 데이터 중 최대값을 max에 저장 
		//=>for문 활용 
		for (int i = 0; i <array.length; i++) {
			if (max<array[i]) {
				max=array[i];	
			}
		}
		System.out.println("max = "+max);
	}

}
