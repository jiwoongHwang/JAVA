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
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("love", "사랑"));
	}

	public void run() {
		System.out.println("누가 누가 잘 맞추나 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다.");
		System.out.println("현재 " + list.size() + "개의 단어가 들어 있습니다.");
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
				System.out.println("지금까지 " + num + "개의 정답을 맞추었어요.");
				System.out.println("게임을 종료합니다.");
				break;
			} else if (input - 1 == answerNumber) {
				System.out.println("정답이에요 ~ 잘햇어요 ~");
				System.out.println();
				num++;
			} else {
				System.out.println("오답이에요 ~ 공부를 열심히");
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
