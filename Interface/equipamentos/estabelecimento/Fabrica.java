package Interface.equipamentos.estabelecimento;

import Interface.equipamentos.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.equipamentos.digitalizadora.Scanner;
import Interface.equipamentos.equipamentos.impressora.Deskjet;
import Interface.equipamentos.equipamentos.impressora.Impressora;
import Interface.equipamentos.equipamentos.impressora.Laserjet;
import Interface.equipamentos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
