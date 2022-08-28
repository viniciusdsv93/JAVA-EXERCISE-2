package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many people? ");
    int peopleNumber = sc.nextInt();

    String[] names = new String[peopleNumber];
    int[] ages = new int[peopleNumber];
    double[] heights = new double[peopleNumber];

    for (int i = 0; i < peopleNumber; i++) {
      System.out.println();
      System.out.print("Name of the person " + (i + 1) + ": ");
      sc.nextLine();
      names[i] = sc.nextLine();
      System.out.print("Age of the person " + (i + 1) + ": ");
      ages[i] = sc.nextInt();
      System.out.print("Height of the person " + (i + 1) + ": ");
      heights[i] = sc.nextDouble();
    }
    double sum = 0.0d;
    int youngerThan16 = 0;
    for (int i = 0; i < peopleNumber; i++) {
      sum += heights[i];
      if (ages[i] < 16) youngerThan16++;
    }

    double youngerPercentage = (youngerThan16 * 100) / peopleNumber;

    System.out.println();
    System.out.println("Average height: " + String.format("%.2f", sum / peopleNumber));
    System.out.println("People younger than 16 years old: " + String.format("%.1f", youngerPercentage) + "%");

    for (int i = 0; i < peopleNumber; i++) {
      if (ages[i] < 16) {
        System.out.println(names[i]);
      }
    }

    sc.close();

  }
}