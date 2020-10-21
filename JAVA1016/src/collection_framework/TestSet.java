package collection_framework;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		/*
		 * Set 객체를 활용한 로또 번호 생성기
		 * -중복되지 않는 1~45 범위의 난수 6개를 저장
		 * -저장되는 난수는 오름차순 정렬
		 */
		Random r = new Random();
		for(int i = 1; i<=5; i++) {
			Set myLotto = new TreeSet();
			//저장되는 난수 갯수가 6개 보다 작을 동안 반복
			while(myLotto.size()<6) {
				//1~45사이 난수 1개를 생성하여 myLotto에 추가
				myLotto.add(r.nextInt(45)+1);
			}
			System.out.println("나의 로또 번호 :" + myLotto);
			//----------------------------------------------
			//1등 당첨번호(1, 11, 21, 31, 41, 42)와 비교하여 
			//일치하는 번호 갯수 출력
			Set thisWeekLotto = new TreeSet();
			thisWeekLotto.add(1);
			thisWeekLotto.add(11);
			thisWeekLotto.add(21);
			thisWeekLotto.add(31);
			thisWeekLotto.add(41);
			thisWeekLotto.add(42);
			int count = 0; //일치하는 번호 갯수를 저장하는 변수
			for(Object o : myLotto) {
				if(thisWeekLotto.contains(o)) {
					count++;
				}
			}
			System.out.println("1등 당첨 번호 : " + thisWeekLotto);
			System.out.println("일치하는 번호 : " +count+"개");
			System.out.println();
		}
		
	}

}
