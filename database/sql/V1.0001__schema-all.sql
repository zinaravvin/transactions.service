DROP TABLE IF EXISTS postgres.suspend_transactions ;

CREATE TABLE postgres.suspend_transactions
(
    id  SERIAL PRIMARY KEY NOT NULL,
    accountId VARCHAR(20),
    effective_date  timestamp with time zone,
    restart_date  timestamp with time zone,
    txn_type VARCHAR(20),
    applied_unapplied_flag VARCHAR(1),
    operaotor_id  VARCHAR(3)

);

CREATE SEQUENCE IF NOT EXISTS postgres.hibernate_sequence INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START
WITH 1 NO CYCLE;
CREATE TABLE productchange
(
);
CREATE SEQUENCE IF NOT EXISTS pc_sequence START WITH 1 INCREMENT BY 1;