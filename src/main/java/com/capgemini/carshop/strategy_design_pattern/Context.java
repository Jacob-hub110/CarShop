package com.capgemini.carshop.strategy_design_pattern;

import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.strategy_design_pattern.optionsToGetUniqueList.*;


import java.util.List;
import java.util.Scanner;

public class Context {

    public static List<AbstractArticle> chooseAlgoAndGetUniqueList(List<AbstractArticle> articles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jakiego algo chcesz uzywac do stworzenia listy unikatów");
        String s = scanner.nextLine();
        switch (s) {
            case "Kolekcji":
                return new Collection().getUniqueParts(articles);
            case "Frequency":
             return new Frequency().getUniqueParts(articles);
            case "Iteracji":
          return new Iteration().getUniqueParts(articles);
            case "Mapy":
                return new Map().getUniqueParts(articles);
            case "Streamu":
                return new Stream().getUniqueParts(articles);
            default:
                System.out.println("Nic nie wybrales");
        }
        return null;
    }
}
