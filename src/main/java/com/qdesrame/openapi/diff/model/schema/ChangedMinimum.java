package com.qdesrame.openapi.diff.model.schema;

import com.qdesrame.openapi.diff.model.DiffContext;
import java.math.BigDecimal;

public class ChangedMinimum extends ChangedMinimumProperty<BigDecimal> {

  public ChangedMinimum(BigDecimal oldValue, BigDecimal newValue, DiffContext context) {
    super(oldValue, newValue, context);
  }
}
