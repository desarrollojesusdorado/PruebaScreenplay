# Author: jdoradoc@choucairtesting.com
# language:es
@tag
Característica: Dejanos llamarte bancolombia
  Como usuario
  quiero ingresar ala pagina de GrupoBancolombia
  A realizar el llenado del formulario dejanos llamarte

  @tag1
  Escenario: Opcion dejanos llamarte pagina Bancolombia
    Dado que jesus quiere usar la pagin bancolombia
    Cuando el diligencia el formulario de dejanos llamarte
    |nombre|tipoDocumento|numeroDocumento|correo|pais|ciudad|numeroTelefono|asunto|tiempoParaContacto|
		|Jesus Dorado|Cédula de Ciudadanía|1007738662|ddddd@gmail.com|Colombia|Medellin|12121212|ninguno|De 30 a 45 minutos|
    Entonces el deberia ver el mensaje Autorizo de manera voluntaria, previa, expresa e informada a BANCOLOMBIA S.A para la recolección y posterior análisis de los datos aquí suministrados, con la finalidad de ser contactado y atender mis necesidades financieras. Así mismo, declaro que he sido informado sobre el derecho que tengo a conocer, actualizar y rectificar mis datos personales, solicitar prueba de la autorización, ser informado sobre el tratamiento que se ha dado a mis datos personales, presentar quejas ante la Superintendencia de Industria y Comercio (SIC), revocar la autorización otorgada y/o solicitar la supresión de mis datos en los casos en que sea procedente, conoce más sobre esta política dando click aquí


