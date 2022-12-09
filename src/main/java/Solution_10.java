public class Solution_10 {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder fin = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            String name = roles[i];
            fin.append(roles[i] + ":" + "\n");
            for (int a = 0; a < textLines.length; a++) {
                if (textLines[a].startsWith(roles[i] + ":")) {
                    fin.append(a + 1).append(") ").append(textLines[a].replaceFirst(name + ": ", "")).append("\n");
                }
            }
            fin.append("\n");
        }
        return fin.toString();
    }
        public static void main (String[]args){
            String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука", "Лука Лукич"};

            String[] textLines = new String[]{
                    "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                    "Аммос Федорович: Как ревизор?",
                    "Артемий Филиппович: Как ревизор?",
                    "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                    "Аммос Федорович: Вот те на!",
                    "Артемий Филиппович: Вот не было заботы, так подай!",
                    "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                    "Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!"};
            Solution_10 reg = new Solution_10();

            System.out.println(reg.printTextPerRole(roles,textLines));
    }
}

