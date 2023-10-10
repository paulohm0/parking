## Estacionamento

Você deseja gerenciar o acesso de veículos a um estacionamento de pagamento. 
O estacionamento não é realizado de forma automatizada, pois existe um funcionário 
encargado para registrar as entradas e saídas de veículos.

Os veículos são identificados pelo número da placa e o modelo. Quando um veículo 
entra no estacionamento, o funcionário registra sua entrada e ao sair registra sua saída e, 
em alguns casos, cobra a importação correspondente ao tempo de estacionamento.

# A importação cobrada depende do tipo de veículo:

- Os veículos oficiais não pagam, mas registram suas estâncias para ter  no controle.
  (Uma estância consiste em uma hora de entrada e uma hora de saída)
- Os residentes pagam no final do mês a uma razão de R$ 0,05 por minuto.
  O aplicativo irá acumular o tempo (em minutos) que ficou estacionado.
- Os não residentes pagam à saída do estacionamento a uma razão de R$ 0,50 por minuto.
  Se você já viu que no futuro poderá incluir novos tipos de veículos,
  por isso o aplicativo desenvolvido deverá ser facilmente extensível nesse aspecto.

# Caso de uso "Registrar entrada

1. O funcionário seleciona a opção "registrar entrada" e introduz o número da placa e o modelo do carro que entra.
2. A aplicação indica a hora de entrada do veículo.

# Caso de uso "Registrar saída

1. O funcionário seleciona a opção "registrar saída" e introduz o número da placa do carro que está saindo.
2. A aplicação realiza as ações correspondentes ao tipo de veículo:
    - Oficial: associação da estância (hora de entrada e hora de saída) com o veículo.
    - Residente: soma a duração da residência ao tempo total acumulado.
    - Não residente: obtenha a valor total a pagar
