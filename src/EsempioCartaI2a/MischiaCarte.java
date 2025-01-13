package EsempioCartaI2a;

public class MischiaCarte {

    public Carta[] mischia(Carta[] mazzo) {
        for (int i = 0; i < mazzo.length; i++) {
            int random = Math.round((int) (Math.random() * (mazzo.length)));
            int random1 = Math.round((int) (Math.random() * (mazzo.length)));
            Carta temp = mazzo[random];
            mazzo[random] = mazzo[random1];
            mazzo[random1] = temp;
        }
        return mazzo;
    }

}
