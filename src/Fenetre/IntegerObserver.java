package Fenetre;
import java.util.Observable;
import java.util.Observer;

/**
 * Observateur de l'entier de notre mod�le
 * @author Ga�tan
 *
 */
public class IntegerObserver implements Observer{
	
	Fenetre fenetre;
	
	public IntegerObserver(Fenetre fenetre)
	{
		this.fenetre = fenetre;
	}

	@Override
	public void update(Observable arg0, Object arg1) {

		Modele modele = (Modele)arg0;
		
		//System.out.println("L'entier a chang� : " + modele.getEntier());
		
		Integer tmp = new Integer(modele.getEntier());
		
		fenetre.getText().setText(tmp.toString());
	}
	
}
