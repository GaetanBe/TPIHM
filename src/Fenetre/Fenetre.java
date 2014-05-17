package Fenetre;


import javax.swing.*;

import java.awt.HeadlessException;

public class Fenetre extends JFrame {
	
	private JButton bt1;
	private JButton bt2;
	private JTextField text;

	public Fenetre(String arg0) throws HeadlessException {
		super(arg0);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setResizable(false);
		
		JPanel p = new JPanel();
		
		bt1 = new JButton("Plus");
		bt2 = new JButton("Moins");
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
