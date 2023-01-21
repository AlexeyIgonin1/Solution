package Loggers;

import java.util.logging.Logger;

public class Logger_2 {
     public static void main(String[] args) {
         MailService spy = new Spy(Logger.getLogger(Class.class.getName()));
         MailService thief = new Thief(10);
         MailService inspector = new Inspector();
         MailService[] msArray = {spy, thief, inspector};
         MailMessage mail1 = new MailMessage("Romeo", "Juliet", "I love you!");
         MailMessage mail2 = new MailMessage("Austin Powers", "James Bond", "Big secret!");
         MailPackage mail3 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 15));
         MailPackage mail4 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 25));
         MailPackage mail5 = new MailPackage("Austin Powers", "James Bond", new Package("weapons", 5));

         UntrustworthyMailWorker umw = new UntrustworthyMailWorker(msArray);
         try {
             umw.processMail(mail1);
         } catch (RuntimeException re) {
             System.out.println(re.getMessage());
         }
         try {
             umw.processMail(mail2);
         } catch (RuntimeException re) {
             System.out.println(re.getMessage());
         }
         try {
             umw.processMail(mail3);
         } catch (RuntimeException re) {
             System.out.println(re.getMessage());
         }
         try {
             umw.processMail(mail4);
         } catch (RuntimeException re) {
             System.out.println(re.getMessage());
         }
         try {
             umw.processMail(mail5);
         } catch (RuntimeException re) {
             System.out.println(re.getMessage());
         }

         System.out.println("Thief have stolen $" + ((Thief) thief).getStolenValue() + "!");
     }

    /*
Интерфейс: сущность, которую можно отправить по почте.
У такой сущности можно получить от кого и кому направляется письмо.
*/
    public static interface Sendable {
        String getFrom();
        String getTo();
    }
    /*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/
    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }
    }
    /*
Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
*/
    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }
    }
    /*
        Посылка, содержимое которой можно получить с помощью метода `getContent`
    */
    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }
    }
     /*
      Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
     */
     public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    /*
        Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
    */
    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    /*
    Класс, в котором скрыта логика настоящей почты
    */
    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }
       /*
       1) UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того,
       чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект
       набору третьих лиц, а затем, в конце концов, передает получившийся объект непосредственно экземпляру
       RealMailService. У UntrustworthyMailWorker должен быть конструктор от массива MailService ( результат
       вызова processMail первого элемента массива передается на вход processMail второго элемента, и т. д.)
       и метод getRealMailService, который возвращает ссылку на внутренний экземпляр RealMailService.
       */
       public static class UntrustworthyMailWorker implements MailService{
        private  static MailService[] works;
        private static RealMailService realMailService = new RealMailService();
        public UntrustworthyMailWorker(MailService[] works) {
            this.works = works;
        }
        public MailService getRealMailService(){
            return this.realMailService;
        }
        @Override
        public Sendable processMail(Sendable mail) {
            Sendable process = mail;
            for(int i = 0; i<works.length; i++ ){
                process = works[i].processMail(mail);
            }
            return realMailService.processMail(mail);
        }
    }
    /*
    2) Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется
    от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса
    MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить части в фигурных скобках на значения
    полей почты):
    2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с
    уровнем WARN: Detected target mail correspondence: from {from} to {to} "{message}"
    2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
    */
    public static class Spy implements MailService{
        private final Logger logger;

        public Spy(Logger logger){
            this.logger = logger;
        }
        @Override
        public Sendable processMail(Sendable mail) {

            if(mail.getClass()==MailMessage.class) {
                MailMessage mailMessage = (MailMessage) mail;
                String from = mail.getFrom();
                String to = mail.getTo();
            if(from.equals("Austin Powers")||to.equals("Austin Powers")){
                logger.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                logger.info("Usual correspondence: from " + from + " to " + to + "");
            }
            }
            return mail;
        }
    }

    /*
3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе
переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен
присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.
Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с
нулевой ценностью и содержимым посылки "stones instead of {content}".
*/

    public static class Thief implements MailService{
        private static int stolenValue;
        private static int minValue;

        public Thief(int MinValue){
        this.minValue = minValue;
        }

        public int getStolenValue(){
            return stolenValue;
        }

        @Override
        public Sendable processMail(Sendable mail) {

            if(mail.getClass()==MailPackage.class){

                Package pacages = ((MailPackage)mail).getContent();

                if(pacages.getPrice()>=minValue){
                    stolenValue+=pacages.getPrice();
                    mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of "+ pacages.getContent(), 0));
                }
            }
            return mail;
        }
    }
    /*

4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состаящую из
камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны
объявить самостоятельно в виде непроверяемых исключений.
*/

    public static class IllegalPackageException extends RuntimeException{
        public IllegalPackageException(){

        }
        public IllegalPackageException(String message){

        }
    }
    public static class StolenPackageException extends RuntimeException{
        public StolenPackageException(){

        }
        public StolenPackageException(String message){

        }
    }

    public static class Inspector implements MailService{

        @Override
        public Sendable processMail(Sendable mail) {
            if(mail.getClass()==MailPackage.class){
                String content = String.valueOf(((MailPackage) mail).getContent());
                Package pacege = ((MailPackage) mail).getContent();
                String content2 = pacege.getContent();

                if(content2.indexOf("stones")==0){
                    throw new StolenPackageException();
                }
                if(content2.equalsIgnoreCase("weapons")||content2.equalsIgnoreCase("banned substance")){
                    throw new IllegalPackageException();
                }
            }
            return mail;
        }
    }
}
