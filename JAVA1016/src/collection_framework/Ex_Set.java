package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex_Set {

	public static void main(String[] args) {
		/*
		 * Set 인터페이스 계열
		 * -저장 순서를 유지하지 않고, 데이터 중복을 허용하지 않는 구조
		 * =>하나의 주머니에 무작위로 저장하는 구조와 동일함
		 */
		Set set = new HashSet();
		System.out.println("Set 객체가 비어 있는가?" + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수 : "+set.size());
		
		//add(Object o )	: 모든 타입의 데이터 추가
		set.add(1);
		set.add("TWO");
		set.add(3.14);
		System.out.println("Set 객체가 비어 있는가?" + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수 : "+set.size());
		System.out.println("Set 객체에 저장된 모든 요소 : " + set.toString());
		System.out.println("정수 4 추가 가능한가" + set.add(4));
		System.out.println("Set 객체에 저장된 모든 요소"+set);
		System.out.println("정수 1 추가 가능한가" + set.add(1));
		//contains(Object o): 해당 요소 존재 여부 리턴
		System.out.println("문자열 TWO가 포함되어 있는가? " + set.contains("TWO"));
		//remove(Object o): 해당 요소 제거
		System.out.println("문자열 제거 결과 : "+set.remove(4));
		//Object[] toArray() : 컬렉션 객체를 배열로 변환
		Object[] arr = set.toArray();
		System.out.println(Arrays.deepToString(arr));
		//clear() : 컬렉션 객체 초기화(모든 요소 제거)
		set.clear();
		System.out.println("Set 객체가 비어있는가?" + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수 : "+set.size());
		System.out.println("Set 객체에 저장된 모든 요소 : " + set.toString());
		
		//컬렉션 객체의 데이터를 꺼내는 공통 방법
		//1. 향상된 for문 사용
//		for(Object o : set) {
			//저장되는 데이터타입이 Object 타입이므로
			//다양한 데이터를 모두 저장할 수 있도록 Object 타입 변수에 저장
//			System.out.println("저장된 요소 : "+o);
//		}
		//2. Iterator(반복자) 객체 사용
		//Set객체의 iterator() 메서드를 호출하여 Iterator 객체 리턴받음
//		Iterator ite = set.iterator();
		//while문을 사용하여 저장된 요소가 존재할 동안 반복
//		while(ite.hasNext()) {//다음 요소 존재 여부 판별
//			Object o = ite.next();//다음 요소 꺼내기
//			System.out.println("저장된 요수 : " +o);
		
		System.out.println("----------------------------------------------");
		Set set2 = new HashSet();
		set2.add("1번");
		set2.add("22번");
		set2.add("34번");
		set2.add("45번");
		set2.add("57번");
		set2.add("6번");
		System.out.println(set2);
		//Set 계열 구현체 클래스 중 정렬 기능을 제공하는 클래스 : TreeSet
		//=>동일한 데이터타입끼리만 저장 가능
		Set treeSet = new TreeSet(set2);
//		=>컬렉션 객체 생성 시 다른 컬렉션 객체를 전달하여 초기화 가능
		System.out.println(treeSet);
		
		Set set3 = new TreeSet();
		set3.add(10);
		set3.add(20);
		System.out.println(set3);
		
		//addAll() : 기존 컬렉션 객체에 다른 컬렉션 요소를 한 번에 추가
		set3.addAll(treeSet);
		System.out.println(set3);
		
		Set set4 = new HashSet(set3);
		System.out.println(set4);
		//equals() :두 컬렉션 객체의 요소가 같은지 판별
		System.out.println("set3와 set4는 같은가?" + set3.equals(set4));
		
		}
}
