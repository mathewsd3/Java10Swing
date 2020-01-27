package Swing;

//import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Container;
import java.util.ArrayList;

import javax.swing.*;

public class Window extends JFrame{
	public Window (String title)
	{
			super(title);
			
			
			JLabel northLabel = new JLabel("North");
			JLabel southLabel = new JLabel("South");
			JLabel eastLabel = new JLabel("East");
			JLabel westLabel = new JLabel("West");
			JComboBox<String> dropDown = new JComboBox<String>();
			dropDown.addItem("Item1");
			dropDown.addItem("Item2");
			dropDown.addItem("Other");
			
			
			JButton submitButton = new JButton("Submit");
			
			ActionListener l = ((ActionEvent e) -> System.out.println("Lambda"));
		
			submitButton.addActionListener(l);
			
			
			// Lambda expression syntax
			// (() -> statement)  : value 
			// (() -> { code; code; })
			
			//submitButton.addActionListener((ActionEvent e) -> System.out.println("Lambda"));
			
			JTextField textField = new JTextField("Enter Text ...");
			
			JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);
			
			Container contentPane = getContentPane();
			
			JCheckBox checkBox = new JCheckBox("Checkbox");
			
			JList<String> list = new JList();
			//list.add("aaa",String);
			
			
			//JTextField[] txtfld
			
			ArrayList<JTextField> textFields = new ArrayList<>();
			textFields.add(textField);
			
			contentPane.add(submitButton);
			contentPane.add(checkBox, BorderLayout.NORTH);
			contentPane.add(slider, BorderLayout.NORTH);
			contentPane.add(northLabel, BorderLayout.NORTH);
			contentPane.add(southLabel, BorderLayout.SOUTH);
			contentPane.add(eastLabel, BorderLayout.EAST);
			contentPane.add(westLabel, BorderLayout.WEST);
			
			contentPane.add(dropDown, BorderLayout.NORTH);
			contentPane.add(textField, BorderLayout.NORTH);
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
			setSize(1000,1000);
			setLocationRelativeTo(null);
			//pack();
			
			//--
			Box contentPane2 = Box.createVerticalBox();
			setContentPane(contentPane2);
			
			contentPane2.add(submitButton);
			contentPane2.add(checkBox);
			contentPane2.add(slider);
			contentPane2.add(northLabel);
			contentPane2.add(southLabel);
			contentPane2.add(eastLabel);
			contentPane2.add(westLabel);
			
			contentPane2.add(dropDown);
			contentPane2.add(textField);
			
			Container c = new Container();
			c.setLayout(new BorderLayout());
			c.add(slider);
			c.add(textField);
			
			setVisible(true);
			
		
		/*
		super(title);
		JButton submitButton = new JButton("Submit");
		
		//JTextField textField = new JTextField("Enter Text ...");
		
		JTextArea textArea = new JTextArea("");
		
		submitButton.addActionListener(new MyListener(textArea));
		//JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);
		
		Container contentPane = getContentPane();

		contentPane.add(submitButton, BorderLayout.EAST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setVisible(true);

		 
		Box contentPane = Box.createVerticalBox();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	
		setContentPane(contentPane);
		
		addNewButtonsPanel(contentPane,true);
		*/
		
	}
}
