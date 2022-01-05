public class Hello {
    public static void main(String[] args) {
        ParentHello<String, String,Integer> ph = new ParentHello<String, String,Integer>("son","van",1);
        Integer i = ph.getInfo();
        String k = ph.getKey();
        String v = ph.getValue();
        System.out.println(k+" "+v+" "+i);

    }
}