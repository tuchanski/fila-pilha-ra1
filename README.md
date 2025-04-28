# Sistema de Gerenciamento de Atendimento ao Cliente

## 📋 Descrição

Este projeto simula um **sistema de gerenciamento de atendimento ao cliente** em Java, utilizando **lista encadeada** para implementar:

- **Pilha** → Histórico de Solicitações
- **Fila** → Ordem de Atendimento de Clientes

O objetivo foi seguir regras rígidas, sem utilizar arrays, listas prontas ou estruturas automatizadas, apenas manipulando nós manualmente.

---

## 🛠️ Estrutura do Código

- **Elemento.java**  
  Representa tanto uma solicitação quanto um cliente. Contém:

  - `id` (Identificação)
  - `descricao` (Descrição da solicitação)
  - `dataHora` (Data e Hora da solicitação)
  - `nomeCliente` (Nome do cliente)
  - `motivo` (Motivo do atendimento)

- **Node.java**  
  Representa um nó da lista encadeada, contendo:

  - Um objeto `Elemento`
  - Um ponteiro `proximo` para o próximo nó.

- **Pilha.java**  
  Implementa a pilha de histórico:

  - Método `push()` → Adiciona uma solicitação no topo.
  - Método `pop()` → Remove a solicitação do topo.
  - Método `isEmpty()` → Verifica se a pilha está vazia.
  - Método `mostrarHistorico()` → Mostra o histórico.

- **Fila.java**  
  Implementa a fila de atendimento:

  - Método `enfileirar()` → Adiciona um cliente no final da fila.
  - Método `desenfileirar()` → Atende (remove) o cliente da frente.
  - Método `isEmpty()` → Verifica se a fila está vazia.
  - Método `mostrarFila()` → Mostra todos os clientes na fila.

- **Main.java**  
  Interface de interação no console:
  - Menu para o usuário escolher entre cadastrar, listar e atender clientes/solicitações.

---

## 🎮 Como Rodar

1. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
2. Execute o programa:
   ```bash
   java Main
   ```

---

## 👨‍💻 Integrantes

- Guilherme Tuchanski Rocha
- Luiz Henrique Matoso

---

## ✅ Regras Seguidas

- ❌ Não usamos arrays, listas prontas ou coleções.
- ❌ Não usamos StringBuilder, ArrayList, LinkedList, etc.
- ✅ Usamos apenas `String`, `int`, `float`, `try-catch`, `throws`, e manipulação manual de nós.
- ✅ `length` foi utilizado apenas para Strings.
- ✅ Implementação 100% manual das estruturas de dados.
