public class New {
    public static int New (String soz, String bilmim) {
        int count = 0;
        int index = soz.indexOf(bilmim);
        int i = 1;
        while (i < index) {
            count++;
        }
        return New(soz, bilmim);
    }

    public static void main(String[] args) {
        String soz = "Database";
        String bilmim = "a";
        int res = New(soz, bilmim);
        System.out.println(res);
    }
}
