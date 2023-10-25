## NOMENCLATURAS
- Classes e interfaces: A primeira letra deve ser maiuscula, caso tenha mais de uma palavras, as duas maisculas
- Metodos: A primeira letra dever ser minuscula, caso tenha duas palavras a segunda dever começa com maisculo
- Variaveis: Mesmo de metodos
- Constantes: Todas as letras maisculas

## MODIFICADORES DE ACESSO
- public: O membro é acessível de qualquer classe. Não há restrições de visibilidade. Por exemplo, uma classe ou método marcado como public pode ser acessado de qualquer lugar.
    public void metodoPublico() {
        // Este método pode ser acessado de qualquer lugar.
    }

- private: O membro é acessível somente dentro da própria classe em que está definido. Outras classes não podem acessá-lo diretamente. Isso é usado para encapsular os detalhes de implementação.
    private void metodoPrivado() {
        // Este método só pode ser acessado dentro desta classe.
    }

- protected: O membro é acessível dentro da própria classe, em classes do mesmo pacote e em subclasses, mesmo que estejam em pacotes diferentes. Isso permite uma forma de encapsulamento limitado e herança controlada.
    protected void metodoProtegido() {
        // Este método pode ser acessado dentro da classe, subclasses e classes do mesmo pacote.
    }

- default (pacote): Se um membro não possui um modificador de acesso explícito (ou seja, não é public, private ou protected), ele é considerado com acesso "default". Nesse caso, o membro é acessível somente dentro da classe e em classes do mesmo pacote. Isso fornece um nível intermediário de visibilidade.
    void metodoDefault() {
        // Este método é acessível apenas dentro do pacote.
    }

## PALAVRAS RESERVADAS
- Palavras reservadas, em linguagens de programação, são palavras-chave que têm significados especiais e são reservadas para uso pelo compilador ou interpretador da linguagem. Elas não podem ser usadas como identificadores 

## COMENTARIOS
@param:
Usado para descrever os parâmetros de um método ou construtor.
Exemplo: @param nome O nome da pessoa.

@return:
Indica o valor de retorno de um método.
Exemplo: @return A soma dos números.

@throws ou @exception:
Documenta as exceções lançadas por um método.
Exemplo: @throws IOException Se ocorrer um erro de E/S.

@see:
Fornece links para outras classes ou métodos relacionados.
Exemplo: @see OutraClasse#outroMetodo

@since:
Indica a versão desde a qual o elemento está disponível.
Exemplo: @since 1.0

@deprecated:
Marca um elemento como obsoleto e fornece informações sobre uma alternativa a ser usada.
Exemplo: @deprecated Use o método alternativo em vez deste.

@author:
Especifica o autor do código.
Exemplo: @author João Silva

@version:
Define a versão atual do código.
Exemplo: @version 1.2

@param name (para campos):
Usado para documentar campos de classe.
Exemplo: @param name O nome da pessoa.

@inheritDoc:
Indica que o método atual sobrescreve um método da superclasse e herda a documentação desse método.