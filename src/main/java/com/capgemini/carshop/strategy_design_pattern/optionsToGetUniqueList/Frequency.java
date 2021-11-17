package com.capgemini.carshop.strategy_design_pattern.optionsToGetUniqueList;


import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.strategy_design_pattern.GetUniqueListStrategy;

import java.util.Collections;
import java.util.List;

public class Frequency implements GetUniqueListStrategy {
    @Override
    public List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles) {
        for (AbstractArticle article : articles) {
            // Returns the number of elements in the specified collection equal to the specified object.
            // More formally, returns the number of elements e in the collection
            int frequency = Collections.frequency(articles, article);
            if (frequency>1){
                articles.remove(article);
            }
        }
        return articles;
    }
}
