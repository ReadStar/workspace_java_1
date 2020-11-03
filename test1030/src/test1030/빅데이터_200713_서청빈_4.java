package test1030;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class 빅데이터_200713_서청빈_4 {

	public static void main(String[] args) {
		Set thisWeekLotto = new TreeSet();
		thisWeekLotto.add(35);
		thisWeekLotto.add(21);
		thisWeekLotto.add(29);
		thisWeekLotto.add(10);
		thisWeekLotto.add(3);
		thisWeekLotto.add(44);
			
		
		for(int i=0; i <= 10; i++) {
			Set myLotto = new TreeSet();
			Random random = new Random();
			
			while(myLotto.size() < 6) {
				myLotto.add(random.nextInt(45)+1);
			}
				
			System.out.println("내 번호" + myLotto);
			System.out.println("이번주 당첨 번호: " + thisWeekLotto);
				
			int count = 0;
			for(Object o : thisWeekLotto) {
				count = myLotto.contains(o)? count+1 : count; 
			}
			if(count==6) {
				System.out.println("일치 개수: "  + count + "개 (결과 : 1등 당첨)");
			}else if(count==5) {
				System.out.println("일치 개수: "  + count + "개 (결과 : 2등 당첨)");
			}else if(count==4) {
				System.out.println("일치 개수: "  + count + "개 (결과 : 3등 당첨)");
			}else {
				System.out.println("일치 개수: "  + count + "개 (결과 : 꽝)");
			}
		}
	}
}
