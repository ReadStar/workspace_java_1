package interfaces;

public interface RemoteControl {
	//인터페이스 내의 모든 변수는 상수(public static final)fh cnlrmqehla
	public static final int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 0;
	
	int MAX_CHANNEL = 100; //상수(public static final 생략 되어있음)
	public int MIN_CHANNEL = 1; //상수(static final 생략되어있음)
	
	//인터페이스 내의 모든 메서드는 추상메서드(public abstract)로 취급됨
	public void turnPower() ; //추상메서드 (abstract 생략)
	public abstract void channelUp();
	public abstract void channelDown();
	public abstract void changeChannel(int channel); 
	public abstract void volumeUp();
	public abstract void volumeDown();
}
