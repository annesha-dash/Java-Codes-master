import javax.swing.*;


public class Practice1 {

	
	public static void main(String[] args){

		new Practice1();
		
		}



	public Practice1(){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("Practice1");


		JPanel thePanel = new JPanel();

		JLabel userName = new JLabel("Username");
		thePanel.add(userName);

		JTextField userText = new JTextField("",12);
		thePanel.add(userText);

		JLabel passWord = new JLabel("Password");
		thePanel.add(passWord);

		JTextField passText = new JTextField("",12);
		thePanel.add(passText);

		JButton login = new JButton("Login");
		login.setContentAreaFilled(false);
		thePanel.add(login);

		layout.add(thePanel);
		layout.setVisible(true);





	}

	
	
}

