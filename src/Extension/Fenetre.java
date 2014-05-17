	package Extension;


import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
	
	private JButton boutonPlus;
	private JButton boutonMoins;
	private JTextField text;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu1 = new JMenu("Fichier");
	private JMenuItem item1 = new JMenuItem("Fermer");
	private JToolBar outil=new JToolBar(); // barre d'outil
	private JButton bouton1 = new JButton("Bouton qui ne fait rien");
	JPopupMenu menuF = new JPopupMenu("Ne fait rien non plus");

	public Fenetre(String arg0) throws HeadlessException {
		super(arg0);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setResizable(false);
		
		BoxLayout b = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(b);
		
		JPanel p = new JPanel();
		
		boutonPlus = new JButton("Plus");
		boutonMoins = new JButton("Moins");
		text = new JTextField("");
		text.setColumns(10);
		p.add(text);
		p.add(boutonPlus);
		p.add(boutonMoins);		
		this.add(p);
		
		//On initialise nos menus      
	    this.menu1.add(item1);

	    //Ajout du sous-menu dans notre menu
	    this.menu1.add(this.menu1);
	    item1.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent arg0) {
	        System.exit(0);
	      }        
	    });
	    this.menu1.add(item1);

	    //L'ordre d'ajout va déterminer l'ordre d'apparition dans le menu de gauche à droite
	    //Le premier ajouté sera tout à gauche de la barre de menu et inversement pour le dernier
	    this.menuBar.add(menu1);
	    this.setJMenuBar(menuBar);
	    
	    outil.add(bouton1);
	    outil.add(Box.createHorizontalGlue());
	    this.add(outil);

	    this.add(menuF);
	    
	    this.setLayout(new FlowLayout());
	    
	    this.setVisible(true);
	    
	}

	public JButton getBoutonPlus() {
		return boutonPlus;
	}

	public JButton getBoutonMoins() {
		return boutonMoins;
	}

	public JTextField getText() {
		return text;
	}
}
