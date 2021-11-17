package com.capgemini.carshop.strategy_design_pattern.optionsToGetUniqueList;


import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.strategy_design_pattern.GetUniqueListStrategy;

import java.util.List;

public class Iteration implements GetUniqueListStrategy {
    @Override
    public List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles) {

        // iterująca od przodu
        for (int i = 0; i < articles.size(); i++) {
            // iterująca od tyłu
            for (int j = articles.size() - 1; j >= 0; j--) {
                // jesli tutaj obie pętle trafią na ten sam index to znaczy ze element znajduje się w liscie tylko raz
                // w innym wypadku obiekt wystepuje wiecej niz raz więc trzeba sie go pozbyć
                if (i!=j){
                    articles.remove(articles.get(i));
                    articles.remove(articles.get(j));
                }
            }
        }
        return articles;
    }
}