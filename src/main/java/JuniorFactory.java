
package abstractFactory;

public class JuniorFactory implements AbstractFactory {

    @Override
    public Contract createContract() {
        return new ContractJunior();
    }

    @Override
    public Gain createGain() {
        return (Gain) new JuniorGain();
    }

}