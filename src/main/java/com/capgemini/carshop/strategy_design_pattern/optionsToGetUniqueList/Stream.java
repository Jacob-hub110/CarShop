package com.capgemini.carshop.strategy_design_pattern.optionsToGetUniqueList;


import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.strategy_design_pattern.GetUniqueListStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class Stream implements GetUniqueListStrategy {
    @Override
    public List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles) {
        return articles.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
