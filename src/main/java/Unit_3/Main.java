package Unit_3;

public class Main {

    public static void main(String[] args) {
        String[] spamKeywords = {"bad","spam"}; // Слова, относящиеся к спаму
        int commentMaxLength = 40; // Максимальная длина строки
        String s = "This spam"; // Тестируемая строка

        TextAnalyzer[] textAnalyzers = { // Массив, подаваемый на вход checkLabels()
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };

        System.out.println(checkLabels(textAnalyzers, s)); // На выходе SPAM, так как String s содержит ключевое слово "spam" из spamKeywords







        /*
        // инициализация анализаторов для проверки в порядке данного набора анализаторов
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers4 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords)
        };
        TextAnalyzer[] textAnalyzers5 = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords)
        };
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
                textAnalyzers4, textAnalyzers5, textAnalyzers6};
        Main testObject = new Main();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
*/
    }
//--------------------------------------------------------------------------------------------------------------
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
//--------------------------------------------------------------------------------------------------------------
    interface TextAnalyzer {
        Label processText(String text);
    }
//-------------------------------------------------------------------------------------------------------------
    static abstract class KeywordAnalyzer implements TextAnalyzer {
       protected abstract String[] getKeywords();
       protected abstract Label getLabel();

       public Label processText(String text){
           String[] keywords = getKeywords();
           for(String keyword : keywords) {
               if (keyword.contains(text)) {
                   return getLabel();
               }
           }
        return Label.OK;
       }
    }
//-------------------------------------------------------------------------------------------------------------
    static class TooLongTextAnalyzer implements TextAnalyzer{
        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }
        public int getMaxLength() {
            return maxLength;
        }
        @Override
        public Label processText(String text) {
            if(text.length()>maxLength){
                return Label.TOO_LONG;
            }
            else{
                return Label.OK;
            }
        }
    }
//-----------------------------------------------------------------------------------------------------
    static class NegativeTextAnalyzer extends KeywordAnalyzer{
        private final String[] KEYWORDS = {":(", "=(", ":|"};
        @Override
        protected String[] getKeywords() {
            return KEYWORDS;
        }
        @Override
        protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
//------------------------------------------------------------------------------------------
    static class SpamAnalyzer extends KeywordAnalyzer {
       private String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        public String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }

}
//--------------------------------------------------------------------------------------------------------
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for(int i = 0; i < analyzers.length; i++){
            if(analyzers[i].processText(text)!=Label.OK){
                return analyzers[i].processText(text);
            }
        }

        return Label.OK;
    }


}
