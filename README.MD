# Identifier
Program que análisa `Strings` com padrões bem definidos, levando em conta os seguintes critérios:
- A String deve ter entre 1 a 6 caracteres.
- Aceita String formada apenas por letras e digitos.
- Deve começar obrigatóriamente com letras.
> OBS: Qualquer String fora desse padrão será bloqueada. 

# Classes de equivalência

## Comprimento do indentificador
- **Muito curto:** `Strings` menores que um    caractere, não são permitidas na aplicação  Indentifier.

- **Válido**: `Strings` de tamanho entre 1 a 6 caracteres são permitidos na aplicação  Indentifier.

- **Muito grande:** `Strings`de tamanho de sete caracteres, não são permitidas na aplicação  Indentifier.

## Caractere Inicial
O programa Identifier permite apenas `Strings` que iniciem com letras. Bloqueando frases que comecem tanto com números, quanto com caracteres especiais ou símbolos.  

## Caracteres permitidos
Só são pemetidos letras e números no programa Identifier. Qualquer coisa fora desse padrão será bloqueado.

# Tabela de Testes
| Identificador | Entrada | Resultado Esperado |
| :---: | :---: | :---: |
| **CT01** | a (4) | válida |
| **CT02** | 1abc (5) | inválida |
| **CT03** | abc (4) | válida |
| **CT04** | abcdefg (1) | inválida |
| **CT05** | A1 (4) | válida |
| **CT06** | @home (7) | inválida |
| **CT07** | z9x8 (4) | válida |
| **CT08** | `` (2), (5) | inválida |
| **CT09** | Qwerty (4) | válida |
| **CT10** | abc\_def (7) | inválida |

# Instruções de uso
> Necessário ter Maven devidamente instalado.
## Rodar os testes
```bash
mvn test
```