package Modele;
import java.util.Observable;

/**
 * Modèle non observable
 * @author Gaëtan
 *
 */
public class Modele extends Observable{

	private int entier;
	
	/**
	 * Constructeur avec paramètre. Jette une exception IntegerOutOfRangeException si l'entier donné est inférieur à 0 
	 * ou supérieur à 10
	 * Prend en paramètre l'observateur
	 * @param entier
	 * @throws IntegerOutOfRangeException
	 */
	public Modele(int entier, IntegerObserver obs) throws IntegerOutOfRangeException {
		super();
		
		this.addObserver(obs);
		
		if(entier < 0 || entier > 10)
		{
			throw new IntegerOutOfRangeException();
		}
		else
		{
			this.entier = entier;
		}
	}

	public int getEntier() {
		return entier;
	}

	/**
	 * Setter. Jette une exception IntegerOutOfRangeException si l'entier donné est inférieur à 0 o supérieur à 10
	 * @param entier
	 * @throws IntegerOutOfRangeException
	 */
	public void setEntier(int entier) throws IntegerOutOfRangeException {
		if(entier < 0 || entier > 10)
		{
			throw new IntegerOutOfRangeException();
		}
		else
		{
			this.entier = entier;
			setChanged();
			notifyObservers();
		}
	}
	
	
}
