class Bank {
    int ROI () {
        return 0;
    }
}
class SBI extends Bank {
    int ROI() {
        return 8;
    }
}
class ICICI extends Bank {
    int ROI() {
        return 7;
    }
}
class Axis extends Bank {
    int ROI() {
        return 9;
    }
}
public class RateOfInterrest {
    public static void main (String args[]) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        Axis axis = new Axis();
        System.out.println("ROI of SBI : "+(sbi.ROI()));
        System.out.println("ROI of ICICI : "+(icici.ROI()));
        System.out.println("ROI of Axis : "+(axis.ROI()));
    }
}