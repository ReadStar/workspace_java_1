import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Test {

	public static void main(String[] args) {
		/*
		 * HashSet, ArrayList 객체 생성 및 사용
		 * =>제네릭타입 적용
		 */
		
		HashSet<Integer> myLotto = new HashSet<Integer>();
		//제네릭타입으로 Integer타입을 지정했으므로 정수만 사용 가능
		myLotto.add(10);
		myLotto.add(20);
		myLotto.add(30);
		
		
		for(int num : myLotto) { //for(Integer num : myLotto) 사용 가능
			System.out.println(num);
			
		HashSet<Double> set = new HashSet<Double>();
		set.add(3.3);
		set.add(1.1);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("가나다");
		list.add("라마");
		for(int i = 0; i< list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		for(String str : list) {
			System.out.println(str);
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "가나다");
		map.put(2, "라마바");
		System.out.println(map);
		}
	}

}
