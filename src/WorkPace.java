import javax.swing.*;
import java.awt.*;

public class WorkPace {
    JFrame work = new JFrame("Темп Работы");
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton workPace = new JButton("Работать");
    JButton relax = new JButton("Расслабиться ");
    JButton workAsUsual = new JButton("Работать как обычно");
    JButton workHard = new JButton("Работать усердно");

    private void isDead(PlayerStats playerStats){
        if (playerStats.statsList.get(0).value <= 0 || playerStats.statsList.get(1).value <= 0) {
            JFrame message = new JFrame("Смерть");
            message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            message.setSize(1500,700);
            JLabel dead = new JLabel("YOU DIED");
            dead.setForeground(Color.RED);
            dead.setFont(new Font("YOU DIED",Font.BOLD,200));
            dead.setHorizontalAlignment(SwingConstants.CENTER);
            message.add(dead);
            message.setVisible(true);
        }
    }
    public WorkPace(PlayerStats playerStats) {

        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        workPace.addActionListener(e -> {
            work.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            work.setSize(300,300);
            work.setVisible(true);
        });

        relax.addActionListener(e -> {
            playerStats.statsList.get(1).updateValue(5);
            work.dispose();

        });
        workAsUsual.addActionListener(e -> {
            playerStats.statsList.get(0).updateValue(-5);
            playerStats.statsList.get(1).updateValue(-10);
            playerStats.statsList.get(8).updateValue(1);
            work.dispose();
            isDead(playerStats);
        });
        workHard.addActionListener(e -> {
            playerStats.statsList.get(0).updateValue(-15);
            playerStats.statsList.get(1).updateValue(-30);
            playerStats.statsList.get(8).updateValue(2);
            work.dispose();
            isDead(playerStats);
        });
        panel.add(relax);
        panel.add(workAsUsual);
        panel.add(workHard);
        work.add(panel);
    }
}