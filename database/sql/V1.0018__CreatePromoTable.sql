DROP TABLE IF EXISTS postgres.promo_rate ;

CREATE TABLE postgres.promo_rate
(
    id  SERIAL PRIMARY KEY NOT NULL,
    promo_code VARCHAR(20),
    promo_description VARCHAR(100),
    rate_card  VARCHAR(1),
    product_code VARCHAR(20),
    promo_start_date  DATE,
    promo_end_date   DATE,
    daily_rate1  NUMERIC(5,3),
    sunday_rate1  NUMERIC(5,3),
    cycle_cost1   NUMERIC(7,2),
    promo_duration1 NUMERIC(3,0),
    daily_rate2  NUMERIC(5,3),
    sunday_rate2  NUMERIC(5,3),
    cycle_cost2   NUMERIC(7,2),
    promo_duration2 NUMERIC(3,0),
    daily_rate3  NUMERIC(5,3),
    sunday_rate3  NUMERIC(5,3),
    cycle_cost3   NUMERIC(7,2),
    promo_duration3 NUMERIC(3,0),
    number_of_tiers NUMERIC(3,0),
    txn_type VARCHAR(20),
    applied_unapplied_flag VARCHAR(1),
    operaotor_id  VARCHAR(3),
    create_date timestamp with time zone,
    created_by VARCHAR(20)

);

