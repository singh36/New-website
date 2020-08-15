package com.swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc ob=new Abc();

	}
}
	class Abc extends JFrame implements ActionListener{
		JCheckBox c1,c2;
		int ammount=0;
		JButton b;
		Abc()
		{JLabel j1=new JLabel("ammount of pizza:");
		c1=new JCheckBox();
		c1.setBounds(100,250,80,90);
		JLabel j2=new JLabel("ammount of burger:");
		c2=new JCheckBox();
		c1.setBounds(100,250,80,100);
		b=new JButton("order");
		b.addActionListener(this);
		add(j1);
		add(c1);
		add(j2);
		add(c2);
		setVisible(true);
		setLayout(null);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String msg="";
			int ammount=0;
			if(c1.isSelected())
			{ int ammout = ammount+30;
			msg+="pizza :30/";
				
			}
			if(c2.isSelected()) {
				 ammount+=100;
				msg+="burger :100/";
			}
			msg+=">>>>>>>>>>\n";
			JOptionPane.showInternalMessageDialog(this, msg+"total"+ammount);
			
		}
	}


