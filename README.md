1. Execute a instrução abaixo para subir o container RabbitMQ:
<pre> docker-compose up -d rabbitmq </pre>
2. Execute a instrução abaixo para subir o container que ler arquivos e posta em filas RabbitMQ
<pre>docker-compose up --build -force-recreate leitor-arquivos</pre>
3. Qualquer arquivo colocado na pasta files será postado na fila especificada no arquivo docker-compose.yml.
