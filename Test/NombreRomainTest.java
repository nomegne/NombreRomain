import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junitpioneer.jupiter.params.ShortRangeSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NombreRomainTest {
    @Test
    public void Test1() throws Exception {
        //etant donné un convertisseur de nombre romain
        var convertisseur = new convertisseurNombreRomain();

        //quand on lui donne un nombre
        var resultat = convertisseur.Convertir(1);

        //alors on obtient 'I'
        assertEquals("I",resultat);
    }

    @Test
    public void Test2() throws Exception {
        //etant donné un convertisseur de nombre romain
        var convertisseur = new convertisseurNombreRomain();

        //quand on lui donne un nombre
        var resultat = convertisseur.Convertir(2);

        //alors on obtient 'II'
        assertEquals("II",resultat);
    }

    @Test
    public void Test3() throws Exception {
        //etant donné un convertisseur de nombre romain
        var convertisseur = new convertisseurNombreRomain();

        //quand on lui donne un nombre
        var resultat = convertisseur.Convertir(3);

        //alors on obtient 'III'
        assertEquals("III",resultat);
    }

    @Test
    public void Test4() throws Exception {
        //etant donné un convertisseur de nombre romain
        var convertisseur = new convertisseurNombreRomain();

        //quand on lui donne un nombre
        var resultat = convertisseur.Convertir(4);

        //alors on obtient 'I'
        assertEquals("IV",resultat);
    }

    @Test
    public void Test5() throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(5);

        //alors on obtient 'V'
        assertEquals("V",resultat);
    }
//6 ,7 et 8
    @ParameterizedTest
    @ShortRangeSource(from = 5, to =8, closed = true)
    public void TestUnifié(short nombreArabe) throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(nombreArabe);

        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "V"+"I".repeat(nombreArabe-5);
        assertEquals(attendu,resultat);

        // assertEquals("V"+"I",resultat);
    }

    @Test
    public void Test9() throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(9);

        //alors on obtient 'IX'
        assertEquals("IX",resultat);
    }

    @Test
    public void Test10() throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(10);

        //alors on obtient 'X'
        assertEquals("X",resultat);
    }

    //10 plus unité
    @ParameterizedTest
    @ShortRangeSource(from = 10, to =13, closed = true)
    public void Test10unité(short nombreArabe) throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(nombreArabe);

        //alors on obtient 'X' suivie  de 'nombreArabe-10 fois I'
        var attendu = "X"+"I".repeat(nombreArabe-10);
        assertEquals(attendu,resultat);

        // assertEquals("V"+"I",resultat);
    }

    @Test
    public void Test14() throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(14);

        //alors on obtient 'XIV'
        assertEquals("XIV",resultat);
    }

    //14 plus unité
    @ParameterizedTest
    @ShortRangeSource(from = 15, to =18, closed = true)
    public void Test14unité(short nombreArabe) throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(nombreArabe);

        //alors on obtient 'X' suivie  de 'nombreArabe-20 fois I'
        var attendu = "XV"+"I".repeat(nombreArabe-15);
        assertEquals(attendu,resultat);

        // assertEquals("V"+"I",resultat);
    }

    @Test
    public void Test19() throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(19);

        //alors on obtient 'XIX'
        assertEquals("XIX",resultat);
    }

    @Test
    public void Test20() throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre

        var resultat = convertisseurNombreRomain.Convertir(20);

        //alors on obtient 'XX'
        assertEquals("XX",resultat);
    }

    //1------3
    @ParameterizedTest
    @ShortRangeSource(from = 1, to =3, closed = true)
    public void TestDelete1(short nombreArabe) throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre
        var resultat = convertisseurNombreRomain.Convertir2(nombreArabe);
        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "I".repeat(nombreArabe);
        assertEquals(attendu,resultat);
    }
    //4
   @Test
   public void TestDelete4() throws Exception  {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre
        var resultat = convertisseurNombreRomain.Convertir2(4);
        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "IV";
        assertEquals(attendu,resultat);
    }

    //5------9
    @ParameterizedTest
    @ShortRangeSource(from = 5, to =8, closed = true)
    public void TestDelete5(short nombreArabe) throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre
        var resultat = convertisseurNombreRomain.Convertir2(nombreArabe);
        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "V"+"I".repeat(nombreArabe-5);
        assertEquals(attendu,resultat);
    }
//TO 9
    @Test
    public void TestDelete9() throws Exception  {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre
        var resultat = convertisseurNombreRomain.Convertir2(9);
        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "IX";
        assertEquals(attendu,resultat);
    }
//10 to 13
    @ParameterizedTest
    @ShortRangeSource(from = 10, to =13, closed = true)
    public void TestDelete10(short nombreArabe) throws Exception {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre
        var resultat = convertisseurNombreRomain.Convertir2(nombreArabe);
        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "X"+"I".repeat(nombreArabe-10);
        assertEquals(attendu,resultat);
    }
//TO 14
    @Test
    public void TestDelete14() throws Exception  {
        //etant donné un convertisseur de nombre romain
        //quand on lui donne un nombre
        var resultat = convertisseurNombreRomain.Convertir2(14);
        //alors on obtient 'V' suivie  de 'nombreArabe-5 fois I'
        var attendu = "XIV";
        assertEquals(attendu,resultat);
    }
//TO 15


}
