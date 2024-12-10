package com.solid;

//Main class to demonstrate the principles in action
public class SolidExample {
	
	
	/**


conceito:



	S: Princípio da Responsabilidade Única (Single Responsibility Principle)
		resumo uma classe independênte para cada atividade!
		
	O: Princípio Aberto/Fechado (Open/Closed Principle)
		Objetos ou entidades devem ser abertos para extensão, mas fechados para modificações
		Em outras palavras, todas as entidades do projeto podem receber adições e novos recursos, mas não podem alterar o código que já foi escrito.
		Esse princípio  evita que erros sejam criados em métodos e códigos que já existem e que estão funcionando corretamente. 
		
	L: Princípio da Substituição de Liskov (Liskov Substitution Principle)
		Se uma classe A é um subtipo da classe B, então você deve ser capaz de substituir toda ocorrência de B por A mantendo o mesmo comportamento.
		Em outras palavras, uma classe Filha deve substituir uma classe Pai sem que isso acarrete em problemas no código
		
		
	I: Princípio da Segregação de Interfaces (Interface Segregation Principle)
		Interfaces mais específicas são melhores do que uma única interface geral
		Ou seja, é melhor ter interfaces pequenas com métodos específicos, do que interfaces muito grandes cheia de métodos
		 que uma classe terá que implementar, mas que não vai usar. 
		
	D: Princípio da Inversão de Dependência (Dependency Inversion Principle) 
		Os módulos de alto nível não devem depender diretamente de módulos de baixo nível. 
		Ambos devem depender de abstrações. Além disso, abstrações não devem depender de detalhes, mas detalhes devem depender de abstrações



implementação:

	 		S (Single Responsibility Principle):

				Order é responsável apenas por armazenar os detalhes do pedido.			
				PaymentProcessor coordena o pagamento e a notificação.			
				Notificação (NotificationService) e métodos de pagamento (PaymentMethod) têm responsabilidades separadas.
				
			O (Open/Closed Principle):
			
				É possível adicionar novos métodos de pagamento (ex.: GooglePayPayment) ou notificações (ex.: PushNotification) sem modificar o código existente.
				
			L (Liskov Substitution Principle):
			
				As classes que implementam PaymentMethod ou NotificationService podem ser substituídas sem quebrar o código.
				
			I (Interface Segregation Principle):
			
				Interfaces são pequenas e específicas (PaymentMethod e NotificationService), evitando a implementação de métodos desnecessários.
				
			D (Dependency Inversion Principle):
			
				PaymentProcessor depende das abstrações PaymentMethod e NotificationService, permitindo maior flexibilidade.
				
			
			
	 * @see https://www.dio.me/articles/entenda-solid-de-vez-com-exemplos-simples-em-java
	 * @param args
	 */
 public static void main(String[] args) {
     Order order = new Order("12345", 250.00);

     // Using Credit Card Payment with Email Notification
     PaymentProcessor processor1 = new PaymentProcessor(new CreditCardPayment(), new EmailNotification());
     processor1.processPayment(order);

     // Using PayPal Payment with SMS Notification
     PaymentProcessor processor2 = new PaymentProcessor(new PayPalPayment(), new SMSNotification());
     processor2.processPayment(order);
 }
}