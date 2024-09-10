import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java.");
        curso1.setDescricao("Descrição curso java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js.");
        curso2.setDescricao("Descrição curso js.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao da mentoria java.");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do bootcamp.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriel");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos Concluidos " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("======================");
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluidos " + dev2.getNome() + " " + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}