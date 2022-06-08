import javax.print.attribute.standard.Media;

import org.omg.CORBA.SystemException;

public class boletim 
{
       public static void main(String[]args) 
    {
        Alunosdj a1 = new Alunosdj();
       a1.nome = "Lua";
       a1.Mnota1 = 10;
       a1. Mnota2 = 9.50f;
       a1. Mnota3 = 8;
       a1.media = ((a1.Mnota1 + a1.Mnota2 + a1.Mnota3) / 3);
       a1.Fnota1 = 9.75f;
       a1.serie = "segundo";
       a1.turma = "2-11";
       a1.periodo = "integral";  
       Alunosdj a2 = new Alunosdj();
       a2.nome = "Larrisa";
       a2.Mnota1 = 9.50f;
       a2. Mnota2 = 8;
       a2. Mnota3 = 10;
       a2.media = ((a2.Mnota1 + a2.Mnota2 + a2.Mnota3) / 3);
       a2.Fnota1 = 9.75f;
       a2.serie = "segundo";
       a2.turma = "2-11";
       a2.periodo = "integral";
       Alunosdj a3 = new Alunosdj();
       a3.nome = "Louei";
       a3.Mnota1 = 10;
       a3. Mnota2 = 6;
       a3. Mnota3 =7.50f;
       a3.media = ((a3.Mnota1 + a3.Mnota2 + a3.Mnota3) / 3);
       a3.Fnota1 = 10;
       a3.serie = "segundo";
       a3.turma = "2-11";
       a3.periodo = "integral";   
       Alunosdj a4 = new Alunosdj();
       a4.nome = "Carlos";
       a4.Mnota1 = 10;
       a4. Mnota2 = 9;
       a4. Mnota3 = 9;
       a4.Fnota1 = 10;
       a4.serie = "segundo";
       a4.turma = "2-52 ";
       a4.periodo = "manhã"; 
    //1   
     System.out.println("Aluno 1: " + a1.nome + "  Periodo:"  + a1.periodo);  
     System.out.println("Aluno 2: " + a2.nome + "  Periodo:"  + a2.periodo);  
     System.out.println("Aluno 3: " + a3.nome + "  Periodo:"  + a3.periodo);
     System.out.println("----------------------------------------------------------------------------");
    //2
     System.out.println("Aluno:" + a4.nome + "  Periodo:"  + a4.periodo + "  Turma:" + a4.turma + "Nota:" + a4.Fnota1);
     System.out.println("----------------------------------------------------------------------------");
    //3
    
    System.out.println("Aluno 1: " + a1.nome + "  Matematica:"  + a1.media);  
    System.out.println("Aluno 2: " + a2.nome + "  Matematica:"  + a2.media);  
    System.out.println("Aluno 3: " + a3.nome + "  Matematica:"  + a3.media);     
    }    
}
