import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
 class DressingUpComponents
{
    JTextField disabled,
               normal;
    JLabel     label;
   
    public DressingUpComponents()
    {
        configureDisabledTextField();
        normal = new JTextField("hello world");
        configureLabel();
    }
  
    private void configureDisabledTextField()
    {
        disabled = new JTextField("hello world");
        disabled.setEnabled(false);
      
	  Color bgColor = UIManager.getColor("TextField.background");
        disabled.setBackground(bgColor);
        Color fgColor = UIManager.getColor("TextField.foreground");
        disabled.setDisabledTextColor(fgColor);
        disabled.setBorder(BorderFactory.createEtchedBorder());
    }
  
    private void configureLabel()
    {
        label = new JLabel("hello world");
        label.setBorder(BorderFactory.createEtchedBorder());
        label.setOpaque(true);         // required for background colors
        label.setBackground(UIManager.getColor("TextField.background"));
        label.setFont(UIManager.getFont("TextField.font"));
    }
  
    public static void main(String[] args)
    {
        DressingUpComponents dup = new DressingUpComponents();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = f.getContentPane();
        cp.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weighty = 1.0;                 // allow vertical dispersion
        gbc.gridwidth = GridBagConstraints.REMAINDER;  // single column
        cp.add(dup.disabled, gbc);
        cp.add(dup.normal,   gbc);
        cp.add(dup.label,    gbc);
        f.setSize(200,200);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}