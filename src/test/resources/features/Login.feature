# language: pt
# charset: UTF-8

  Funcionalidade: Efetuar o login
    Eu como usuario
    Quero acessar a plataforma Swag Labs
    Efetuando o login com sucesso

  @wip
  Cenario: Validar login com credenciais validas
    Dado que o usuario acesse a plataforma
    Quando informar as credenciais validas
    Então visualizaria a home da plataforma
    E efetura o logout com sucesso
