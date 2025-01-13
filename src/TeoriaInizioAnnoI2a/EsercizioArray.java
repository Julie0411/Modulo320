package TeoriaInizioAnnoI2a;

public class EsercizioArray {

    public static void main(String[] args) {

        String s = "1 7 9 -10 -5";
        int[] n = new int[5];
        String[] list = s.split(" ", s.length());
        int index = 0;
        for (String str : list) {
            try {
                n[index] = Integer.valueOf(str);
            } catch (Exception e) {
                n[index] = 0;
            }
            index++;
        }

        for (int num : n) {
            System.out.println(num);
        }

    }

}
