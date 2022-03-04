import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(string[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCmila = new Dev();
        devCmila.setNome("Camila");
        Dev devCamila;
        devCamila.inscreverBootcamp(bootcamp)
        System.out.println("conteudos Inscritos Camila:" + devCmila.getConteudosInscritos());

        devCamila.progredir();
        System.out("-");
        System.out.println("conteudos Inscritos Camila:" + devCmila.getConteudosInscritos());
        System.out.println("conteudos Concluidos Camila:" + devCmila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXp());

        System.out("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp)
        System.out.println("conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out("-");
        System.out.println("conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXp());


    }
}
