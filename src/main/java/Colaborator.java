package abstractFactory;

public class Colaborator {

    private Contract contract;
    private Gain gain;

    public Colaborator(AbstractFactory factory) {
        this.contract = factory.createContract();
        this.gain = factory.createGain();
    }

    public String printContract() {
        return this.contract.returnData();
    }

    public String printGain() {
        return this.gain.returnData();
    }

}