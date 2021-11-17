package com.capgemini.carshop.strategy_design_pattern.optionsToGetUniqueList;


import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.strategy_design_pattern.GetUniqueListStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection implements GetUniqueListStrategy {
    @Override
    public List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles) {
        Set<AbstractArticle> set = new HashSet<>(articles);
        for (AbstractArticle article : set) {
            // Removes all of the elements of this collection that satisfy the given predicate.
            articles.removeIf(article::equals);
        }
        return articles;
    }
}
