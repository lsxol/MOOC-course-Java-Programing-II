
public class Program {

    public static void main(String[] args) {
        DictionaryOfManyTranslations d = new DictionaryOfManyTranslations();
        d.add("monkey","apina");
        d.add("monkey","apfe");
        d.add("cheese","juusto");
        d.remove("monkey");
        d.add("milk","maito");
        System.out.println(d.translate("milk"));
    }
}
