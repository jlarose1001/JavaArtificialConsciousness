package com;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

	MenuBar bar = new MenuBar();
	Menu fileMenu = new Menu();
	MenuItem saveItem = new MenuItem(), newItem = new MenuItem(),
			openItem = new MenuItem();
	Canvas canvas = new Canvas();

	public static int projectIndex = 0;

	public ProjectProperties current;

	public static final Main instance = new Main();

	public Main() {
		this.setEnabled(true);
		this.setBounds(0, 0, size.width, size.height);
		this.setSize(size);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		fileMenu.setLabel("File");
		newItem.setLabel("New");
		newItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fileMenu.add(newItem);
		saveItem.setLabel("Save");
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fileMenu.add(saveItem);
		openItem.setLabel("Open");
		openItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fileMenu.add(openItem);
		bar.add(fileMenu);

		this.setMenuBar(bar);

		canvas.setBackground(Color.BLACK);
		canvas.setBounds(this.getBounds());
		canvas.setSize(this.getSize());
		canvas.setEnabled(true);
		canvas.setVisible(true);

		this.add(canvas);
		
		try {
			this.initGL();
		} catch (LWJGLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		run();
	}

	public static void main(String[] arg0) {
		SwingUtilities.invokeLater(Main.instance);
	}

	@Override
	public void run() {
		while (!Display.isCloseRequested()) {
			Display.update();
			pollInput();
			paintGL();
			this.update(this.getGraphics());
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.exit(0);
	}
	
	public void initGL() throws LWJGLException {
		Display.setDisplayMode(new DisplayMode(canvas.getWidth(), canvas.getHeight()));
		Display.setInitialBackground(0, 0, 0);
		Display.setLocation(canvas.getX(), canvas.getY());
		Display.setVSyncEnabled(true);
		Display.setParent(canvas);
		Display.create();
	}
	
	public void pollInput() {
		
	}
	
	public void paintGL() {
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	@Override
	public void update(Graphics g) {
		super.update(g);
	}

	protected void newProject() {
		Main.instance.current = new ProjectProperties("unsaved_"
				+ Main.projectIndex + 1);
	}

	protected void saveProject() {
		
	}

	protected void openProject() {

	}

}
