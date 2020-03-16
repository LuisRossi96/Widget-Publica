# Widget Pública

## API Rest


Para testar a API Rest privada, acesse este endpoint:

```
- FLUIG_URL/widget_publica/api/rest/service/helloWorld
```

Agora para testar a API Rest Pública, acesse o seguinte endpoint:

```
- FLUIG_URL/widget_publica/api/rest/service/layouts/{tenantId}
```

Para mais detalhes acesse essa [documentação](https://tdn.totvs.com/pages/releaseview.action?pageId=258277714).

> **_NOTA 1:_**  Toda a configuração de autenticação desse serviço Rest's está no arquivo web.xml.

>**_NOTA 2_**: A concatenação da URL é feita da seguinte forma:
> -   **'/widget_publica'**: é o código do  _widget_.
>-   **'/api/rest'**: é o @Path da classe  _ApplicationConfig.java;_
>-   **'/service'**: é o @Path da classe  _ServiceRest.java_;
>-   **'/helloWorld'** ou **'/layouts/{tenantId}'**: é o @Path do método da classe  _ServiceRest.java_  que desejamos chamar.

## Fluig OAuth


No desenvolvimento de um  _widget_  para o fluig é possível programar certas ações a serem executadas em tempo de instalação, ativação ou desativação.

Para mais detalhes acesse essa [documentação](https://tdn.totvs.com/display/public/fluig/Eventos+de+Componentes).

Neste projeto também foi utilizado o evento de ativação para criar um usuário OAuth no Fluig, assim podendo utiliza-lo para realizar as integrações em um ambiente público.

Para mais detalhes acesse essa [documentação](https://tdn.totvs.com/pages/releaseview.action?pageId=445656685).


>**_NOTA 1_**: A configuração dos **eventos de componentes** e também a criação do **usuário OAuth** é feita dentro da classe _ActivationClass.java_.
