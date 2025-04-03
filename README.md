# Navegador com Botões de Avançar e Voltar

Este projeto implementa a lógica dos botões de **voltar** e **avançar** de um navegador web, utilizando a linguagem Java e o conceito de **pilhas** (stacks). A implementação simula o comportamento de um navegador conforme especificações definidas para um teste da Mozilla Foundation.

## Descrição do Problema

Ao navegar por páginas web, o usuário pode retornar à página anterior ou avançar para a próxima. Para isso, são utilizadas duas pilhas:
- **Pilha de Voltar:** Guarda as páginas visitadas anteriormente.
- **Pilha de Avançar:** Guarda as páginas que foram deixadas ao usar o botão voltar.

## Funcionalidades

- Visitar uma nova página.
- Voltar para a página anterior.
- Avançar para a próxima página (se possível).
- Limpeza automática das pilhas quando estiverem vazias.
- Simulação via `main()` com saída em terminal.

## Estrutura de Dados

Utiliza:
- `Stack<String>` para gerenciar o histórico de navegação.

## Como Usar

### Requisitos
- Java 8 ou superior

### Compilar

```bash
javac BrowserHistory.java# ATIVIDADE-FABRICIO
