import java.util.Scanner;
/*Потрібно: Створити клас DocumentWorker.
У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
У тілі кожного з методів додайте виведення на екран відповідних рядків:
"Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа доступне у версії Про".
Створіть похідний клас ProDocumentWorker.
Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки:
 "Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт".
 Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker.
 Перевизначте відповідний метод.
 При викликі даного методу необхідно виводити на екран документ збережений в новому форматі.
 У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp.
 Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу),
 якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Вас вітає DocumentWorker");
        System.out.println("Щоб скористатись Версією Pro i Exp, введіть ключ продукту");
        // Key product Pro and Exp = 24081991
        Scanner in = new Scanner(System.in);

        int key = in.nextInt();
        if (key == 24081991) {
            System.out.println("Вам доступна версія Pro i Exp");
            DocumentWorker document = new ExpertDocumentWorker();
            System.out.println("Введіть '1', щоб зберегти документ");
            int value = in.nextInt();
            if (value == 1)
                document.saveDocument();
            else System.out.println("Документ не збережено");
        }
        else {
            System.out.println("Ключ невірний. Вам доступна безкоштовна версія");
            DocumentWorker document = new DocumentWorker();
            System.out.println("Введіть '1', щоб зберегти документ");
            int value = in.nextInt();
            if (value == 1)
                document.saveDocument();
            else System.out.println("Документ не збережено");
        }


    }
}
