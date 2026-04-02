package service_stickers.implementare;

import java.util.HashMap;
import java.util.Map;

public class FactorySticker {
    private static Map<String, Sticker> mapa = new HashMap<>();
    public static Sticker getSticker(IMasina m){
        String cheie = m.getModel()+"-"+m.getAn();
        if(!mapa.containsKey(cheie)){
            mapa.put(cheie,new Sticker(m));
        }
        return mapa.get(cheie).clone();
    }
}
