package poo_Faculdade.Aula9_Iterator_Set_Map;

public class HierarquiaExceções {
    /*

    * **(a) A classe RuntimeException é uma subclasse da classe Exception.** **Correto**.  A hierarquia de exceções em Java tem a classe `Throwable` no topo. `Exception` é uma subclasse de `Throwable`, e `RuntimeException` é uma subclasse de `Exception`. 
    * **(b) A classe Error herda da classe Exception.** **Incorreto**.  A classe `Error` também é uma subclasse direta de `Throwable`, assim como `Exception`. 
    * **(c) As classes NullPointerException e IndexOutOfBoundsException não são válidas no tratamento de exceção em java.** **Incorreto**.  `NullPointerException` e `IndexOutOfBoundsException` são subclasses de `RuntimeException`. Elas são exceções que devem ser tratadas, embora não sejam obrigatórias como as exceções checked.
    * **(d) A classe Exception é uma subclasse da classe IOException.** **Incorreto**. `IOException` é uma subclasse de `Exception`.

    **Em resumo:**

    * **`Throwable`** é a classe raiz para todas as exceções e erros em Java.
    * **`Exception`** é a classe base para exceções que podem ser tratadas pelo programador.
    * **`RuntimeException`** é uma subclasse de `Exception` que representa exceções que podem ocorrer durante a execução normal do programa.
    * **`Error`** representa erros graves que geralmente não podem ser recuperados.
 
    */
}
