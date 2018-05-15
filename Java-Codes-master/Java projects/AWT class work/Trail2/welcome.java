import java.awt.*;

class Welcome extends Frame{
	
	Label l1 ;
	
	Welcome(){
		
		
		setVisible(true);
		setSize(550,500);
		setLayout(null);
		
		l1 = new Label("Welcome",Label.CENTER);
		l1.setBounds(150,150,150,150);
		this.add(l1);
	
			
	}
	
	
	
}