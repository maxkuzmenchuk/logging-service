create table user_log
(
    log_id           serial    not null
        constraint user_log_pk
            primary key,
    user_id          int       not null,
    operation_type   varchar   not null,
    entity_type      varchar   not null,
    updated_field    varchar   not null,
    old_value        varchar,
    new_value        varchar,
    updating_user_id int       not null,
    updating_date    timestamp not null
);

create unique index "user_log_log_id _uindex"
    on user_log (log_id);

create table test_log
(
    log_id           serial    not null
        constraint test_log_pk
            primary key,
    test_id          int       not null,
    operation_type   varchar   not null,
    entity_type      varchar   not null,
    updated_field    varchar   not null,
    old_value        varchar,
    new_value        varchar,
    updating_user_id int       not null,
    updating_date    timestamp not null
);

create unique index "test_log_log_id _uindex"
    on test_log (log_id);

create table test_results_log
(
    log_id           serial    not null
        constraint test_results_log_pk
            primary key,
    test_id          int       not null,
    operation_type   varchar   not null,
    entity_type      varchar   not null,
    updating_user_id int       not null,
    updating_date    timestamp not null
);

create unique index "test_results_log_log_id _uindex"
    on test_results_log (log_id);

create table file_log
(
    log_id           serial    not null
        constraint file_log_pk
            primary key,
    test_id          int       not null,
    operation_type   varchar   not null,
    entity_type      varchar   not null,
    updating_user_id int       not null,
    updating_date    timestamp not null
);

create unique index "file_log_log_id _uindex"
    on file_log (log_id);