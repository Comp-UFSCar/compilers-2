package infrastructure;

import java.util.HashMap;

/**
 *
 * @author lucas
 */
public class RelationalMap {

    static HashMap<String, String[]> attribute;
    static HashMap<String, String[]> add;
    static HashMap<String, String[]> multiply;
    static HashMap<String, String[]> mod;
    static HashMap<String, String[]> logic;
    static HashMap<String, String[]> arithmetic;

    public static boolean CanAttribute(String a, String b) {
        initAttribute();
        return Can(a, b, attribute);
    }

    public static boolean CanAdd(String a, String b) {
        initAdd();
        return Can(a, b, add);
    }

    public static boolean CanMultiply(String a, String b) {
        initMultiply();
        return Can(a, b, multiply);
    }

    public static boolean CanMod(String a, String b) {
        initMod();
        return Can(a, b, mod);
    }

    public static boolean CanLogic(String a, String b) {
        initLogic();
        return Can(a, b, logic);
    }

    public static boolean CanBeArithmeticallyCompared(String a, String b) {
        initArithmetic();
        return Can(a, b, arithmetic);
    }

    protected static boolean Can(String a, String b, HashMap<String, String[]> map) {

        if (a == null || b == null) {
            return false;
        }

        // soft comparison
        if (a.toLowerCase().equals(b.toLowerCase())) {
            return true;
        }

        try {
            for (String type : map.get(a.toLowerCase())) {
                if (type.equals(b.toLowerCase())) {
                    return true;
                }
            }
        } catch (NullPointerException e) {
            // returns false
        }

        return false;
    }

    private static void initAttribute() {
        String type;
        String[] list;

        if (attribute == null) {
            attribute = new HashMap<>();

            type = "inteiro";
            list = new String[]{"inteiro", "real"};
            attribute.put(type, list);

            type = "real";
            attribute.put(type, list);

            type = "literal";
            list = new String[]{"literal"};
            attribute.put(type, list);

            type = "logico";
            list = new String[]{"logico"};
            attribute.put(type, list);
        }
    }

    private static void initAdd() {
        String type;
        String[] list;

        if (add == null) {
            add = new HashMap<>();

            type = "inteiro";
            list = new String[]{"inteiro", "real"};
            add.put(type, list);

            type = "real";
            add.put(type, list);

            type = "literal";
            list = new String[]{"literal"};
            add.put(type, list);
        }
    }

    private static void initMultiply() {
        String type;
        String[] list;

        if (multiply == null) {
            multiply = new HashMap<>();

            type = "inteiro";
            list = new String[]{"inteiro", "real"};
            multiply.put(type, list);

            type = "real";
            multiply.put(type, list);
        }
    }

    private static void initMod() {
        String type;
        String[] list;

        if (mod == null) {
            mod = new HashMap<>();

            type = "inteiro";
            list = new String[]{"inteiro"};
            mod.put(type, list);

            type = "real";
            mod.put(type, list);
        }
    }

    private static void initLogic() {
        String type;
        String[] list;

        if (logic == null) {
            logic = new HashMap<>();

            type = "logico";
            list = new String[]{"logico"};
            logic.put(type, list);
        }
    }

    private static void initArithmetic() {
        String type;
        String[] list;

        if (arithmetic == null) {
            arithmetic = new HashMap<>();

            type = "inteiro";
            list = new String[]{"inteiro", "real"};
            arithmetic.put(type, list);

            type = "real";
            arithmetic.put(type, list);
        }
    }
}
