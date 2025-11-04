# 📘 Apêndice Técnico — EasyLanguage

## 📚 Documentação Técnica e Gramática Formal (EBNF)

Versão Final | Compilador EasyLanguage

---

## 📋 Índice

1. [Introdução Técnica](#-introdução-técnica)
2. [Léxico e Tokens](#-léxico-e-tokens)
3. [Gramática Formal (EBNF)](#%EF%B8%8F-gramática-formal-ebnf)
4. [Regras Semânticas](#-regras-semânticas)
5. [Estrutura de Compilação (ANTLR)](#%EF%B8%8F-estrutura-de-compilação-antlr)
6. [Exemplos de Programas `.easy`](#-exemplos-de-programas-easy)
7. [Notas para Desenvolvedores](#-notas-para-desenvolvedores)
8. [Referências e Créditos Técnicos](#-referências-e-créditos-técnicos)

---

## 🔍 Introdução Técnica

A **EasyLanguage** é uma linguagem educacional de propósito didático desenvolvida para auxiliar no aprendizado de **conceitos de compiladores e linguagens formais**. Este apêndice descreve sua **definição formal**, incluindo léxico, gramática (EBNF) e semântica.

A linguagem é analisada por meio de **ANTLR**, que gera o analisador léxico e sintático, e implementa ações semânticas em **Java**, criando a árvore sintática abstrata (AST) e verificando a coerência dos programas.

---

## 🧩 Léxico e Tokens

### Identificadores e Literais

| Categoria            | Expressão Regular     | Exemplo                        |
| -------------------- | --------------------- | ------------------------------ |
| **ID**               | `[a-z]([a-zA-Z0-9])*` | `nome`, `idade1`, `mediaAluno` |
| **INTEGER**          | `[0-9]+`              | `42`, `0`, `1234`              |
| **NUMBER / DECIMAL** | `[0-9]+\.[0-9]+`      | `3.14`, `10.0`                 |
| **STRING**           | `\".*?\"`             | `"Olá mundo"`                  |
| **CHAR**             | `'.'`                 | `'A'`, `'b'`                   |

### Palavras-Reservadas

```
programa, fimprog, funcao, retorne, se, entao, senao,
para, de, passo, faca, enquanto, vetor,
inteiro, decimal, booleano, texto, caractere, vazio,
verdadeiro, falso, leia, escreva, e, ou, nao
```

### Operadores e Símbolos

| Tipo              | Símbolos                                    |
| ----------------- | ------------------------------------------- |
| **Aritméticos**   | `+`, `-`, `*`, `/`                          |
| **Relacionais**   | `>=`, `<=`, `==`, `!=`, `>`, `<`            |
| **Lógicos**       | `e`, `ou`, `nao`                            |
| **Delimitadores** | `(`, `)`, `{`, `}`, `[`, `]`, `;`, `,`, `=` |

---

## ⚙️ Gramática Formal (EBNF)

A gramática EasyLanguage define a estrutura sintática de programas válidos. Abaixo está uma versão **formal e legível em EBNF**, baseada na gramática ANTLR `EasyLanguage.g4`.

```ebnf
prog         ::= { cmdfuncao } 'programa' bloco 'fimprog;'

bloco        ::= '{' { decl | cmd } '}'

decl         ::= tipo idList ';'
idList       ::= ID { ',' ID }

tipo         ::= 'decimal' | 'texto' | 'booleano' | 'inteiro' | 'caractere' | 'vazio'

cmd          ::= cmdleitura
               | cmdescrita
               | cmdattribarrayitem
               | cmdattrib
               | cmdselecao
               | cmdwhile
               | cmdfor
               | cmdarray
               | cmdChamadaFuncao

cmdleitura   ::= 'leia' '(' ID ')' ';'
cmdescrita   ::= 'escreva' '(' expr ')' ';'
cmdattrib    ::= ID '=' expr ';'
cmdattribarrayitem ::= ID '[' expr ']' '=' expr ';'

cmdselecao   ::= 'se' '(' comp ')' '{' { cmd } '}' [ 'senao' '{' { cmd } '}' ]
cmdfor       ::= 'para' '(' ID 'de' expr OPREL expr [ 'passo' expr ] ')' 'faca' '{' { cmd } '}'
cmdwhile     ::= 'enquanto' '(' comp ')' '{' { cmd } '}'
cmdarray     ::= 'vetor' tipo ID '[' [ INTEGER ] ']' ';'

cmdfuncao    ::= 'funcao' tipo ID '(' [ listaParametros ] ')' '{' { decl | cmd } [ retorno ] '}'
listaParametros ::= parametro { ',' parametro }
parametro    ::= tipo ID
retorno      ::= 'retorne' expr ';'

cmdChamadaFuncao ::= ID '(' [ listaArgumentos ] ')' ';'
listaArgumentos ::= expr { ',' expr }

comp         ::= condicao { ( 'e' | 'ou' ) condicao }
condicao     ::= termo OPREL termo | 'nao' condicao
expr         ::= termo { ( '+' | '-' ) termo }
termo        ::= fator { ( '*' | '/' ) fator }
fator        ::= NUMBER | INTEGER | STRING | CHAR | ID | funcCall | '(' expr ')'
funcCall     ::= ID '(' [ listaArgumentos ] ')'
```

---

## 🧠 Regras Semânticas

* **Declarações**: Variáveis devem ser declaradas antes do uso e são fortemente tipadas.
* **Escopo**: Cada função cria um novo escopo; variáveis locais não colidem com as globais.
* **Atribuição**: O tipo da expressão deve ser compatível com o tipo da variável.
* **Vetores**: Declaração com `vetor tipo nome[tamanho];`.
* **Funções**: Definidas com `funcao tipo nome(...) { ... }`. O tipo `vazio` indica ausência de retorno.
* **Entrada/Saída**: `leia(var);` lê valores e `escreva(expr);` exibe resultados.
* **Lógica Booleana**: `e`, `ou`, `nao` → equivalentes a `&&`, `||`, `!` em Java.

---

## 🏗️ Estrutura de Compilação (ANTLR)

O compilador **EasyLanguage** utiliza o **ANTLR (Another Tool for Language Recognition)** para gerar automaticamente os analisadores léxico e sintático.

**Arquitetura principal:**

```
EasyLanguage.g4 → Parser/Lexer (ANTLR)
               → AST (Java)
               → Verificador Semântico
               → Gerador de Código
```

### Diretórios Importantes

* `src/br/edu/cefsa/compiler/parser/` → gramática ANTLR.
* `src/br/edu/cefsa/compiler/abstractsyntaxtree/` → nós da AST (ex: `CommandIf`, `CommandWhile`).
* `src/br/edu/cefsa/compiler/datastructures/` → tabela de símbolos e classes auxiliares.

---

## 💻 Exemplos de Programas `.easy`

### 1️⃣ Olá Mundo

```easylanguage
programa {
    texto nome;
    escreva("Digite seu nome:");
    leia(nome);
    escreva("Olá, " + nome);
}
fimprog;
```

### 2️⃣ Estruturas Condicionais

```easylanguage
programa {
    inteiro x;
    x = 7;
    se (x > 5) {
        escreva("x é maior que 5");
    } senao {
        escreva("x não é maior que 5");
    }
}
fimprog;
```

### 3️⃣ Estrutura de Repetição (Enquanto)

```easylanguage
programa {
    inteiro contador;
    contador = 0;

    enquanto (contador < 5) {
        escreva("Contagem: " + contador);
        contador = contador + 1;
    }
}
fimprog;
```

### 4️⃣ Laços e Vetores

```easylanguage
programa {
    vetor inteiro v[5];
    inteiro i;
    para (i de 0 <= 4 passo 1) faca {
        v[i] = i * 2;
    }
    para (i de 0 <= 4 passo 1) faca {
        escreva(v[i]);
    }
}
fimprog;
```

### 5️⃣ Função com Retorno

```easylanguage
programa {
    funcao inteiro soma(inteiro a, inteiro b) {
        inteiro resultado;
        resultado = a + b;
        retorne resultado;
    }

    inteiro x;
    x = soma(3, 4);
    escreva(x);
}
fimprog;
```

### 6️⃣ Função Sem Retorno (Tipo Vazio)

```easylanguage
programa {
    funcao vazio cumprimentar(texto nome) {
        escreva("Olá, " + nome + "! Seja bem-vindo.");
    }

    texto nome;
    escreva("Digite seu nome:");
    leia(nome);
    cumprimentar(nome);
}
fimprog;
```

### 7️⃣ Operações com Decimais

```easylanguage
programa {
    decimal preco, desconto, precoFinal;

    preco = 100.0;
    desconto = 0.15;
    precoFinal = preco - (preco * desconto);

    escreva("Preço final: R$" + precoFinal);
}
fimprog;
```

---

## 🧩 Notas para Desenvolvedores

* O compilador lança exceções semânticas (`SemanticException`) para erros de tipo ou declaração.
* Extensões devem atualizar a gramática, a AST e o gerador de código.
* O projeto é modular e permite adicionar novos tipos ou operadores facilmente.

---

## 📚 Referências e Créditos Técnicos

* **ANTLR 4.13.1** — [https://www.antlr.org](https://www.antlr.org)
* **Base acadêmica:** *Compiladores — Aho, Sethi, Ullman, Lam*
* **Instituição:** *Faculdade Engenheiro Salvador Arena*
* **Disciplina:** Compiladores (2º Semestre / 2025)

---

> © 2025 — EasyLanguage Project
