package Lab8;

interface money {
    void sales();
}

class Hardware implements money {
    static int hctr;

    String manufacturer;
    String category;

    {
        hctr++;
    }

    Hardware() {
    };

    Hardware(String man, String cat) {
        manufacturer = man;
        category = cat;

    }

    public void sales() {
        System.out.println("Hardware sold:" + hctr);
    }
}

class Software implements money {
    static int sctr;
    String type;
    String OS;

    {
        sctr++;
    }

    Software() {
    };

    Software(String ty, String os) {
        type = ty;
        OS = os;
    }

    public void sales() {
        System.out.println("Software sold:" + sctr);
    }
}

public class Q1HS {
    public static void main(String[] args) {

        Software s = new Software("a", "b");
        Hardware h = new Hardware("c", "d");
        Software s1 = new Software();
        Hardware h1 = new Hardware();
        Software s2 = new Software();

        s.sales();
        h.sales();

    }
}
