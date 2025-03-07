CREATE TABLE contract_info
(
    contact_info_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    contract_id     VARCHAR(255) NOT NULL UNIQUE,
    department_code CHAR(6)      NOT NULL,
    account_number  CHAR(16)     NOT NULL UNIQUE,
    contract_number VARCHAR(255) NOT NULL,
    login           VARCHAR(255) NOT NULL UNIQUE,
    created_data    TIMESTAMPTZ  NOT NULL
);


CREATE TABLE device_info
(
    device_id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    mac_address         VARCHAR(255) NOT NULL UNIQUE,
    serial_number       VARCHAR(255) NOT NULL UNIQUE,
    manufacturer        VARCHAR(255) NOT NULL,
    binding_date        TIMESTAMPTZ  NOT NULL,
    desired_tariff_plan VARCHAR(255),
    work_order_number   VARCHAR(255),
    service_type        VARCHAR(255)
);

CREATE TABLE cpe_info
(
    device_id         UUID PRIMARY KEY REFERENCES device_info (device_id),
    cpe_mac_address   VARCHAR(255),
    cpe_serial_number VARCHAR(255),
    cpe_manufacturer  VARCHAR(255),
    cpe_binding_date  TIMESTAMPTZ
);

CREATE TABLE ont_info
(
    device_id         UUID PRIMARY KEY REFERENCES device_info (device_id),
    ont_mac_address   VARCHAR(255),
    ont_serial_number VARCHAR(255),
    ont_manufacturer  VARCHAR(255),
    ont_binding_date  TIMESTAMPTZ
);


CREATE TABLE equipment_registry
(
    equipment_registry_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    contract_info_id      UUID REFERENCES contract_info (contact_info_id) ON DELETE CASCADE,
    cpe_info_id           UUID REFERENCES cpe_info (device_id) ON DELETE CASCADE,
    ont_info_id           UUID REFERENCES ont_info (device_id) ON DELETE CASCADE
);


-- CREATE TABLE full_registration_info
-- (
--     -- Поля з таблиці contract_info
--     contact_info_id       UUID PRIMARY KEY DEFAULT gen_random_uuid(),
--     contract_id           VARCHAR(255) NOT NULL UNIQUE,
--     department_code       CHAR(6)      NOT NULL,
--     account_number        CHAR(16)     NOT NULL UNIQUE,
--     contract_number       VARCHAR(255) NOT NULL,
--     login                 VARCHAR(255) NOT NULL UNIQUE,
--     created_data          TIMESTAMPTZ  NOT NULL,
--
--     -- Поля з таблиці device_info
--     mac_address           VARCHAR(255) NOT NULL UNIQUE,
--     serial_number         VARCHAR(255) NOT NULL UNIQUE,
--     manufacturer          VARCHAR(255) NOT NULL,
--     binding_date          TIMESTAMPTZ  NOT NULL,
--     desired_tariff_plan   VARCHAR(255),
--     work_order_number     VARCHAR(255),
--     service_type          VARCHAR(255),
--
--     -- Поля з таблиці cpe_info
--     cpe_mac_address       VARCHAR(255),
--     cpe_serial_number     VARCHAR(255),
--     cpe_manufacturer      VARCHAR(255),
--     cpe_binding_date      TIMESTAMPTZ,
--
--     -- Поля з таблиці ont_info
--     ont_mac_address       VARCHAR(255),
--     ont_serial_number     VARCHAR(255),
--     ont_manufacturer      VARCHAR(255),
--     ont_binding_date      TIMESTAMPTZ,
--
--     -- Поля з таблиці equipment_registry
--     equipment_registry_id UUID             DEFAULT gen_random_uuid(),
--     cpe_info_id           UUID,
--     ont_info_id           UUID
-- );
