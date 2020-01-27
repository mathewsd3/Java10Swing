package Swing;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class MyListener implements ActionListener{
	
	private JTextArea textArea;
	public MyListener(JTextArea textArea)
	{
		this.textArea = textArea;
	}
	public void actionPerformed(ActionEvent event)
	{
		textArea.append("Appended text\n");
		//System.out.println("Button Clicked");
	}
}
