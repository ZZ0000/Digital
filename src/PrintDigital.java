/**
 * Created by semeykin on 18.10.2016.
 */
public class PrintDigital {

    static void print(Integer dig) {
        String digStr = dig.toString();
        String[][] mainArray = getMainArray();

        for (int r = 0; r < 7; r++) {
            for (int i = 0; i < digStr.length(); i++) {
                int digInt = Character.getNumericValue(digStr.charAt(i));

                System.out.print(mainArray[digInt][r]);
                System.out.print("  ");

            }
            System.out.println("");
        }
    }

    static void print(Integer dig, String a) {
        String digStr = dig.toString();
        String[][] mainArray = getMainArray();

        for (int r = 0; r < 7; r++) {
            for (int i = 0; i < digStr.length(); i++) {
                int digInt = Character.getNumericValue(digStr.charAt(i));

                String result = mainArray[digInt][r].replace('*', digStr.charAt(i));
                System.out.print(result);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    static void print(Integer dig, Character a) {
        String digStr = dig.toString();
        String[][] mainArray = getMainArray();

        for (int r = 0; r < 7; r++) {
            for (int i = 0; i < digStr.length(); i++) {
                int digInt = Character.getNumericValue(digStr.charAt(i));

                String rresult = mainArray[digInt][r].replace('*', a);
                System.out.print(rresult);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    static String[][] getMainArray() {
        String[][] mainArray = {
                {"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "},
                {" * ", "** ", " * ", " * ", " * ", " * ", "***"},
                {" *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****"},
                {" *** ", "*   *", "    *", "  ** ", "    *", "*   *", " *** "},
                {"   *  ", "  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "}, //4
                {"*****", "*    ", "*    ", " *** ", "    *", "*   *", " *** "},//5
                {"   ** ", " *    ", "*     ", "* *** ", "*    *", "*    *", " **** "},//6
                {"*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*    "},
                {" *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** "}, //8
                {" **** ", "*    *", "*    *", " *** *", "     *", "    * ", "  **  "},//9
        };
        return mainArray;
    }
}
