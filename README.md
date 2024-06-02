# LOGIN SENA SPRING BACKEND

## Configuración y inicio del proyecto

### Configurar conexión a la base de datos

/src/main/resources/application.properties y editar los datos:

````bash
spring.application.name=login
spring.datasource.url=jdbc:mysql://localhost:3306/login_react_spring
spring.datasource.username=USUARIOPROPIO
spring.datasource.password=CONTRASENIAPROPIA
spring.jpa.hibernate.ddl-auto=update
````

### Verificar que se hallan instalado las dependencias Maven

### Correr el proyecto


## Endpoints

- Consultar usuarios (método GET):
/api/v1/usuarios

- Registar nuevo usuario (método POST):
/api/v1/usuarios

Enviar en el body de la petición:
````JSON
{
  "username": "USERNAME DE EJEMPLO",
  "name": "NAME DE EJEMPLO",
  "password": "CONTRASEÑA DE EJEMPLO"
}
````

- Actualizar usuario (método POST): Esto podemos realizarlo con el mismo método de registrar usuarios, ya que Spring permite  enviando el id del usuario cambiar los demás atributos
/api/v1/usuarios

Enviar en el body:
````JSON
{
  "id": 7,
  "username": "USERNAME DE EJEMPLO",
  "name": "NAME DE EJEMPLO",
  "password": "CONTRASEÑA DE EJEMPLO"
}
````

**NOTA**: Tener en cuenta que el id debe ser de un usuario creado en la base de datos.


- Eliminar usuario(método DELETE):
/api/v1/usuarios/7

**NOTA**: El 7 es un ejemplo de id del usuario, debe usarse uno disponible en la base de datos

- Encontrar usuario por id (método GET)

/api/v1/usuarios/7

**NOTA**: El 7 es un ejemplo de id del usuario, debe usarse uno disponible en la base de datos

- Encontrar usuario por username (método GET)
/api/v1/usuarios/query?username=USERNAME

**NOTA**: En username se indica el nombre del usuario


**GOOD LUCK**