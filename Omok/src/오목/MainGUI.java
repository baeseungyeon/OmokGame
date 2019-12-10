package ¿À¸ñ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class MainGUI extends JFrame {
	@SuppressWarnings("unused")
	private OnePlayerGUI oGui;
	@SuppressWarnings("unused")
	private TwoPlayerGUI tGui;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		ImageIcon icon = new ImageIcon("main.jpg");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 700);
		contentPane = new JPanel() {
			public void paintComponent(Graphics graphics) {
				graphics.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(graphics);
			}
		};
		contentPane.setBackground(new Color(204, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);

		JLabel lblNewLabel = new JLabel("Omok Game");
		lblNewLabel.setForeground(new Color(102, 51, 51));
		lblNewLabel.setFont(new Font("210 ½Ã°ñ¹ä»ó B", Font.BOLD, 160));

		JButton button = new JButton("1\uC778\uC6A9 \uAC8C\uC784 \uC2DC\uC791");
		button.setForeground(new Color(51, 51, 51));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oGui = new OnePlayerGUI();
			}
		});
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setFont(new Font("210 ½Ã°ñ¹ä»ó R", Font.PLAIN, 65));

		JButton button_1 = new JButton("2\uC778\uC6A9 \uAC8C\uC784 \uC2DC\uC791");
		button_1.setForeground(new Color(51, 51, 51));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tGui = new TwoPlayerGUI();
			}
		});
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.setFont(new Font("210 ½Ã°ñ¹ä»ó R", Font.PLAIN, 65));

		JButton button_2 = new JButton("\uC885\uB8CC");
		button_2.setForeground(new Color(51, 51, 51));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_2.setBackground(SystemColor.inactiveCaptionBorder);
		button_2.setFont(new Font("210 ½Ã°ñ¹ä»ó R", Font.PLAIN, 65));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(146, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 648, GroupLayout.PREFERRED_SIZE)
						.addGap(130))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(252)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(246, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(78)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addGap(63).addComponent(button, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(button_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(button_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(80, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
