package OpenClosePrinciple;

public class YakitHesaplayici {

//    public static double hesapla(Mercedes arabaMercedes){
//        return arabaMercedes.tripKm*3;//mercedes km başı $3 yakıyor
//    }
//
//    public static double hesapla(BMW arabaBMW){
//        return arabaBMW.tripKm*2;//BMW km başı $3 yakıyor
//    }

    public static int hesapla(Araba araba){
        //kötü kod
//        int masraf=0;
//        if (araba.model==("BMW")){
//            masraf=araba.tripKm*araba.dolarPerKm;
//        }
//        if (araba.model==("Mercedes")){
//            masraf=araba.tripKm*araba.dolarPerKm;
//        }
        return araba.tripKm*araba.dolarPerKm;
    }
}
