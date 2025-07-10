import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerStats {
    JFrame frame = new JFrame("Stats");
    JPanel mainPanel = new JPanel();
    public List<States> statsList;

    public Pair<String, Integer> health = new Pair<>("Здоровье", 100);
    Pair<String, Integer> heredity = new Pair<>("Наследственность", 0);
    public Pair<String, Integer> mental = new Pair<>("Ментальное здоровье", 100);
    Pair<String, Integer> stressRes = new Pair<>("Стрессоустойчивость", 0);
    Pair<String, Integer> luck = new Pair<>("Удача", 0);
    Pair<String, Integer> deception = new Pair<>("Пиздёж", 0);
    Pair<String, Integer> experience = new Pair<>("Опыт", 0);
    Pair<String, Integer> contact = new Pair<>("Связи", 0);
    Pair<String, Integer> income = new Pair<>("Доход", 1000);
    Pair<String, Integer> ballance = new Pair<>("Баланс", 0);
    Pair<String, Integer> efficiency = new Pair<>("Эффективность", 0);


    public PlayerStats() {
        // Создаем список в нужном порядке
        statsList = Arrays.asList(
        new States(health.getKey(), health.getValue(), 5, mainPanel),               // Здоровье
        new States(mental.getKey(), mental.getValue(), 5, mainPanel),               // Ментальное здоровье
        new States(heredity.getKey(), heredity.getValue(), 1, mainPanel),           // Наследственность
        new States(stressRes.getKey(), stressRes.getValue(), 1, mainPanel),         // Стрессоустойчивость
        new States(luck.getKey(), luck.getValue(), 1, mainPanel),                   // Удача
        new States(deception.getKey(), deception.getValue(), 1, mainPanel),         // Пиздёж
        new States(experience.getKey(), experience.getValue(), 1, mainPanel),       // Опыт
        new States(contact.getKey(), contact.getValue(), 1, mainPanel),             // Связи
        new States(efficiency.getKey(), efficiency.getValue(), 1, mainPanel),       // Эффективность
        new States(ballance.getKey(), ballance.getValue(), 50, mainPanel)           // Баланс
    );
    }
}
