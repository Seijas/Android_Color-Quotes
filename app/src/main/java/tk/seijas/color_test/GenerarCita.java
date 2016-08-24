package tk.seijas.color_test;

import java.util.Random;

/**
 * Created by Seijas on 24/08/2016.
 */
public class GenerarCita {

    private Cita[] citas;

    public GenerarCita(){

        citas = new Cita[5];

        citas[0] = new Cita("Las cosas no se dicen, se hacen, porque al hacerlas se dicen solas",
                            "Woody Allen");
        citas[1] = new Cita("Ninguna persona merece tus lagrimas, y quien se las merezca no te hará llorar",
                            "Gabriel Garcia Marquez");
        citas[2] = new Cita("Si nada nos salva de la muerte, al menos que el amor nos salve de la vida",
                            "Pablo Neruda");
        citas[3] = new Cita("La inteligencia militar es una contradicion en terminos",
                            "Groucho Marx");
        citas[4] = new Cita("La sonrisa es el idioma universal de los inteligentes",
                            "Tomás de Irriarte");
    }

    public Cita getRandomCita(){
        return citas[(new Random()).nextInt(citas.length)];
    }


}
