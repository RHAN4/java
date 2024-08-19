package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motoboy motoboyFun = new Motoboy("Ronaldo", "748596325-25", "18956874115",
                "1400", "A");
        Engenheiro engenheiroFun = new Engenheiro("Felipe", "147852963-85", "78556741010",
                "8000", "4444");
        Medico medicoFun = new Medico("Cássio", "720968415-00", "52163298717",
                "10000", "8888");

        System.out.println(motoboyFun);
        System.out.println(engenheiroFun);
        System.out.println(medicoFun);

    }
}