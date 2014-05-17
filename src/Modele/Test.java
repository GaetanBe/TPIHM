package Modele;


public class Test {

	public static void main(String[] args) {
		
		IntegerObserver observer = new IntegerObserver();
		Modele modele = null;
		try {
			modele = new Modele(2, observer);
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			modele.setEntier(3);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
