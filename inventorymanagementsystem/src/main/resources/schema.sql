create table if not exists item (
          id Long PRIMARY KEY AUTO_INCREMENT,
          name varchar(255),
          description varchar(1000),
          price BigDecimal,
          quantity int
);