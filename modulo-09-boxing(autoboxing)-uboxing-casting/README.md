## TIPOS COMPLEXTO DE VARIAVEIS(WRAPPERS)
- Em Java, o termo "tipos complexos" geralmente se refere a tipos de dados que não são primitivos, ou seja, não são os tipos de dados básicos como int, float, char, etc. Em vez disso, são tipos que representam estruturas mais complexas, muitas vezes compostas de vários elementos
- As classes wrapper fornecem métodos úteis, permitindo operações mais sofisticadas do que aquelas disponíveis nos tipos primitivos.
         _____________________________________
        | Tipo Primitivo    |  Wrapper Classe | - Wrapper possuim metodos a mais
        |___________________|_________________|
        |    byte	    |     Byte        | - Primitivo possui menos metodos
        |    short	    |     Short       |
        |    int	    |     Integer     |
        |    long	    |     Long        |
        |   float	    |     Float       |
        |    double	    |     Double      |
        |   char	    |     Character   |
        |   boolean	    |     Boolean     |

## BOXING (AUTOBOXIN)
- Boxing ou Autoboxing é a conversão de tipos primitivos para classes wrppers correspondente.

## UNBOXING
- Converte de um tipo primitivo para um wrapper dele

## Casting
- Casting é um recurso, que possibilita mudar um valor de um tipo para o outro. As vezes isso é feito automático, que chamamos de casting IMPLICITO e tambem pode ser feito por, chamado de casting EXPLICITO
- Você pode pensar nos bits com caixas, você não consegue colocar em uma caixa que so cabe 1, colocar algo de 16. Por isso temos o casting explicito, converte de um maior para um menor 
- Implicito porque não fica claro a mudança de um para outro. Isso porque o bit de um cabe perfeitamente no outro   
         _________________________
        | TIPO     |      TAMANHO | 
        |__________|______________| 
        | boolean    |    1 bit   |    
        | byte       |    8 bits  |    
        | char       |    16 bits |     
        | short      |    16 bits |    
        | int        |    32 bits |    
        | float      |    32 bits |    
        | double     |    64 bits |
        | long       |    64 bits |
- Observações sobre tipos primitivos:
-> Boolena - Não pode ser moldado para nenhum outro tipo, tanto implicitamente quanto explicitamente
-> char - Nenhum outro tipo pode ser moldado para char
-> Long - é semelhante ao inteiro, mas com uma possibilidade maior de números
