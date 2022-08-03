

CREATE UNIQUE INDEX CONCURRENTLY IF NOT EXISTS ARISTO_STOP_ACCT_DATES_IDX
        ON postgres.suspend_transactions (accountId, effective_date, restart_date);






