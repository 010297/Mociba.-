<h1>Mociba</h1>

<h2>Módulo sobre ciberacoso. Resultados 2015.</h2>

<h3>Acerca de la aplicación.</h3>
<p>Esta aplicación web nos informa un poco acerca de MOCIBA, su origen y nos menciona el concepto de Ciberacoso, pero su principal finalidad es 
que nos permite visualizar de manera gráfica los resultados del módulo levantado por la INEGI en 2015 sobre el ciberacoso.</p>
<p>Las gráficas presentadas se seleccionaron de acuerdo a lo que se consideró que sería mejor para representar cierto aspecto, por ejemplo aquellas
que el total de la muestra generaba un 100% entonces la gráfica de Dona o la de Pie fueron las ideales, se presentan también gráficas de radio,
de barras y de radar..</p>
<p>La aplicación se construyó con un diseño responsivo, adaptándose así a cualquier dispositivo móvil, tableta o computadora que 
desde el navegador pueda abrirla, y teniendo una estructura visual diferente para cada tipo de dispositivo.</p>


<h3>Requisitos para su instalación y ejecución.</h3>

<li><b>Back-end:</b></li>
<p>Se requiere que se instale un IDE como Eclipse, NetBeans o IntelliJ, no es algo escencial pero son herramientas que nos facilitarán
la administración de dependencias. Igualmente se requiere que se instale o se verifique que se tenga instalado el JDK.</p>
<p>Ya que se ha instalado el IDE, procederemos a ejecutarlo y una vez dentro seleccionaremos <em>File/Open Project from File System</em>
y seleccionaremos la carpeta demo con la ruta: <em>demo/target/classes/com/prueba/project/demo</em>, corremos el archivo <code>DemoApplication.java</code> y listo.</p>
<ul><h4>Realizada con:</h4> Se construyó un RESTfull service, con Spring Boot y se utilizó Java. </ul>

<li><b>Front-end</b></li>
<p>Se requiere que se instale un editor de texto/IDE tal como Visual Studio Code, Sublime Text, Brackets, entre otros de igual forma
para aprovechar los recursos que nos brindan para la administración correcta de los lenguajes a utilizar.</p>
<p>Una vez instalado, se procede a exportar la carpeta <em>si</em> donde se encuentra todos los archivos, para esto en la terminal se ingresa
el comando <code>npm start</code></p> para arrancar el proyecto.
<ul><h4>Realizada con:</h4> HTML5, CSS, Angular 4, Typescrip, Bootsrap y para las gráficas se utilizó la librería de NG2-Charts.</ul>

<h3>Otras herramientas utilizadas</h3>
<p>Ngrok es una herramienta que permite acceder nuestro servidor local a cualquier persona en internet con la que compartamos una url generada dinamicamente.
Esta es muy útil ya que de esta manera se genera una url en la que llegan los servicios enviados por el proyecto del back-end y desde el proyecto  
del front-end se reciben y se manipulan para su respectiva representación.</p>
<p>Se debe bajar el archivo Ngrok el cuál al ejecutarse nos mostrará una consola, en la que ingresaremos el comando <code>ngrok http 8080</code>, 
de esta manera generará una url, esta la debemos copiar y pegar en el archivo <em>proxy.config.json</em>, debemos terminar los procesos del proyecto
y posteriormente levantarlo de nuevo, esto para que actualice correctamente la url ingresada, de lo contrario no tendremos una conexión.

<h3>Acerca del proyecto</h3>
<p><b>Autor:</b> Vega Castro Jesús Samuel. |<b> Correo electrónico:</b> jesaveca@gmail.com | <b>Tel: </b>272 189 64 89</p>
<p>Esta aplicación tiene todos los derechos reservados. Las herramientas y tecnologías empleadas se utilizaron sin fines lucrativos.</p>
