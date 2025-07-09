public class video14 {
    public static void main(String[] args){
        String name = "Harry";
        int value = name.length();
        System.out.println(value);

        String tlc = name.toLowerCase();
        System.out.println(tlc);

        String tuc = name.toUpperCase();
        System.out.println(tuc);

        String name2 = "   Harry   ";
        String trm= name2.trim();
        System.out.println(trm);
        System.out.println(name2);

        String subStr = name.substring(2);
        System.out.println(subStr);

        String substr2 = name.substring(1, 4);
        System.out.println(substr2);

        String rep = name.replace('r','p');
        System.out.println(rep);

        Boolean endw = name.endsWith("rry");
        System.out.println(endw);

        Boolean startw = name.startsWith("Ha");
        System.out.println(startw);

        char chat = name.charAt(3);
        System.out.println(chat);

        int inof = name.indexOf("r");
        System.out.println(inof);

        int inof2 = name.indexOf("y",2);
        System.out.println(inof2);

        int nli = name.lastIndexOf("r");
        System.out.println(nli);

        int nli2 = name.lastIndexOf("r",2);
        System.out.println(nli2);

        Boolean equal = name.equals("harRy");
        System.out.println(equal);

        Boolean equalignore = name.equalsIgnoreCase("harRy");
        System.out.println(equalignore);


    }
}
