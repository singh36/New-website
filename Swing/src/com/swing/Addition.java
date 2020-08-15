package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Addition {
	public static void main(String s[]) {
		Test obj=new Test();
	}
	

}
class Test extends JFrame implements ActionListener
{JTextField t1,t2;
JButton b;
JLabel l;
	public Test()
	{
		t1=new JTextField(10);
	JLabel l1=new JLabel("Enter first number");
	 t2=new JTextField(10);
	JLabel l2=new JLabel("Enter second number");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	l=new JLabel("Result");
	 b=new JButton("OK");
	add(b);
	add(l);
	b.addActionListener(this);
		setLayout(new FlowLayout());//flowLayout
		
		setVisible(true);
	setSize(200,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int result=num1+num2;
		l.setText(result+" ");
		//System.out.print("adding");
	}
}