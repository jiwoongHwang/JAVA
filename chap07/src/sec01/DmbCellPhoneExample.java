package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println("�� : " + dmb.model);
		System.out.println("���� : " + dmb.color);
		
		System.out.println("ä�� : " +dmb.channel);
		
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ���");
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
	}
		
	}

