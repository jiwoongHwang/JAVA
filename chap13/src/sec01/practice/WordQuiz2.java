package sec01.practice;

import java.util.*;

class Word {
	private String English;
	private String Korean;

	public Word(String english, String korean) {
		this.English = english;
		this.Korean = korean;
	}

	public String getEnglish() {
		return English;
	}

	public String getKorean() {
		return Korean;
	}
}

public class WordQuiz2 {
	Scanner s = new Scanner(System.in);
	List<Word> list = new ArrayList<>();
	int[] question = new int[4];

	WordQuiz2() {
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
		list.add(new Word("love", "���"));
	}

	public void run() {
		System.out.println("���� ���� �� ���߳� ������ �����մϴ�.");
		System.out.println("-1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + list.size() + "���� �ܾ ��� �ֽ��ϴ�.");
		System.out.println();

		int num = 0;

		while (true) {
			randomQuiz();
			int answerNumber = (int) (Math.random() * question.length);

			int answerIndex = question[answerNumber];

			System.out.println(list.get(answerIndex).getEnglish() + "?");

			for (int i = 0; i < question.length; i++) {
				System.out.print("(" + (i + 1) + ")" + list.get(question[i]).getKorean() + " ");
			}
			System.out.println(">> ");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println("���ݱ��� " + num + "���� ������ ���߾����.");
				System.out.println("������ �����մϴ�.");
				break;
			} else if (input - 1 == answerNumber) {
				System.out.println("�����̿��� ~ ���޾�� ~");
				System.out.println();
				num++;
			} else {
				System.out.println("�����̿��� ~ ���θ� ������");
				System.out.println();
			}
		}

	}

	public void randomQuiz() {
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());

			for (int j = 0; j < i; j++) {
				if (question[i] == question[j]) {
					i--;
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		WordQuiz2 wq = new WordQuiz2();
		wq.run();
	}

}
