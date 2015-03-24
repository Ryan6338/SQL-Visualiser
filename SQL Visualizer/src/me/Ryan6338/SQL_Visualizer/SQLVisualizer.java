package me.Ryan6338.SQL_Visualizer;

import javax.swing.JFrame
import javax.imageio.ImageIO
import javax.awt.image.BufferedImage
import java.io.File

import me.Ryan6338.SQLVisualizer.GUI.StartMenu

public class SQLVisualizer extends JFrame {
	
	public SQLVisualizer() {
		initialize();
		JPanel startMenu = new StartMenu();
		this.add(startMenu);
	}
	
	public static void main(String[] args) {
		new SQLVisualizer();
	}
	
	public BufferedImage getIcon() {
		File imageFile = new File("icon.jpg")
		BufferedImage icon = ImageIO.read(imageFile);
		return icon;
	}
	
	private void initialize() {
		setTitle("SQL Visualizer");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(true);
		setIconImage(getIcon());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
