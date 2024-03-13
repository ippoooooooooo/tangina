package co;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class two implements ActionListener{
	JFrame frame = new JFrame();
	JButton myButton = new JButton("BUTTON");
	JLabel label = new JLabel("Welcome to the Testify");
	  two(){
	  
	  label.setBounds(820,240,300,300);
	  label.setFont(new Font(null,Font.PLAIN,25));
	  
	  myButton.setBounds(700,440,500,200);
	  myButton.setFocusable(false);
	  myButton.addActionListener((ActionListener) this);
	  
	  frame.add(myButton);
	  frame.add(label);
	  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(1920,1080);
	  frame.setLayout(null);
	  frame.setVisible(true);
	  
	  new three();
	  
}
	 public void actionPerformed(ActionEvent e) {
	  
	  if(e.getSource()==myButton) {
	   
	   three launchPage = new three();
	   frame.dispose();
	  }
	 }
}
