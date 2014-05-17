package Modele;
import java.util.Observable;

/**
 * Mod�le non observable
 * @author Ga�tan
 *
 */
public class Modele extends Observable{

	private int entier;
	
	/**
	 * Constructeur avec param�tre. Jette une exception IntegerOutOfRangeException si l'entier donn� est inf�rieur � 0 
	 * ou sup�rieur � 10
	 * Prend en param�tre l'observateur
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
	 * Setter. Jette une exception IntegerOutOfRangeException si l'entier donn� est inf�rieur � 0 o sup�rieur � 10
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
