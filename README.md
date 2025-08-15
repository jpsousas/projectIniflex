# 📊 Sistema de Gestão de Funcionários - Iniflex

![Java](https://img.shields.io/badge/Java-11+-blue?logo=java&style=flat)
![License](https://img.shields.io/badge/License-MIT-green?style=flat)

## 📂 Estrutura do Projeto

```text
projectIniflex/
└──lib
└──bin
└──.vscode
└── src/
    └── br/
        └── com/
            └── exemplo/
                └── funcionarios/
                    ├── Pessoa.java
                    ├── Funcionario.java
                    └── Principal.java
└──README.md
```

## ⚙️ Pré-requisitos

- Java JDK 17 ou superior (utilizada a versão 24 nesse teste)
- Terminal/Command Prompt

## 🚀 Como Executar

### No Linux/Mac:

1. Navegue até a pasta raiz do projeto:
cd caminho/para/projectIniflex
2. Compile o projeto:
javac -d ./build ./src/br/com/exemplo/funcionarios/*.java

3. Execute o programa:
java -cp ./build br.com.exemplo.funcionarios.Principal

### No Windows:

1. Abra o Command Prompt na pasta raiz do projeto:
cd caminho\para\projectIniflex
2. Compile o projeto:
javac -d .\build .\src\br\com\exemplo\funcionarios\*.java

3. Execute o programa:
java -cp .\build br.com.exemplo.funcionarios.Principal

## 🛠️ Scripts Úteis (Windows)

Crie estes arquivos .bat para facilitar:

### compilar.bat
@echo off
javac -d .\build .\src\br\com\exemplo\funcionarios\*.java
pause

### executar.bat
@echo off
java -cp .\build br.com.exemplo.funcionarios.Principal
pause

## 📋 Funcionalidades Implementadas

1. Cadastro de funcionários
2. Remoção de funcionários
3. Aumento salarial de 10%
4. Relatórios:
   - Listagem completa
   - Agrupamento por função
   - Aniversariantes por mês
   - Funcionário mais velho
   - Ordenação alfabética
   - Cálculo de salários mínimos

## 🔧 Solução de Problemas

- "classe não encontrada": Verifique:
  - Se a estrutura de pastas está correta
  - Se os arquivos têm package br.com.exemplo.funcionarios;
  - Se está executando na pasta raiz

- Erros de compilação: Verifique:
  - JDK instalado (javac -version)
  - Sintaxe correta nos arquivos Java
