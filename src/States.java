import javax.swing.*;
import java.awt.*;

public class States{
    private String field;
    public int value;
    private int changeSize;
    private JLabel valueNow;

    public States(String field, int startValue, int changeSize, JPanel mainPanel) {
        this.field = field;
        this.value = startValue;
        this.changeSize = changeSize;

        // Создаем компоненты
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel stateLabel = new JLabel(field + ": ");
        valueNow = new JLabel(String.valueOf(value));

        JButton incrementButton = new JButton("+" + changeSize);
        JButton decrementButton = new JButton("-" + changeSize);

        // Добавляем обработчики
        incrementButton.addActionListener(e -> updateValue(changeSize));
        decrementButton.addActionListener(e -> updateValue(-changeSize));

        // Добавляем компоненты на панель
        panel.add(stateLabel);
        panel.add(valueNow);
        panel.add(decrementButton);
        panel.add(incrementButton);

        // Добавляем панель на основную панель
        mainPanel.add(panel);
    }

    public void updateValue(int change) {
        value += change;
        valueNow.setText(String.valueOf(value));
    }
}
