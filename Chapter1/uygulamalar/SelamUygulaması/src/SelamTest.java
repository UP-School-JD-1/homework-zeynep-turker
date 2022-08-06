public class SelamTest {

	public static void main(String[] args) {
		Selam nesne = new Selam();

		String cevap = nesne.selamSoyle("Nazire");
		System.out.println(cevap);
		
		cevap = nesne.selamSoyle("");
		System.out.println(cevap);
	}
}

