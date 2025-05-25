---
kanban-plugin: board
tags:
  - Kanban
---

## Backlog

- [ ] Iniciar testes unitários (ao menos para os services) #Infra
- [ ] Configurar Spring Security (login para admin e cliente) #Segurança
- [ ] Tela inicial com catálogo de pizzas (estático ou vindo da API) #Cliente
- [ ] Adicionar pizza ao carrinho (via botão) #Cliente
- [ ] Visualização do carrinho #Cliente
- [ ] Remoção de itens do carrinho #Cliente
- [ ] Finalização de pedido #Cliente
- [ ] Tela de acompanhamento do pedido (status) #Cliente
- [ ] Tela de login #Admin
- [ ] Painel de pedidos (listar todos com status atual) #Admin
- [ ] Atualizar status do pedido (em preparo, pronto, entregue, etc.) #Admin
- [ ] Gerenciar pizzas (CRUD) #Admin
- [ ] Conectar front-end com back-end via Thymeleaf #Funcionalidades
- [ ] Aplicar validações com Bean Validation (`@NotNull`, `@Size`, etc.) #Validações
- [ ] Tratar erros com mensagens amigáveis (ex: campos obrigatórios) #Validações
- [ ] Integrar Bootstrap (layout responsivo, grid, navbar etc.) #Funcionalidades
- [ ] Criar templates base com `th:replace` ou `th:fragment` #Funcionalidades
- [ ] Melhorar UX: carregamento, toasts de feedback, loading #Funcionalidades
- [ ] Migrar para MongoDB ou outro se necessário #BancodeDados
- [ ] Popular dados com pizza clássicas (via script ou seeds) #BancodeDados
- [ ] Spring Security: rotas separadas por papel #Segurança
- [ ] CRUD protegido para admin #Segurança
- [ ] Histórico de pedidos para cliente #Cliente
- [ ] Deploy (Heroku, Render, ou local mesmo) #Funcionalidades


## To Do (10)



## In Progress (5)



## Validantion (5)

- [ ] Entidades (`Pizza`, `Pedido`, `Cliente`, `StatusPedido`, etc.) #Infra
- [ ] DTOs com MapStruct #Infra
- [ ] Services e Repositories #Infra
- [ ] Iniciar com H2 para testes #BancodeDados
- [ ] Estrutura de pastas com `templates/admin`, `cliente`, `pedido` #Funcionalidades


## Merging (5)



## Done

**Concluído**



## Kanban Board

> Kanban Board para o projeto Pizzaria Mario's (Para visualização e controle de tarefas utilizando o plugin Kanban do Obsidian)**

%% kanban:settings
```
{"kanban-plugin":"board","list-collapse":[false,false,false,false,false,false],"move-task-metadata":true,"move-dates":true,"move-tags":true,"tag-action":"kanban","tag-sort":[{"tag":"#Minecraft"}],"tag-colors":[{"tagKey":"#Infra","color":"rgba(255, 255, 255, 1)","backgroundColor":"rgba(36, 53, 141, 1)"},{"tagKey":"#Funcionalidades","color":"rgba(255, 255, 255, 1)","backgroundColor":"rgba(76, 0, 255, 1)"},{"tagKey":"#Admin","color":"rgba(255, 170, 0, 1)","backgroundColor":"rgba(0, 0, 0, 1)"},{"tagKey":"#Cliente","color":"rgba(98, 200, 115, 1)","backgroundColor":"rgba(0, 0, 0, 1)"},{"tagKey":"#Validações","color":"rgba(255, 255, 255, 1)","backgroundColor":"rgba(0, 0, 0, 1)"},{"tagKey":"#BancodeDados","color":"rgba(255, 255, 255, 1)","backgroundColor":"rgba(161, 33, 33, 0.69)"},{"tagKey":"#Segurança","color":"rgba(255, 255, 255, 1)","backgroundColor":"rgba(0, 41, 255, 1)"}]}
```
%%