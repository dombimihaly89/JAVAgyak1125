package hu.flowacademy;

public class App {

    public static void main(String[] args) {
        String[] options = new String[] {"Vanilia", "Tutti-Frutti", "Karamell", "Rumos dió", "Kávé"};
        Menu menu = new Menu(options);
        menu.print();
        menu.read();
        System.out.println("You have selected: " + menu.getSelection());
    }

}
