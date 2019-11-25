package hu.flowacademy;

import java.util.Scanner;

public class Menu {
    int selection;
    String [] options;

    public Menu() {

    }

    public Menu(String[] options) {
        this.options = options;
    }

    public void print () {
        System.out.println("Available options: ");
        for (int i = 0; i < this.options.length; i++) {
            System.out.println((i+1) + ". " + options[i]);
        }
    }

    public void read () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select: ");
        String choice = sc.nextLine();
        int choiceNumber;
        if (Character.isDigit(choice.charAt(0))) {
            choiceNumber = Integer.parseInt(choice);
            this.selection = choiceNumber;
        }
        choice.toLowerCase();
        switch (choice) {
            case "vanilia": this.selection = 1; break;
            case "tutti-frutti": this.selection = 2; break;
            case "karamell": this.selection = 3; break;
            case "rumos dió": this.selection = 4; break;
            case "kávé": this.selection = 5;
        }
        if (this.selection > 5 || this.selection < 1) {
            this.selection = 0;
            System.out.println("Rossz gombot nyomtál");
            this.read();
        }
    }

    public String getSelection() {
        if (this.selection == 0) return "Not on the list.";
        return this.options[this.selection - 1];
    }


}
