package Exercise12;
import javax.swing.JOptionPane;
public class ChampionsLeague {
    public Object showMessage() {
        String[] teamNames = new String[2];
        int[][] scores = new int[2][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                teamNames[j] = JOptionPane.showInputDialog("Ingrese el nombre del equipo " + (j + 1));
                scores[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el marcador del equipo " + (j + 1)));
            }
        }

        int[] totalScores = new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                totalScores[i] += scores[i][j];
            }
        }

        String result = "";
        for (int i = 0; i < 2; i++) {
            result += "Equipo " + teamNames[i] + ": " + totalScores[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
        return null;
    }
}

