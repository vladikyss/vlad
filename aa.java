import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class main {
    public static void main(String[] args) {
		JFrame frame=new JFrame("Lab 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton btn=new JButton("Result");
		JTextField str = new JTextField();
		JTextField res = new JTextField();
		
		GridLayout gbl = new GridLayout(4,0);
		frame.setLayout(gbl);
		frame.getContentPane().add(str);
		frame.getContentPane().add(btn);
		frame.getContentPane().add(res);
		
		frame.setSize(200,100);
		btn.addActionListener(new ActionListener() 
			{
				 public void actionPerformed(ActionEvent e)
        {
            String a;
            String b = "";
            int i;

            a=str.getText();
            for (i = 0; i<a.length();i++)
            {
                if (Character.isLetter(a.charAt(i))){
                    if (Character.isLowerCase(a.charAt(i)))
                        b += Character.toUpperCase(a.charAt(i));
                    else
                        b += Character.toLowerCase(a.charAt(i));
                }
            }
            res.setText(b);
        }
			}
		);

		
    }
}
