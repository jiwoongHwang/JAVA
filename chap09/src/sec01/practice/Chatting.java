package sec01.practice;

public class Chatting {

	void startChat(String chatId) {
		String nickName = chatId;
//		Stirng nickName = null;
//		���� Ŭ������ ���Ե� �޼ҵ��� �ʵ�� �⺻������ final�� �پ
//		�ݵ�� ���� �����ؾ� ��
		
//		inputData="�������";
//		���� Ŭ������ �޼ҵ� �ȿ� ���� �ʵ�� �ش� ���� �ȿ����� ��� ������
		
		class Chat {
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {
			}
		}
		Chat chat = new Chat();
		chat.start();
	}

}