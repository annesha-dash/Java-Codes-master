import java.awt.*;

class Welcome extends Frame {
	
	Label l = new Label("Welcome");

	public Welcome(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);

		
		l.setBounds(200,200,100,50);
		this.add(l);
}
}