package Modele;
import java.util.Observable;
import java.util.Observer;

/**
 * Observateur de l'entier de notre modèle
 * @author Gaëtan
 *
 */
public class IntegerObserver implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {

		Modele modele = (Modele)arg0;
		
		System.out.println("L'entier a changé : " + modele.getEntier());
	}
	
}
