package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex_List {

	public static void main(String[] args) {
		/*
		 * List 인터페이스 계열
		 * -저장 순서를 유지하며, 데이터 중복을 허용하는 구조
		 * -인덱스 번호를 사용하여 요소 관리
		 * -배열과 유사한 구조
		 * -add()메서드로 데이터 추가, get()메서드로 데이터 리턴
		 * -대표적인 구현체 클래스 : ArrayList, Vector, LinkedList 등
		 */
		List list = new ArrayList();
		//add() : 데이터 추가
		list.add(1);
		list.add(2);
		list.add("삼");
		list.add(4);
		list.add(5.5);
		list.add(6);
		
		System.out.println("List 객체가 비어있는가?" + list.isEmpty());
		System.out.println(("List 객체에 저장된 요소 갯수 : ") + list.size());
		System.out.println("'List 객체의 모든 요소 출력 : " + list);
		
		//add(int index, Object o) : 해당 인덱스에 o를 삽입
		list.add(4, 4.4); //4번 인덱스에 4.4. 삽입 (5.5는 5번으로 밀림)
		System.out.println("'List 객체의 모든 요소 출력 : " + list);
		
		list.set(4,  "FOUR"); //4번 인덱스에 데이터를 교체(설정)
		System.out.println("'List 객체의 모든 요소 출력 : " + list);
		
		list.add(4);
		System.out.println("'List 객체의 모든 요소 출력 : " + list);
		System.out.println("정수 4의 위치는?:"+ list.indexOf(4) ); //앞에서 부터 탐색
		System.out.println("정수 4의 인덱스:"+ list.lastIndexOf(4)); //뒤에서 부터 탐색
		
		//get(int index) : index 위치의 데이터 꺼내기
		System.out.println("4번 인덱스 데이터 꺼내기 :"+list.get(4));
		
		//List 객체의 모든 요소를 꺼내는 방법
		//1. 일반 for문 사용 (get() 메서드와 조합)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//2. 향상된 for문 사용
		for(Object array : list) {
			System.out.println(array);
		}
		//3.Iterator 객체 사용
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			Object o = ite.next();
			System.out.println("요소 : "+ o);
		}
		//정수 데이터 를 제거하는 경우
		list.remove(2); //2번 인덱스로 취급되므로 정수 2가 삭제되지 않음
		System.out.println(list);
		list.remove((Object)2); //Object타입으로 변환하면 객체가 지정됨
		System.out.println(list);
		
		System.out.println("-----------------------------------------");
		
		/*
		 * LinkedList(연결리스트) 와 arrayList
		 * -차이점
		 * 		1. ArrayList는 배열 구조로 데이터 저장
		 *  		=>데이터 검색 빠름
		 *  			 순차적인 추가, 삭제 빠르나, 부분 추가 삭제가 느림
		 * 		2. LinkedList 는 데이터와 함께 다음 데이터 위치도 저장
		 * 			=>데이터 검색이 처음부터 목적지까지 진행되므로 느림
		 * 				 부분 추가/삭제 빠르나, 순차적인 추가/삭제 느림
		 */
		List list2 = new LinkedList(list);
		System.out.println("List2 객체의 모든 요소 출력 :" + list2);
		/*
		 * Vector 와 ArrayList
		 * -List 인터페이스 구현, 저장 순서 유지, 중복 허용
		 * -배열 구조를 사용
		 * -사용하는 메서드도 거의 일치
		 * 
		 * -차이점
		 * 	Vector 는 멀티쓰레드 환경에서 자동으로 동기화 제공됨
		 * =>즉, 멀티쓰레드를 사용하지 않는 환경에서 성능 저하 발생
		 */
		List list3 = new Vector(list);
		System.out.println("List3 객체의 모든 요소 출력 :" + list3);
		
		System.out.println("------------------------------------------");
		//List 객체에 데이터를 한꺼번에 추가하는 방법
		//=>Arrays.asList() 메서드를 호출하여 배열을 생성한 뒤
		//		List타입 객체로 변환해준다.
		List list4 = Arrays.asList(1, 10, 4, 5, 3, 8);
		System.out.println("정렬 전 " + list4);
		
		//List 객체의 정렬과 셔플
		//=>Collections 클래스의 static 메서드 sort(), shuffle()사용
		//1. 데이터 정렬 => 동일한 데이터 타입만 정렬 가능
		Collections.sort(list4);
		System.out.println("정렬 후 " + list4);
		//2. 데이터 셔플 => 데이터 타입 무관
		Collections.shuffle(list4);
		System.out.println("셔플 후" + list4);
	}
}
