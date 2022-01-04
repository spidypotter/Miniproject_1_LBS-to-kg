package org.conveter;
import java.awt.*;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.*;
public class WeightConveter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightConveter window = new WeightConveter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WeightConveter() {
		IntelliJTheme.setup(WeightConveter.class.getResourceAsStream("/GiHub.theme.json"));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 400, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		FlatLightLaf.setup();
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\spidy\\Downloads\\068906114575815_400x400.jpg"));
		lblNewLabel_2.setBounds(0, 0, 400, 400);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(107, 106, 104));
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.setBounds(400, 0, 400, 400);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weight Converter Tool");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 28, 367, 52);
		panel_1.add(lblNewLabel);
		
		 JButton btnNewButton = new JButton("Convert");
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().equals("")) {
					 JOptionPane.showMessageDialog(textField, "Please Enter the field !",
				               "TextField Alert", JOptionPane.ERROR_MESSAGE);
				}
			double lbs =	Double.parseDouble(textField.getText());
		    double kgs = lbs*0.453592;
		
		    textField_1.setText(String.valueOf(kgs));
		    
		   
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(115, 180, 122, 21);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Lbs");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(289, 108, 56, 42);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kgs");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(289, 242, 56, 42);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\spidy\\Downloads\\41-413772_free-close-icon-png-vector-b-w-twitter_50x50.png"));
		btnNewButton_1.setBounds(380, 0, 20, 21);
		panel_1.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(49, 108, 230, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(49, 242, 230, 33);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
	}

	private void createUI(JFrame frame1) {
		// TODO Auto-generated method stub
		
	}
}
