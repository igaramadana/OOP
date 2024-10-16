public class VacuumStruktural {
    public static void main(String[] args) {
        String merk, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        String jenis, jenis2, jenis3, jenis4, jenis5, jenis6, jenis7, jenis8, jenis9, jenis10;
        int daya, daya2, daya3, daya4, daya5, daya6, daya7, daya8, daya9, daya10;

        merk = "Dyson V15";
        jenis = "Bagless";
        daya = 240;

        merk2 = "Shark Stratos";
        jenis2 = "Bagless";
        daya2 = 80;

        merk3 = "Samsung Jet 60";
        jenis3 = "Non Bagless";
        daya3 = 150;

        merk4 = "Wyze";
        jenis4 = "Bagless";
        daya4 = 140;

        merk5 = "Obode P8";
        jenis5 = "Robot Vacuum";
        daya5 = 166;

        merk5 = "Philips FC8291";
        jenis5 = "Non Bagless";
        daya5 = 140;

        merk6 = "Tapo RV10";
        jenis6 = "Robot Vacuum";
        daya6 = 160;

        merk7 = "Deerma VC20 Plus";
        jenis7 = "Bagless";
        daya7 = 149;

        merk8 = "Samsung Jet 70";
        jenis8 = "Bagless";
        daya8 = 100;

        merk9 = "Idealife";
        jenis9 = "Bagless";
        daya9 = 83;

        merk10 = "Sharp";
        jenis10 = "Non Bagless";
        daya10 = 167;

        daya = tambahDaya(daya, 10);
        daya2 = tambahDaya(daya2, 12);
        daya3 = tambahDaya(daya3, 8);
        daya4 = tambahDaya(daya4, 13);
        daya5 = tambahDaya(daya5, 9);
        daya6 = tambahDaya(daya6, 20);
        daya7 = tambahDaya(daya7, 18);
        daya8 = tambahDaya(daya8, 15);
        daya9 = tambahDaya(daya9, 17);
        daya10 = tambahDaya(daya10, 23);

        System.out.println("Vacuum 1");
        System.out.println("Merk: " + merk);
        System.out.println("Jenis:" + jenis);
        System.out.println("Daya Hisap: " + daya);
        System.out.println();

        System.out.println("Vacuum 2");
        System.out.println("Merk: " + merk2);
        System.out.println("Jenis:" + jenis2);
        System.out.println("Daya Hisap: " + daya2);
        System.out.println();

        System.out.println("Vacuum 3");
        System.out.println("Merk: " + merk3);
        System.out.println("Jenis:" + jenis3);
        System.out.println("Daya Hisap: " + daya3);
        System.out.println();

        System.out.println("Vacuum 4");
        System.out.println("Merk: " + merk4);
        System.out.println("Jenis:" + jenis4);
        System.out.println("Daya Hisap: " + daya4);
        System.out.println();

        System.out.println("Vacuum 5");
        System.out.println("Merk: " + merk5);
        System.out.println("Jenis:" + jenis5);
        System.out.println("Daya Hisap: " + daya5);
        System.out.println();

        System.out.println("Vacuum 6");
        System.out.println("Merk: " + merk6);
        System.out.println("Jenis:" + jenis6);
        System.out.println("Daya Hisap: " + daya6);
        System.out.println();

        System.out.println("Vacuum 7");
        System.out.println("Merk: " + merk7);
        System.out.println("Jenis:" + jenis7);
        System.out.println("Daya Hisap: " + daya7);

        System.out.println("Vacuum 8");
        System.out.println("Merk: " + merk8);
        System.out.println("Jenis:" + jenis8);
        System.out.println("Daya Hisap: " + daya8);
        System.out.println();

        System.out.println("Vacuum 9");
        System.out.println("Merk: " + merk9);
        System.out.println("Jenis:" + jenis9);
        System.out.println("Daya Hisap: " + daya9);
        System.out.println();

        System.out.println("Vacuum 10");
        System.out.println("Merk: " + merk10);
        System.out.println("Jenis:" + jenis10);
        System.out.println("Daya Hisap: " + daya10);
        System.out.println();
    }

    public static int tambahDaya(int daya, int increment) {
        daya += increment;
        return daya;
    }

    public static int kurangiDaya(int daya, int decrement) {
        daya -= decrement;
        return daya;
    }
}
