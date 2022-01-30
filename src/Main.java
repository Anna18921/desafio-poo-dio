import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        mentoria1.setTitulo("mentoria 1");
        mentoria1.setDescricao("mentoria 1 Desc");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Bootcamp 1");
        bootcamp.setDescricao("Bootcamp 1 Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Dev 1");
        dev1.increverBootcamp(bootcamp);
        dev2.setNome("Dev 2");
        dev2.increverBootcamp(bootcamp);

        System.out.println("Dev 1 Conteudos inscritos " + dev1.getConteudosInscritos());
        System.out.println("Dev 2 Conteudos inscritos " + dev2.getConteudosInscritos());

        dev1.progredir();
        dev2.progredir();

        System.out.println("Dev 1 Conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("Dev 2 Conteudos concluidos " + dev2.getConteudosConcluidos());

        System.out.println("Dev 1 XP " + dev1.calcularTotalXp());
        System.out.println("Dev 2 XP " + dev2.calcularTotalXp());

        System.out.println("Dev 1 Conteudos inscritos " + dev1.getConteudosInscritos());
        System.out.println("Dev 2 Conteudos inscritos " + dev2.getConteudosInscritos());

    }
}
