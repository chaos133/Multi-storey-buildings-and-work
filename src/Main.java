import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        PlayerStats playerStats = new PlayerStats();
        WorkPace workPace = new WorkPace(playerStats);
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.add(playerStats.mainPanel, BorderLayout.CENTER);
        frame.add(workPace.workPace, BorderLayout.AFTER_LAST_LINE);
        frame.setVisible(true);
    }
}