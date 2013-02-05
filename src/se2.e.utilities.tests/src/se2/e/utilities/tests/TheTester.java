package se2.e.utilities.tests;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.BorderLayout;

/**
 * 
 * @author Anders Kalhauge
 *
 */
public class TheTester {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheTester window = new TheTester();
					window.frame.setVisible(true);
					} 
				catch (Exception e) {
					e.printStackTrace();
					}
				}
			});
		}

	/**
	 * Create the application.
	 */
	public TheTester() {
		initialize();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas canvas = new GeometryCanvas();
		frame.getContentPane().add(canvas, BorderLayout.CENTER);
		}

	}
