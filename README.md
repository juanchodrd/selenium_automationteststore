# Selenium Automation Test Store

Este proyecto contiene pruebas automatizadas para el sitio web [Automation Test Store](https://automationteststore.com/)
utilizando Selenium + Java + Cucumber.

## Pasos para Configurar y Ejecutar el Proyecto

1. Clonar el repositorio
   ```bash
   git clone https://github.com/juanchodrd/selenium_automationteststore.git
   cd selenium_automationteststore
   ```
2. Instalar dependencias
   ```bash
   mvn clean install
   ```
3. Configurar el archivo `config.properties`: Crea un archivo `config.properties` en la raíz del proyecto con las
   configuraciones explicadas abajo.
4. Ejecutar las pruebas: Para ejecutar todas las pruebas, usa:
   ```bash
   mvn test
   ```
   Si deseas ejecutar un test específico, puedes usar el siguiente comando, reemplazando `NombreDelTest` con el nombre
   de la clase de prueba:
   ```bash
   mvn -Dtest=NombreDelTest test
   ```

## Configuración del Archivo `config.properties`

Asegúrate de crear un archivo `config.properties` en la raíz del proyecto con el siguiente formato:

```properties
browser=chrome
url=https://automationteststore.com/
visibleBrowser=""
username=<tu_usuario>
password=<tu_contraseña>
```

## Verificar que el archivo está excluido

1. Abre el archivo `.gitignore` y confirma que contiene lo siguiente para asegurarte de que el archivo
   `config.properties` no se suba al repositorio:
   ```
   /config.properties
   ```

2. Si ya has subido previamente `config.properties` al repositorio, elimínalo del índice de Git con el siguiente
   comando:
   ```bash
   git rm --cached config.properties
   ```

3. Realiza un commit para reflejar estos cambios:
   ```bash
   git commit -m "Excluyendo config.properties del repositorio"
   ```

## Errores comunes

1. **Error: Archivo no encontrado**  
   Si el archivo `config.properties` no se encuentra en la raíz del proyecto, asegúrate de crearlo y configurarlo
   correctamente según el ejemplo anterior.

2. **Error: Propiedad no especificada**  
   Si falta alguna de las propiedades necesarias (como `username` o `url`), revisa que todas las claves necesarias estén
   presentes en el archivo `config.properties`.

## Recursos adicionales

- [Documentación oficial de Selenium](https://www.selenium.dev/documentation/)
- [Documentación de Maven](https://maven.apache.org/guides/index.html)