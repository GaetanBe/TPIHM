package Fenetre;

public class Controller {
	
	private ActionPlus actionPlus;
	private ActionMoins actionMoins;
	private ActionTexte actionTexte;

	private Modele modele;
	
	private Fenetre fenetre;

	public Controller(Modele modele, Fenetre fenetre) {
	
		actionMoins = new ActionMoins(modele);
		actionPlus = new ActionPlus(modele);
		actionTexte = new ActionTexte(modele, fenetre);
		
		//liens
		fenetre.getText().addActionListener(actionTexte);
		fenetre.getBt1().addActionListener(actionPlus);
		fenetre.getBt2().addActionListener(actionMoins);
	}

}
