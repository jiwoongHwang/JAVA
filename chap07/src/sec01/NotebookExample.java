package sec01;

public class NotebookExample {

	public static void main(String[] args) {
		Notebook Nb = new Notebook(1998, "i9", "1000000��");
		System.out.println("����⵵ : "  +Nb.year);
		System.out.println("������ : " + Nb.price);
		System.out.println("cpu������ : " + Nb.cpu);
		
		
		Nb.powerOn();
		Nb.internet();
		System.out.println(Nb.gamename("���Ŀ¶���4"));
		
		Nb.cameraOff();
		System.out.println(Nb.airPodstypeOn("imax"));
		Nb.airPodstypeOff("i-max");
	}

}
