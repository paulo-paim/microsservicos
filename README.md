# microsservicos
Projeto de API utilizando RabbitMQ e microsserviços.

A API cadastro realiza a inserção de dados na fila do cloadAMQP.
Assim que é feito um insert nesta fila, o serviço de bancoDeDadosCadastro recebe a notificação que existe um objeto postado e realiza a inserção de dados no banco de dados local.

Este projeto foi desenvolvido para aprendizagem do modelo de criação de microsserviços e uso de filas, focado em RabbitMQ.