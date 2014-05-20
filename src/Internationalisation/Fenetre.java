package Internationalisation;


import javax.swing.*;

import java.awt.HeadlessException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Fenetre extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -945460537153000734L;
	private JButton bt1;
	private JButton bt2;
	private JTextField text;
	
	private ResourceBundle bundle;
	
	public Fenetre(String arg0) throws HeadlessException {

		super("Window");
		
		Locale[] locales = { Locale.GERMAN, Locale.ENGLISH };

		bundle = ResourceBundle.getBundle("Text", this.getLocale());
		
		this.setName(bundle.getString(Constants.windowTitle));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setResizable(false);
		
		JPanel p = new JPanel();
		
		bt1 = new JButton(bundle.getString(Constants.buttonPlusText));
		bt2 = new JButton(Constants.buttonMinusText);
		text = new JTextField("");
		text.setColumns(10);
		p.add(text);
		p.add(bt1);
		p.add(bt2);
		
		this.add(p);
	}

	public JTextField getText() {
		return text;
	}

	public JButton getBt1() {
		return bt1;
	}

	public JButton getBt2() {
		return bt2;
	}
}
