# 💻 Banco Digital em Java — Simulação de Sistema Bancário com POO

Este projeto é uma aplicação Java que simula o funcionamento de um banco digital. Desenvolvido com foco em **Programação Orientada a Objetos (POO)**, o sistema permite o cadastro de clientes, abertura de contas (corrente e poupança), depósitos, saques, transferências, aplicação de juros e saque com limite.

---

## 🚀 Tecnologias utilizadas

- Java 17 (ou superior)
- Paradigma Orientado a Objetos
- Terminal/CLI
- Coleções (`ArrayList`)

---

## 📦 Funcionalidades do Sistema

O sistema permite:

- ✅ Criar clientes com dados como nome, endereço, telefone e email
- ✅ Criar contas bancárias (corrente e poupança)
- ✅ Depositar e sacar valores de contas
- ✅ Realizar transferências entre contas
- ✅ Aplicar juros à conta poupança
- ✅ Realizar saques com uso de limite (conta corrente)
- ✅ Vincular múltiplas contas a um cliente
- ✅ Listar contas e clientes cadastrados

---

## 📌 Exemplo de Uso

```java
ClienteInterface cliente1 = new Cliente("Zelda", "Hyrule", "12345678", "zelda@gmail.com");
ContaCorrenteInterface contaCorrente = new ContaCorrente(1, 1000, 500);
ContaPoupancaInterface contaPoupanca = new ContaPoupanca(2, 1500, 0.05);

banco.adicionarCliente(cliente1);
banco.criarConta(contaCorrente);
banco.criarConta(contaPoupanca);

cliente1.adicionarConta(contaCorrente);
cliente1.adicionarConta(contaPoupanca);
```

## 🧾 Operações Realizadas

  - Depósito: `contaCorrente.depositar(1800);`

  - Saque: contaPoupanca.sacar(100);

  - Transferência: `contaCorrente.transferir(contaPoupanca, 300);`

  - Aplicação de juros: `contaPoupanca.calcularJuros();`

  - Saque com limite: `contaCorrente.sacarComLimite(1600);`

## 🔐 Tratamento de Erros

  - `IllegalArgumentException`: usado para validar situações como saldo insuficiente ou operação inválida.

  - Não há exceções checadas, focando em simplicidade e entendimento da lógica de negócio.

## 🗂️ Estrutura de Pastas
```css
src/
└── main/
    └── java/
        ├── Main.java
        ├── Banco.java
        ├── BancoInterface.java
        ├── Cliente.java
        ├── ClienteInterface.java
        ├── Conta.java
        ├── ContaInterface.java
        ├── ContaCorrente.java
        ├── ContaCorrenteInterface.java
        ├── ContaPoupanca.java
        └── ContaPoupancaInterface.java
```

## ⚙️ Execução Local

1. Clone o repositório:

```bash
git clone https://github.com/higorv10/dio-banco-digital.git
cd dio-banco-digital
```

2. Após clonar o repositório, localize o arquivo `Main.java` no seu diretório local:

```css
[CAMINHO_DO_REPOSITÓRIO]\BancoDigital\src\Main.java
```

3. Se estiver usando o terminal (Prompt de Comando ou Bash):

- Compile os arquivos Java:

```bash
javac *.java
```

- Execute o programa:

```bash
java Main
```

4. 💡 Se estiver usando o Visual Studio Code:

  - Abra a pasta src no VS Code

  - Clique com o botão direito no arquivo Main.java e selecione "Run Java"

  - O resultado aparecerá no terminal embutido do VS Code

## 📸 Exemplo de Saída no Terminal
```yaml
Saldo inical da Conta Corrente: 1000.0
Saldo inicial da Conta Poupanca: 1500.0
Saldo após deposito na Conta Corrente: 2800.0
Saldo após saque na Conta Poupanca: 1600.0
Saldo após transferência da Conta Corrente: 2500.0
Saldo após transferência da Conta Poupanca: 1900.0
Saldo após cálculo de juros na Conta Poupanca: 1995.0
Saldo após saque com limite na Conta Corrente: 900.0
```

## 📄 Licença
Projeto desenvolvido para fins educacionais na DIO. Sem licença comercial.
