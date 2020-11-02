package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
/*        Item item = new Item();
        LocalDateTime currentDateTime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE HH:mm:ss");
        String currentDateTimeFormatter = currentDateTime.format(formatter);
        System.out.println(currentDateTimeFormatter);
*/
        Item item = new Item(1, "root");
        System.out.println(item);
    }

}
