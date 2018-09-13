<h1>Mociba</h1>

<h2>Módulo sobre ciberacoso. Resultados 2015</h2>
<p>Esta aplicación web le permite visualizar los resultados del módulo levantado por el INEGI en el 2015, como
 resultado del estudio de las repercusiones sociales producto del ciberacoso en el país. Cada una de las gráficas que se presentan se seleccionaron con lo que se considera una mejor representación de
 cada aspecto encuestado, como por ejemplo la gráfica de dona o la de pie nos permiten entender con mayor precisión
 el resultado de aquellos que como total de porcentaje es igual al 100%. También nos encontraremos con gráficas de barras, de radio y de radar.</p>
 <p>La aplicación fué desarrollada con un diseño responsivo, adaptándose a los 3 tamaños más comunes de dispositivos 
 (celular, tablet, computadora) que puedan visualizar esta app desde un navegador.</p>
<hr>
<h3>Rquisitos de instalación y ejecución.</h3>
<li> <b>Back-end: </b>
Se recomienda instalar una IDE como Netbeans, Eclipse, IntelliJ u otro de su comodidad.
No es un requisito esencial pero si se consideran una buena opción debido a que nos brindan herramientas que nos facilitan
la administración de dependencias.

Una vez instalado el IDE, seleccionaremos la opción de <em>File/Open Proyect from File System</em>, posteriormente seleccionamos la carpeta <em>Demo</em>.

<ul><b>Herramientas:</b> Para su creación se construyeron RESTfull services con Spring y se usó Java. Para más info: <a href="https://spring.io/guides/gs/rest-service/">Spring.io</a></ul>

<li><b>Front-end:</b>
Al igual que para el back-end, se recomienda instalar un editor de texto / IDE que nos facilite las herramientas necesarias para crear un proyecto en Angular.
Este podría ser Visual Studio Code o Sublime Text. 

Ya que se ha instalado el editor/IDE nos dirigiremos a <em>File/Open folder</em> y vamos a seleccionar la carpeta <em>si</em>. Dentro se encuentran todos los archivos correspondientes al proyecto.

<ul><b>Herramientas:</b> Se usó HTML5, Angular 4, Bootstrap, Typescript y para los gráficos la librería de NG2-Charts.</ul>
<hr>
<h3> Otras herramientas </h3>

<b>Ngrok</b> es una herramienta que permite acceder nuestro servidor local a cualquier persona en internet con la que compartamos una url generada dinamicamente.
Esto fué de mucha utiliad ya que de esta forma podíamos obtener los datos enviados al servidor y así manipularlos para su visualización.

NGROK nos permite realizar esto  sin hacer ninguna configuración extra en el router o firewall simplemente basta con bajar la pequeña aplicación y ejecutar el siguiente comando : 
<code>ngrok http 8080</code>, una vez realizado esto, se debe copiar la url generada, pegarla en el <em>proxy</em> del proyecto de Angular, detener el proyecto e iniciarlo nuevamente, esto para actualizar la url.

<hr><h3>Acerca del proyecto</h3>
<p>
<b>Autor:</b> Vega Castro Jesús Samuel. <b>Correo electrónico: </b>jesaveca@gmail.com <b>Tel:</b> 272 189 64 89. </p>
<p>Esta aplicación se encuentra bajo derechos de autor. Las herramientas empleadas se utilizaron sin fines de lucro.</p>
