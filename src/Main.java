import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Curso Desc");
        curso1.setCargaHoraria(360);
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Curso 2 Desc");
        curso2.setCargaHoraria(360);

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("mentoria 1");
        mentoria1.setDescricao("mentoria 1 Desc");
        mentoria1.setData(LocalDate.now());
//        mentoria2.setTitulo("mentoria 2");
//        mentoria2.setDescricao("mentoria 2 Desc");
//        mentoria2.setCargaHoraria(360);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
