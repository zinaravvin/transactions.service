DROP TABLE postgres.productchange ;

CREATE TABLE postgres.productchange
(
    id  SERIAL PRIMARY KEY NOT NULL,
    accountId VARCHAR(20),
    effective_date  timestamp with time zone,
    txn_type VARCHAR(20),
    applied_unapplied_flag VARCHAR(1),
    product_code VARCHAR(20),
    promo_code VARCHAR(20),
    promo_rate_daily DECIMAL(3),
    promo_rate_sunday DECIMAL(3),
    operaotor_id  VARCHAR(3)

);


