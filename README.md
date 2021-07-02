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
                      "descricao": "Virada Paulista",
                      "quantidade": 1
                  },
                  {
                      "preco": 16.50,
                      "descricao": "Bolo de Chocolate",
                      "quantidade": 1
                  }
              ]
          },
          {
              "pratos": [
                  {
                      "preco": 32.99,
                      "descricao": "Pizza",
                      "quantidade": 1
                  },
                  {
                      "preco": 16.50,
                      "descricao": "Torta",
                      "quantidade": 1
                  }
              ]
          }
      ]
    }
    ````
  - retorna o path onde foi criado o registro
  
  
- GET ````` /aula2/tt/mesa `````
    - retorna todas as mesas registradas
    - body response:
    ````
    [
      {
          "pedidos": [
              {
                  "pratos": [
                      {
                          "preco": 20.5,
                          "descricao": "Virada Paulista",
                          "quantidade": 1
                      },
                      {
                          "preco": 16.5,
                          "descricao": "Bolo de Chocolate",
                          "quantidade": 1
                      }
                  ],
                  "total": 37.0
              },
              {
                  "pratos": [
                      {
                          "preco": 32.99,
                          "descricao": "Pizza",
                          "quantidade": 1
                      },
                      {
                          "preco": 16.5,
                          "descricao": "Torta",
                          "quantidade": 1
                      }
                  ],
                  "total": 49.49
              }
          ],
          "valorTotal": 86.49000000000001
      },
      {
          "pedidos": [
              {
                  "pratos": [
                      {
                          "preco": 20.5,
                          "descricao": "Virada Paulista",
                          "quantidade": 1
                      },
                      {
                          "preco": 16.5,
                          "descricao": "Bolo de Chocolate",
                          "quantidade": 1
                      }
                  ],
                  "total": 37.0
              },
              {
                  "pratos": [
                      {
                          "preco": 32.99,
                          "descricao": "Pizza",
                          "quantidade": 1
                      },
                      {
                          "preco": 16.5,
                          "descricao": "Torta",
                          "quantidade": 1
                      }
                  ],
                  "total": 49.49
              }
          ],
          "valorTotal": 86.49000000000001
      }
    ]
    ````
    

- GET ```` /aula2/tt/mesa/{id} ````
    - retorna todos os pedidos da mesa juntamente com o valor total
    - body response:
    ````
    {
        "pedidos": [
            {
                "pratos": [
                    {
                        "preco": 20.5,
                        "descricao": "Virada Paulista",
                        "quantidade": 1
                    },
                    {
                        "preco": 16.5,
                        "descricao": "Bolo de Chocolate",
                        "quantidade": 1
                    }
                ],
                "total": 37.0
            },
            {
                "pratos": [
                    {
                        "preco": 32.99,
                        "descricao": "Pizza",
                        "quantidade": 1
                    },
                    {
                        "preco": 16.5,
                        "descricao": "Torta",
                        "quantidade": 1
                    }
                ],
                "total": 49.49
            }
        ],
        "valorTotal": 86.49000000000001
    }
    ````
    

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
    - body response:
    `````
    {
      "saldo": 82.50
    }
    `````