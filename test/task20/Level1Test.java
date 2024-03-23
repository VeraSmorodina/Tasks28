package task20;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void bastShoe1() {
        String asserted1 = "Привет";
        String actual1 = Level1.BastShoe("1 Привет");
        assert actual1.equals(asserted1);

        String asserted2 = "Привет, Мир!";
        String actual2 = Level1.BastShoe("1 , Мир!");
        assert actual2.equals(asserted2);

        String asserted3 = "Привет, Мир!++";
        String actual3 = Level1.BastShoe("1 ++");
        assert actual3.equals(asserted3);

        String asserted4 = "Привет, Мир!";
        String actual4 = Level1.BastShoe("2 2");
        assert actual4.equals(asserted4);

        String asserted5 = "Привет, Мир!++";
        String actual5 = Level1.BastShoe("4");
        assert actual5.equals(asserted5);

        String asserted6 = "Привет, Мир!";
        String actual6 = Level1.BastShoe("4");
        assert actual6.equals(asserted6);

        String asserted7 = "Привет, Мир!*";
        String actual7 = Level1.BastShoe("1 *");
        assert actual7.equals(asserted7);

        String asserted8 = "Привет, Мир!";
        String actual8 = Level1.BastShoe("4");
        assert actual8.equals(asserted8);

        String asserted9 = "Привет, Мир!";
        String actual9 = Level1.BastShoe("4");
        assert actual9.equals(asserted9);

        String asserted10 = "Привет, Мир!";
        String actual10 = Level1.BastShoe("4");
        assert actual10.equals(asserted10);

        String asserted11 = "!";
        String actual11 = Level1.BastShoe("3 11");
        assert actual11.equals(asserted11);

        String asserted12 = "";
        String actual12 = Level1.BastShoe("2 100");
        assert actual12.equals(asserted12);

        String asserted13 = "Привет";
        String actual13 = Level1.BastShoe("1 Привет");
        assert actual13.equals(asserted13);

        String asserted14 = "Привет, Мир!";
        String actual14 = Level1.BastShoe("1 , Мир!");
        assert actual14.equals(asserted14);

        String asserted15 = "Привет, Мир!++";
        String actual15 = Level1.BastShoe("1 ++");
        assert actual15.equals(asserted15);

        String asserted16 = "Привет, Мир!";
        String actual16 = Level1.BastShoe("4");
        assert actual16.equals(asserted16);

        String asserted17 = "Привет";
        String actual17 = Level1.BastShoe("4");
        assert actual17.equals(asserted17);

        String asserted18 = "Привет, Мир!";
        String actual18 = Level1.BastShoe("5");
        assert actual18.equals(asserted18);

        String asserted19 = "Привет";
        String actual19 = Level1.BastShoe("4");
        assert actual19.equals(asserted19);

        String asserted20 = "Привет, Мир!";
        String actual20 = Level1.BastShoe("5");
        assert actual20.equals(asserted20);

        String asserted21 = "Привет, Мир!++";
        String actual21 = Level1.BastShoe("5");
        assert actual21.equals(asserted21);

        String asserted22 = "Привет, Мир!++";
        String actual22 = Level1.BastShoe("5");
        assert actual22.equals(asserted22);

        String asserted23 = "Привет, Мир!++";
        String actual23 = Level1.BastShoe("5");
        assert actual23.equals(asserted23);

        String asserted24 = "Привет, Мир!";
        String actual24 = Level1.BastShoe("4");
        assert actual24.equals(asserted24);

        String asserted25 = "Привет";
        String actual25 = Level1.BastShoe("4");
        assert actual25.equals(asserted25);

        String asserted26 = "Прив";
        String actual26 = Level1.BastShoe("2 2");
        assert actual26.equals(asserted26);

        String asserted27 = "Привет";
        String actual27 = Level1.BastShoe("4");
        assert actual27.equals(asserted27);

        String asserted28 = "Прив";
        String actual28 = Level1.BastShoe("5");
        assert actual28.equals(asserted28);

        String asserted29 = "Прив";
        String actual29 = Level1.BastShoe("5");
        assert actual29.equals(asserted29);

        String asserted30 = "Прив";
        String actual30 = Level1.BastShoe("5");
        assert actual30.equals(asserted30);
    }

    @Test
    public void bastShoe2() {
        String asserted1 = "Привет";
        String actual1 = Level1.BastShoe("1 Привет");
        assert actual1.equals(asserted1);

        String asserted2 = "Привет, Мир!";
        String actual2 = Level1.BastShoe("1 , Мир!");
        assert actual2.equals(asserted2);
        String asserted3 = "Привет";
        String actual3 = Level1.BastShoe("4");
        assert actual3.equals(asserted3);

        String asserted4 = "Привет, Мир!";
        String actual4 = Level1.BastShoe("5");
        assert actual4.equals(asserted4);

        String asserted5 = "Привет, Мир!**";
        String actual5 = Level1.BastShoe("1 **");
        assert actual5.equals(asserted5);
    }


}