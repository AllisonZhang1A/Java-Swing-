package ���׼�����;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Test {

class Mylistener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand().equals("��׼��")) {
		 Calculator ca=new Calculator();
		 ca.createmenu();
	     ca.setVisible(true);
	     ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	if(e.getActionCommand().equals("��ѧ��")) {
		Kexue ke=new Kexue();
		 ke.setVisible(true);
		 ke.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	}
}
}
	

