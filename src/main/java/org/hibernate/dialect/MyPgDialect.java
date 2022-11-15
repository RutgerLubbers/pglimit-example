package org.hibernate.dialect;

import org.hibernate.dialect.pagination.LimitHandler;
import org.hibernate.dialect.pagination.LimitOffsetLimitHandler;
import org.hibernate.dialect.pagination.OffsetFetchLimitHandler;

public class MyPgDialect extends PostgreSQLDialect {

  @Override
  public LimitHandler getLimitHandler() {
    // LimitOffsetLimitHandler.INSTANCE
    return new OffsetFetchLimitHandler(false);
  }
}
