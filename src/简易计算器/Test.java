package 简易计算器;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Test {

class Mylistener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand().equals("标准型")) {
		 Calculator ca=new Calculator();
		 ca.createmenu();
	     ca.setVisible(true);
	     ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	if(e.getActionCommand().equals("科学型")) {
		Kexue ke=new Kexue();
		 ke.setVisible(true);
		 ke.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	}
}
}
	

