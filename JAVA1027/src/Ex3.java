import java.time.LocalTime;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 쓰레드 우선순위
		 * -쓰레드의 실행 시 우선순위를 지정 가능
		 * -1(낮음) ~ 10(높음) 사이의 값을 사용하며
		 * 	 쓰레드의 기본 우선순위는 5이다
		 * -우선순위가 높은 쓰레드를 가급적 더 많이 실행해 주지만
		 * 	 무조건 우선 순위에 따라 실행되는 것은 아니다.
		 * 	 =>항상, 스케쥴링에 따라 실행되므로 결과는 항상 다를 수 있음
		 */
		
		MyThread mt1 = new MyThread("T");
		MyThread mt2 = new MyThread("F");
		
		//쓰레드 우선 순위 변경 : setPriority() 메서드 사용
		//=>1(낮음)~10(높음) 사이의 값 입력 하거나
		//		Threead.XXX_PRIORITY 상수 사용 가능(MIN(1), NORM(5), MAX(10))
		mt1.setPriority(Thread.MAX_PRIORITY); //우선순위 10으로 지정
		mt2.setPriority(1); //우선순위 1로 지정
		
		//쓰레드 우선순위 확익 : getPriority() 메서드 사용
		System.out.println("mt1 우선순위 : " + mt1.getPriority());
		System.out.println("mt2 우선순위 : " + mt2.getPriority());
//		mt1.start();
//		mt2.start();
		
		System.out.println("------------------------------------------------------");
		Timer t = new Timer();
		t.start();
	}

}

class MyThread extends Thread{

	public MyThread(String name) {
		super(name);
			}

	@Override
	public void run() {
		for(int i = 1; i<= 30; i++) {
			System.out.print(this.getName());//현재 쓰레드 이름 출력
		}
	}
	
}

class Timer extends Thread{

	@Override
	public void run() {
		for(int i = 1; i<=60; i++) {
			//현재 시각 정보 출력
			//=>단, 1초마다 1번씩 출력하기 위해 현재 쓰레드 1초동안 슬립
			try {
				Thread.sleep(1000); //1000ms = 1s
				//=>1초 동안 일시정지 상태가 되어 대기풀에서 대기하다가
				//		지정된 시간이 만료되면 다시 Runnable 상태로 변경된 후
				//		CPU에 의해 실행될 때 Running 상태로 변경됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("째깍 : " + LocalTime.now());
		}
	}
	
}