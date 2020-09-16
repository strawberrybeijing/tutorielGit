package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() 
	{
		super();
		
		Model modl = new Model();
		
		Controller ctrl = new Controller(modl); 
		//build
		View view = new View();
		//.....
		modl.addObserver(view);
		
		view.addActionListener(ctrl);

		this.addWindowListener(this);

		this.add(view);
		
		this.pack();
		this.setTitle("The clic game");
		this.setVisible(true);	
	}
//zhaijing zuimei
	@Override
	public void windowActivated(WindowEvent e) {}
//2333
	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

}
