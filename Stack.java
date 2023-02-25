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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField createsize;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int top = -1;
	private int a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 808, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Heading = new JLabel("STACK DATA STRUCTURE");
		Heading.setForeground(new Color(255, 0, 0));
		Heading.setFont(new Font("Tahoma", Font.BOLD, 20));
		Heading.setBounds(269, 10, 260, 25);
		contentPane.add(Heading);

		JLabel lblNewLabel = new JLabel("ENTER A SIZE OF STACK");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(172, 84, 189, 19);
		contentPane.add(lblNewLabel);

		createsize = new JTextField();
		createsize.setBounds(406, 86, 96, 19);
		contentPane.add(createsize);
		createsize.setColumns(10);

		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int len = Integer.valueOf(createsize.getText());
				s = new int[len];
				a = len - 1;
				String message = "Stack length " + len + " created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 15));
		create.setBounds(346, 121, 93, 27);
		contentPane.add(create);

		JLabel label1 = new JLabel("ENTER THE ELEMENT");
		label1.setForeground(new Color(255, 255, 0));
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setBounds(172, 160, 166, 19);
		contentPane.add(label1);

		element = new JTextField();
		element.setBounds(406, 160, 123, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton push = new JButton("PUSH");
		push.setForeground(new Color(64, 0, 64));
		push.setBackground(new Color(240, 240, 240));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (top == a) {
					JOptionPane.showMessageDialog(contentPane, "Push Not Possible");
				} else {
					int elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push Sucessful");
					element.setText("");
				}
			}
		});
		push.setFont(new Font("Tahoma", Font.BOLD, 15));
		push.setBounds(346, 202, 87, 27);
		contentPane.add(push);

		JButton pop = new JButton("POP");
		pop.setForeground(new Color(64, 0, 64));
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				} else {
					String message = "Element Deleted " + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					top--;
				}
			}
		});
		pop.setFont(new Font("Tahoma", Font.BOLD, 15));
		pop.setBounds(346, 250, 77, 27);
		contentPane.add(pop);

		displaybox = new JTextField();
		displaybox.setBounds(244, 346, 293, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);

		JButton display = new JButton("DISPLAY");
		display.setForeground(new Color(64, 0, 64));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, " Display not possible");
				} else {
					for (int i = top; i >= 0; i--) {
						str = str + " " + s[i];
					}
				}
				displaybox.setText(str);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 15));
		display.setBounds(346, 300, 123, 27);
		contentPane.add(display);
		
	}
}
