import javax.swing.*;

public class PowerOf extends UserChoiceDialog {

    public static void userInts() {
        int number = 0, result = 0, toPower = 0;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        toPower = Integer.parseInt(JOptionPane.showInputDialog("Enter the power"));

        result = power(number,toPower);
        JOptionPane.showMessageDialog(null,number + " to the power of "
                + toPower + " = " + result,"PowerOf",JOptionPane.INFORMATION_MESSAGE);

        UserChoiceDialog.choiceDialog();
    }

    private static int power(int x, int y) {

        if( y == 0)
        {
            return 1;
        }
        if( y < 0)
        {
            return 1;
        }
        else
        {
            int results = x * power(x,y-1);
            return results;
        }

    }

}