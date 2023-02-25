import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField element;
	private JTextField position;
	private JTextField delect;
	private JTextField result;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Array() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 524, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel head = new JLabel("ARRAY DATA STRUCTURE");
		head.setForeground(new Color(255, 0, 0));
		head.setFont(new Font("Tahoma", Font.BOLD, 20));
		head.setBounds(146, 10, 269, 25);
		contentPane.add(head);

		JLabel size = new JLabel("ENTER SIZE OF ARRAY");
		size.setForeground(new Color(255, 0, 128));
		size.setFont(new Font("Tahoma", Font.BOLD, 12));
		size.setBounds(82, 50, 155, 15);
		contentPane.add(size);

		text1 = new JTextField();
		text1.setBounds(247, 49, 96, 19);
		contentPane.add(text1);
		text1.setColumns(10);

		JButton create = new JButton("Create");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(text1.getText());
				arr = new int[len];
				String message = "Array of length " + len + " created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 12));
		create.setBounds(223, 92, 87, 23);
		contentPane.add(create);

		JLabel lblNewLabel = new JLabel("INSERT A ELEMENT");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 143, 117, 15);
		contentPane.add(lblNewLabel);

		element = new JTextField();
		element.setBounds(141, 142, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JLabel pos = new JLabel("POSITION");
		pos.setForeground(new Color(255, 0, 128));
		pos.setFont(new Font("Tahoma", Font.BOLD, 12));
		pos.setBounds(247, 146, 63, 15);
		contentPane.add(pos);

		position = new JTextField();
		position.setBounds(320, 142, 73, 19);
		contentPane.add(position);
		position.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("DELECT AT POSITION");
		lblNewLabel_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(82, 202, 130, 15);
		contentPane.add(lblNewLabel_1);

		delect = new JTextField();
		delect.setBounds(247, 201, 96, 19);
		contentPane.add(delect);
		delect.setColumns(10);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res = "";
				for (int i = 0; i <= arr.length - 1; i++) {
					res = res + " " + arr[i];
				}
				result.setText(res);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 12));
		display.setBounds(226, 240, 87, 23);
		contentPane.add(display);

		result = new JTextField();
		result.setBounds(146, 273, 247, 19);
		contentPane.add(result);
		result.setColumns(10);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(position.getText());
				arr[pos] = elem;
				String message = "Element " + elem + " inserted @ position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				position.setText("");
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 12));
		insert.setBounds(415, 144, 79, 23);
		contentPane.add(insert);

		JButton btnNewButton = new JButton("DELECT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = Integer.valueOf(delect.getText());
				arr[pos] = 0;
				String message = "Element deleted at positon " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				delect.setText("");

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(369, 200, 85, 21);
		contentPane.add(btnNewButton);
	}
}
