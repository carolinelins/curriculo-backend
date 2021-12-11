INSERT INTO academic_formation(id, course, degree, institution, startYear, endYear) VALUES (nextval('hibernate_sequence'), 'Sistemas para Internet', 'Tecnólogo', 'Unicap', 2020, 2022);
INSERT INTO academic_formation(id, course, degree, institution, startYear, endYear) VALUES (nextval('hibernate_sequence'), 'Serviço Social', 'Bacharelado', 'UFPE', 2016, 2019);

INSERT INTO certification(id, name, organization, year) VALUES (nextval('hibernate_sequence'), 'Soft Skills', 'Escola Happen', 2021);
INSERT INTO certification(id, name, organization, year) VALUES (nextval('hibernate_sequence'), 'DELF B2', 'Centre international détudes pédagogiques', 2018);

INSERT INTO hobby(id, hobby) VALUES (nextval('hibernate_sequence'), 'Leitura');
INSERT INTO hobby(id, hobby) VALUES (nextval('hibernate_sequence'), 'Animais');
INSERT INTO hobby(id, hobby) VALUES (nextval('hibernate_sequence'), 'Viagens');

