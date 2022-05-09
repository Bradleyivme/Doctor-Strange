insert into pacientes (nombre, segundonombre, apellido, segundoapellido, edad) values ('Joaquin', 'Mario', 'Aguilar', 'Segura', 25);
insert into pacientes (nombre, segundonombre, apellido, segundoapellido, edad) values ('Alberto', 'Jose', 'Mariano', 'Galvez', 29);
insert into pacientes (nombre, segundonombre, apellido, segundoapellido, edad) values ('Harry', 'Berus', 'Zuco', 'Lopez', 26);
insert into pacientes (nombre, segundonombre, apellido, segundoapellido, edad) values ('Luis', 'Manuel', 'Zacarias', 'Ferreira', 27);
insert into pacientes (nombre, segundonombre, apellido, segundoapellido, edad) values ('Brady', 'Emanuel', 'Maldonado', 'Jacinto', 21);

insert into polizas (idpaciente, estado, fechainicio, fechafin) values (1, 'PENDIENTE', NOW(), '2032-05-20');
insert into polizas (idpaciente, estado, fechainicio, fechafin) values (2, 'ACEPTADO', NOW(), '2032-05-23');
insert into polizas (idpaciente, estado, fechainicio, fechafin) values (3, 'CANCELADO', NOW(), '2032-05-27');
insert into polizas (idpaciente, estado, fechainicio, fechafin) values (4, 'ACEPTADO', NOW(), '2032-05-25');
insert into polizas (idpaciente, estado, fechainicio, fechafin) values (5, 'PENDIENTE', NOW(), '2032-05-31');

insert into citas (fecha, hora, idpoliza, estadopoliza, observaciones) values (NOW(), NOW(), '1', 'PENDIENTE', 'Quebradura');
insert into citas (fecha, hora, idpoliza, estadopoliza, observaciones) values (NOW(), NOW(), '2', 'ACEPTADO', 'Gripa grado 2');
insert into citas (fecha, hora, idpoliza, estadopoliza, observaciones) values (NOW(), NOW(), '3', 'CANCELADO', 'Sida');
insert into citas (fecha, hora, idpoliza, estadopoliza, observaciones) values (NOW(), NOW(), '4', 'ACEPTADO', 'Infeccion de ojo');
insert into citas (fecha, hora, idpoliza, estadopoliza, observaciones) values (NOW(), NOW(), '5', 'PENDIENTE', 'Quemadura');
