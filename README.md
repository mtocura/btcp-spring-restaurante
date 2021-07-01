# Aula 2 - Estender métodos web e JSON - TT

## Prática complementar - Exercício 1 - Restaurante

Este repositório contém a resolução do exercício 1 da prática complementar da aula 2 TT de Spring.

- POST ```` /aula2/tt/mesa ````
    - Cria uma mesa
    - body request
    ````
    {
        "pedidos": [
            {
                "pratos": [
                    {
                        "preco": 20.50,
                        "descricao": "Teste",
                        "quantidade": 1
                    },
                    {
                        "preco": 20.50,
                        "descricao": "Teste 2",
                        "quantidade": 3
                    }
                ]
            }
        ]
    }
    ````
  
  
- GET ````` /aula2/tt/mesa `````
    - retorna todas as mesas registradas
    

- GET ```` /aula2/tt/mesa/{id} ````
    - retorna todos os pedidos da mesa juntamente com o valor total
    

- GET ```` /aula2/tt/mesa/{id}/checkout ````
    - fecha a conta da mesa
    - limpa os pedidos da mesa
    - adiciona o valor total no saldo do caixa
    - retorna o valor total da mesa
    ````
    {
        "pedidos": [],
        "valorConsumido": 82.0
    }
    ````
  
- GET ````/aula2/tt/caixa ````
    - retorna o saldo do caixa