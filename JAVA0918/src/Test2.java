
public class Test2 {

	public static void main(String[] args) {
		LgTv LgTv = new LgTv();
		LgTv.powerOn();
		LgTv.ThreeD();
		LgTv.volumeUp();
		LgTv.volumeDown();
		LgTv.changeChannel(5);
		LgTv.powerOff();
		System.out.println("현재 넷플릭스 객체는?" + LgTv.netflix);
		LgTv.setNetflixAccount("root");
		System.out.println("현재 넷플릭스 객체는?" + LgTv.netflix);
		//LgTv 인스턴스가 갖고있는 Netflix 인스턴스 내의
		//showNetflix()메서드 호출
		LgTv.netflix.showNetflix();
		System.out.println("----------------------------------------");
		
		SamsungTv STv = new SamsungTv();
		STv.powerOn();
		STv.powerOff();
		STv.volumeUp();
		STv.volumeDown();
		STv.changeChannel(3);
		STv.Smart();
	}

}
//Tv와 Speacker 인터페이스의 공통 메서드인 volumeUp, volumeDown을 추출하여 부모 인터페이스인 VolumeControl 인터페이스로 추상화
interface VolumeControl{
	public void volumeUp();
	public void volumeDown();
}

interface Tv extends VolumeControl{
	public void powerOn();
	public void powerOff();
	public void changeChannel(int num);
	
}

interface Speaker extends VolumeControl{
	public void powerOn();
	public void powerOff();
}

class Netflix{
	String account;
	public Netflix(String account) {
		this.account = account;
	}
	public void showNetflix() {
		System.out.println("넷플릭스 기능");
	}
}
class LgTv implements Tv, Speaker{
	//넷플릭스 기능은 별도의 상속을 거치지 않고
	//클래스 내에서 has-a 관계로 포함시켜 사용할 수 있다
	Netflix netflix;
	public void setNetflixAccount(String account) {
		//넷플릭스에서 사용할 계정을 전달받아
		//넷플릭스 인스턴스를 생성하면서 생성자에 계정 전달
		//=>생성된 인스턴스를 Netflix타입 멤버변수에 저장
		netflix = new Netflix(account);
	}
	public void ThreeD(){
		System.out.println("3D기능");
	}
	@Override
	public void powerOn() {
		System.out.println("전원 켬");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원 끔");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨 업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨 다운");
		
	}

	@Override
	public void changeChannel(int num) {
		System.out.println(num + "번으로 채널 변경");
		
	}
	
}

class SamsungTv implements Tv, Speaker{

	public void Smart() {
		System.out.println("Smart 기능");
	}
	@Override
	public void powerOn() {
		System.out.println("전원 켬");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원 끔");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨 업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨 다운");
		
	}

	@Override
	public void changeChannel(int num) {
		System.out.println(num + "번으로 채널 변경");
		
	}
	
}