
INSERT INTO vacancy (vacancy_name, company_name, creation_date, salary, location, description, original_link) VALUES ('Senior Java Developer', 'MicroSoft Ukraine', '2016-12-20', 'NULL', 'Kharkov', 'Наша компания является NET Framework и Java. разработка и обслуживание', 'https://www.work.ua/jobs/1362915/');
INSERT INTO vacancy (vacancy_name, company_name, creation_date, salary, location, description, original_link) VALUES ('Middle Java Developer', 'XWZ', '2016-12-20', 'NULL', 'Kharkov', 'Молодая развивающаяся компания ищет специалиста', 'https://www.work.ua/jobs/1362900/');
INSERT INTO vacancy (vacancy_name, company_name, creation_date, salary, location, description, original_link) VALUES ('Java программист', '', '2016-12-20', '10000', 'Kiev', 'He молодая, но развивающаяся компания ищет специалиста', 'https://www.work.ua/jobs/136444/');
INSERT INTO vacancy (vacancy_name, company_name, creation_date, salary, location, description, original_link) VALUES ('Java', 'укркод', '2016-12-20', '110000', 'удалённо', 'интересная работа', 'https://www.work.ua/jobs/888880/');


INSERT INTO parser(parser_name, url, status) VALUES ('work.ua', 'off', 'https://www.work.ua/jobs-it-java/?advs=1');
INSERT INTO parser(parser_name, url, status) VALUES ('rabota.ua', 'on', 'http://rabota.ua/jobsearch/vacancy_list?keyWords=java');


INSERT INTO ROLE(ROLE_NAME) VALUES ('admin');
INSERT INTO ROLE(ROLE_NAME) VALUES ('client');


INSERT INTO USER(LOGIN, PASSWORD) VALUES ('alex', '1234');
INSERT INTO USER(LOGIN, PASSWORD) VALUES ('petya', 'qwerty');
INSERT INTO USER(LOGIN, PASSWORD) VALUES ('vova', 'qwerty');
INSERT INTO USER(LOGIN, PASSWORD) VALUES ('ulya', 'qwerty');


INSERT INTO USER_ROLE(USER_ID, ROLE_ID) VALUES (1, 1);
INSERT INTO USER_ROLE(USER_ID, ROLE_ID) VALUES (2, 2);
INSERT INTO USER_ROLE(USER_ID, ROLE_ID) VALUES (3, 2);
INSERT INTO USER_ROLE(USER_ID, ROLE_ID) VALUES (4, 2);













