import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso jas");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCris = new Dev();
        devCris.setNome("Cris");
        devCris.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Cris:" + devCris.getConteudosInscritos());
        devCris.progredir();
        devCris.progredir();
        System.out.println("Conteudos Inscritos Cris:" + devCris.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Cris:" + devCris.getConteudosConcluidos());
        System.out.println("XP:" + devCris.calcularTotalXp());


        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("Conteudos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rafael:" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

    }
}
