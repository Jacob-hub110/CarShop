package com.capgemini.carshop.strategy_design_pattern.optionsToGetUniqueList;


import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.strategy_design_pattern.GetUniqueListStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map implements GetUniqueListStrategy {
    @Override
    public List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles) {
        // tworzy mapę, w której kluczem jest element, a wartością ilość elementu.
        java.util.Map<AbstractArticle, Integer> articlesMap = articles.stream()
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        // usuwa z mapy elmenty ktorych value!=1
       articlesMap.values().removeIf(value -> value!=1);
        // zamienia klucze z mapy na liste i ją zwraca
        return new ArrayList<>(articlesMap.keySet());
    }
}
