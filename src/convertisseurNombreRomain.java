public class convertisseurNombreRomain {

   /* public static String Convertir(int nombreArabe) throws Exception {

           if (nombreArabe<=3)
               return "I".repeat(nombreArabe);

           if(nombreArabe==4) return "IV";
           if(nombreArabe==5) return "V";

            if(nombreArabe<=8) return "V"+"I".repeat(nombreArabe-5);

         /*  if(nombreArabe==6) return "VI";
           if(nombreArabe==7) return "VII";
           if(nombreArabe==8) return "VIII";*/

          // if(nombreArabe==9) return "IX";

        //if(nombreArabe<=13) return "X"+"I".repeat(nombreArabe-10);

           /*if(nombreArabe==10) return "X";
           if(nombreArabe==11) return "XI";
           if(nombreArabe==12) return "XII";
          if(nombreArabe==13) return "XIII";*/



          // throw new Exception();
   // }

    /*private String casNPlusUnites(
            int nombreArabe,
            int valeurBaseN,
            String RepresentationN)*/

    public static String Convertir(int nombreArabe) throws Exception {
        if(nombreArabe <= 3)
            return CaracteresRomains.Zero.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 4) return "IV";

        if(nombreArabe <= 8)
            return CaracteresRomains.V.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 9) return "IX";
        if(nombreArabe == 10) return "X";

        if(nombreArabe <= 13)
            return CaracteresRomains.X.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 14) return "XIV";

        if(nombreArabe <= 18)
            return CaracteresRomains.XV.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 19) return "XIX";
        if(nombreArabe == 20) return "XX";


       String T_unit []= {"I","II","III","IV","V","VI","VII","VIII","IX"};
       for (int i=0;i<T_unit.length;i++){
           if (i==nombreArabe) return T_unit[i];
       }


        throw new Exception();
    }

//Factory with the table
    public static String Convertir2(int nombreArabe) throws Exception {

        String T_unit []= {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String T_diz []= {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String T_cent []= {" ","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

        //les dix jusqu'a 19
        int resul=0;
        int val1=10;
        if((nombreArabe>9)&&(nombreArabe<20)){
            resul=nombreArabe-10;
            for (int i=1;i<=T_unit.length;i++){
                if (i==resul) return T_diz[0]+ T_unit[i-1];
                 if (resul==0) return T_diz[0];}
        }else{
                for (int i=1;i<=T_unit.length;i++){
                    if (i==nombreArabe) return T_unit[i-1];
            }
        }


        throw new Exception();
    }

}
