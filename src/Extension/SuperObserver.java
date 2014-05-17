package Extension;

import java.util.Observable;
import java.util.Observer;

public class SuperObserver implements Observer {

	private Modele modele1;
	private Modele modele2;
	
	public SuperObserver(Modele m1, Modele m2) {
		modele1 = m1;
		modele2 = m2;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
		Modele modele = (Modele)arg0;
		if(modele1.equals(modele) && (modele1.getEntier() != (10 - modele2.getEntier())))
		{
			try {
				modele2.setEntier(10 - modele.getEntier());
			} catch (IntegerOutOfRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(modele2.equals(modele) && (modele2.getEntier() != (10 - modele1.getEntier())))
		{
			try {
				modele1.setEntier(10 - modele.getEntier());
			} catch (IntegerOutOfRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
