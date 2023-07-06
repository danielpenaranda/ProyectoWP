/*Se crea la base de datos */
drop schema if exists fractalgames;
drop user if exists usuario;
CREATE SCHEMA fractalgames ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario'@'%' identified by 'usuario.';

/*Se asignan los prvilegios sobr ela base de datos fractalgames al usuario creado */
grant all privileges on fractalgames.* to 'usuario'@'%';
flush privileges;
use fractalgames;


CREATE TABLE rol (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL
);

CREATE TABLE usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE usuarios_roles (
  usuario_id INT,
  rol_id INT,
  FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
  FOREIGN KEY (rol_id) REFERENCES rol(id),
  PRIMARY KEY (usuario_id, rol_id)
);

SELECT * FROM usuarios

