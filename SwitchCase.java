import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[]args) {
	String input = JOptionPane.showInputDialog("Ener role");
		switch (input) {case "Administrator":
			System.out.println("Welcome " + input);
		break;
		case "Faculty":
			System.out.println("Welcome " + input);
		break;
		case "Staff":
			System.out.println("Welcome " + input);
		break;
		case "Student":
			System.out.println("Welcome " + input);
		break;
		case "Guest":
			System.out.println("Welcome " + input);
		break;	
		default:System.out.println("Invalid role");
		}
			}
				}
