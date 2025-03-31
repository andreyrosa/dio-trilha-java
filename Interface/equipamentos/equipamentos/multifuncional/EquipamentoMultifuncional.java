package Interface.equipamentos.equipamentos.multifuncional;

import Interface.equipamentos.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
