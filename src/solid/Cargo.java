package solid;

import solid.calculoSalario.DezOuVintePorCento;
import solid.calculoSalario.QuinzeOuVinteCincoPorcento;
import solid.calculoSalario.RegraDeCalculo;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private final RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra(){
        return regra;
    }
}
