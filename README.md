The SpringBoot application exposes an endpoint on `http://localhost:8080/posts`.

The `PostController` serves this endpoint and uses the `PostRepository` to query the PostgreSQL.

Accessing this endpoint results in:
```
2022-11-15T08:55:25.106+01:00 DEBUG 3962 --- [nio-8080-exec-2] org.hibernate.SQL                        : 
    select
        p1_0.id,
        p1_0.title 
    from
        post p1_0 offset ? rows fetch first ? rows only
Hibernate: 
    select
        p1_0.id,
        p1_0.title 
    from
        post p1_0 offset ? rows fetch first ? rows only
2022-11-15T08:55:25.110+01:00  WARN 3962 --- [nio-8080-exec-2] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 42601
2022-11-15T08:55:25.110+01:00 ERROR 3962 --- [nio-8080-exec-2] o.h.engine.jdbc.spi.SqlExceptionHelper   : ERROR: syntax error at or near "$2"
  Position: 69
2022-11-15T08:55:25.119+01:00 ERROR 3962 --- [nio-8080-exec-2] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: org.springframework.dao.InvalidDataAccessResourceUsageException: JDBC exception executing SQL [select p1_0.id,p1_0.title from post p1_0 offset ? rows fetch first ? rows only]; SQL [n/a]] with root cause

org.postgresql.util.PSQLException: ERROR: syntax error at or near "$2"
  Position: 69
	at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2676)
	at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2366)

```
