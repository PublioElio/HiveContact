-- Create the hivecontacts database
CREATE DATABASE IF NOT EXISTS hivecontacts;
USE hivecontacts;

-- Create contacts table
CREATE TABLE contacts (
    id_contact INT AUTO_INCREMENT PRIMARY KEY,
    contact_name VARCHAR(255) NOT NULL,
    contact_email VARCHAR(255) UNIQUE NOT NULL,
    contact_age INT NOT NULL
);

-- Sample data for contacts table
INSERT INTO contacts (contact_name, contact_email, contact_age) VALUES
('Juan Pérez', 'juan.perez@example.com', 30),
('Ana García', 'ana.garcia@example.com', 25),
('Carlos Rodríguez', 'carlos.rodriguez@example.com', 40),
('María López', 'maria.lopez@example.com', 35),
('Javier Fernández', 'javier.fernandez@example.com', 28);



INSERT INTO contacts (contact_name, contact_email, contact_age) VALUES
('Juan Pérez', 'juan.perez@example.com', 30),
('Ana García', 'ana.garcia@example.com', 25),
('Carlos Rodríguez', 'carlos.rodriguez@example.com', 40),
('María López', 'maria.lopez@example.com', 35),
('Javier Fernández', 'javier.fernandez@example.com', 28),
('Elena Gómez', 'elena.gomez@example.com', 33),
('Roberto Díaz', 'roberto.diaz@example.com', 38),
('Lucía Martínez', 'lucia.martinez@example.com', 29),
('Fernando Torres', 'fernando.torres@example.com', 41),
('Sara Sánchez', 'sara.sanchez@example.com', 22),
('Pedro Jiménez', 'pedro.jimenez@example.com', 26),
('Laura Vargas', 'laura.vargas@example.com', 32),
('Hugo Mendoza', 'hugo.mendoza@example.com', 27),
('Isabel Castro', 'isabel.castro@example.com', 37),
('David Núñez', 'david.nunez@example.com', 44),
('Paula Ortega', 'paula.ortega@example.com', 23),
('Andrés Silva', 'andres.silva@example.com', 39),
('Victoria Ramos', 'victoria.ramos@example.com', 34),
('Miguel Herrera', 'miguel.herrera@example.com', 31),
('Sandra Navarro', 'sandra.navarro@example.com', 36),
('Pablo Soto', 'pablo.soto@example.com', 45),
('Carmen León', 'carmen.leon@example.com', 28),
('Eduardo Fuentes', 'eduardo.fuentes@example.com', 42),
('Beatriz Domínguez', 'beatriz.dominguez@example.com', 29),
('Alejandro Ruiz', 'alejandro.ruiz@example.com', 46),
('Patricia Blanco', 'patricia.blanco@example.com', 27),
('Ricardo Paredes', 'ricardo.paredes@example.com', 43),
('Natalia Figueroa', 'natalia.figueroa@example.com', 24),
('Sergio Miranda', 'sergio.miranda@example.com', 50),
('Vanessa Correa', 'vanessa.correa@example.com', 30),
('Iván Ríos', 'ivan.rios@example.com', 38),
('Silvia Guzmán', 'silvia.guzman@example.com', 32),
('Manuel Estrada', 'manuel.estrada@example.com', 35),
('Cristina Vargas', 'cristina.vargas@example.com', 26),
('José Suárez', 'jose.suarez@example.com', 40),
('Gabriela Pacheco', 'gabriela.pacheco@example.com', 33),
('Francisco Salazar', 'francisco.salazar@example.com', 37),
('Lorena Vera', 'lorena.vera@example.com', 25),
('Álvaro Montoya', 'alvaro.montoya@example.com', 41),
('Raquel Ibáñez', 'raquel.ibanez@example.com', 28),
('Enrique Castillo', 'enrique.castillo@example.com', 34),
('Camila Delgado', 'camila.delgado@example.com', 31),
('Esteban Molina', 'esteban.molina@example.com', 39),
('Daniela Acosta', 'daniela.acosta@example.com', 27),
('Oscar Peralta', 'oscar.peralta@example.com', 44),
('Sofía Quintero', 'sofia.quintero@example.com', 23),
('Luis Rojas', 'luis.rojas@example.com', 36),
('Fernanda Espinoza', 'fernanda.espinoza@example.com', 45),
('Diego Cárdenas', 'diego.cardenas@example.com', 22),
('Marta Sandoval', 'marta.sandoval@example.com', 38),
('Agustín Castro', 'agustin.castro@example.com', 50),
('Angela Luna', 'angela.luna@example.com', 30),
('Jorge Méndez', 'jorge.mendez@example.com', 48),
('Verónica Peña', 'veronica.pena@example.com', 34),
('Héctor Gutiérrez', 'hector.gutierrez@example.com', 29),
('Melisa Rosales', 'melisa.rosales@example.com', 31),
('Ramón Ortiz', 'ramon.ortiz@example.com', 47),
('Clara Jiménez', 'clara.jimenez@example.com', 42),
('Arturo Vázquez', 'arturo.vazquez@example.com', 27),
('Marcos Aguirre', 'marcos.aguirre@example.com', 39);