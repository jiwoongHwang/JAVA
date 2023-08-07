package sec01;

public class NotebookExample {

	public static void main(String[] args) {
		Notebook Nb = new Notebook(1998, "i9", "1000000원");
		System.out.println("생산년도 : "  +Nb.year);
		System.out.println("가격은 : " + Nb.price);
		System.out.println("cpu종류는 : " + Nb.cpu);
		
		
		Nb.powerOn();
		Nb.internet();
		System.out.println(Nb.gamename("피파온라인4"));
		
		Nb.cameraOff();
		System.out.println(Nb.airPodstypeOn("imax"));
		Nb.airPodstypeOff("i-max");
	}

}
