package org.hibernate.dialect;

import static org.slf4j.LoggerFactory.getLogger;

import org.hibernate.engine.jdbc.dialect.spi.DialectResolutionInfo;
import org.slf4j.Logger;

public class MyPgDialect extends PostgreSQLDialect {

  private static final Logger LOGGER = getLogger(MyPgDialect.class);

  public MyPgDialect() {
    super();
    LOGGER.info("MyPgDialect()");
  }

  public MyPgDialect(DialectResolutionInfo info) {
    super(info);
    LOGGER.info("MyPgDialect(DialectResolutionInfo info)");
    LOGGER.info("Db Version: '{}'.", info.getDatabaseVersion());
  }

  public MyPgDialect(DatabaseVersion version) {
    super(version);
    LOGGER.info(" MyPgDialect(DatabaseVersion version)");
  }

  public MyPgDialect(DatabaseVersion version, PostgreSQLDriverKind driverKind) {
    super(version, driverKind);
    LOGGER.info("MyPgDialect(DatabaseVersion version, PostgreSQLDriverKind driverKind) ");
  }


}
