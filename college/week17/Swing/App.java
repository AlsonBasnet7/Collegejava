import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
//there's this pattern
//obj
//setSize
//Layout
//visible(true)

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Signup Form");
        frame.setSize(500, 400);
        frame.setLayout(null);

        // Username
        JLabel nameLabel1 = new JLabel("Username");
        nameLabel1.setBounds(50, 50, 100, 30);
        frame.add(nameLabel1);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 50, 200, 30);
        frame.add(nameField);

        // Email
        JLabel nameLabel2 = new JLabel("Email");
        nameLabel2.setBounds(50, 100, 100, 30);
        frame.add(nameLabel2);

        JTextField nameField1 = new JTextField();
        nameField1.setBounds(180, 100, 200, 30);
        frame.add(nameField1);

        // Password
        JLabel nameLabel3 = new JLabel("Password");
        nameLabel3.setBounds(50, 150, 100, 30);
        frame.add(nameLabel3);

        JTextField nameField2 = new JTextField();
        nameField2.setBounds(180, 150, 200, 30);
        frame.add(nameField2);
        
        //Button
        JButton buttoName = new JButton ("Submit");
        buttoName.setBounds(150,250,100,30);
        frame.add(buttoName);
        

        frame.setVisible(true);
    }
}