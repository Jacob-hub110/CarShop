package com.capgemini.carshop.strategy_design_pattern;


import com.capgemini.carshop.artikels.AbstractArticle;

import java.util.List;

public interface GetUniqueListStrategy {
  List<AbstractArticle> getUniqueParts(List<AbstractArticle> articles);
}
