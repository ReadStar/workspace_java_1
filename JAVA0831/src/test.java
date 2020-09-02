
public class test {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널" + dmbCellPhone.channel);
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요, 저는 홍길동 인데요");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}


class CellPhone{
	String model;
	String color;

void powerOn() {System.out.println("전원 켜기");}
void powerOff() {System.out.println("전원 끄기");}
void bell() {System.out.println("벨울림");}
void sendVoice(String message) {System.out.println("자기:"+message);}
void receiveVoice(String message) {System.out.println("상대방" + message);}
void hangUp() {System.out.println("전화끊기");}
}

class DmbCellPhone extends CellPhone {
	int channel;
	
 DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
}
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB방송 수신 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춤");
	}
}
