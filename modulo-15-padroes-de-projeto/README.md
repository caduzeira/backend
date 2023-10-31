## PADRÕES DE PROJETOS
- O objetivo dos padrões de projetos, são tornar componentes reutilizáveis que facilitam a padronização, que permita agilidade para as soluções de problemas recorrentes no desenvovimento do sistema.

## EXISTEM 2 PADRÕES DE PROJETO
- Padrões GRASP
- Padrões GOF

## PADRÕES GOF
- Padrão comumente usado a softwares que tenham algum envolvimento a orientação a objetos
-> Padrões de criação: Factory Method, Abstract Factory, Singleton, Builder, Prototype
-> Padões estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
-> Padrões comportamentais: Chain of Responsability, Command, Interpreter, Iterator, Mediator, Memento, Observer,State,Strategy, Template, Method, Visitor

## Singleton
- Usado quando desejado, que uma classe tenha apenas uma instância na aplicação
-> O construtor da classe fica como privado (private), sendo que não pode ser instanciada para fora da propria classe.
-> A Classe é final, pois não permite a criação de subclasses da própria classe
-> O Acesso é permitido através do método que retorna a instância única da classe

## Builder
- Fornece uma interface genérica para construção incremental de agregações. Esconde detalhes de como componentes são criados

## Abstract Factory
- É um padrão de design criacional que fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.
