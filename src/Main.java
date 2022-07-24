import dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Michelle");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Michelle: " + dev1.getConteudoInscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos incritos Michelle: " + dev1.getConteudoInscrito());
        System.out.println("Conteúdos concluídos Michelle: " + dev1.getConteudoConcluido());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println(" ");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Camila: " + dev2.getConteudoInscrito());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println(" ");
        System.out.println("Conteúdos incritos Camila: " + dev2.getConteudoInscrito());
        System.out.println("Conteúdos concluídos Camila: " + dev2.getConteudoConcluido());



    }
}
