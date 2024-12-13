package atividade;
/**
 *
 * @author Dheniel Rodrigues Luis
 * @since 08/12/2024 20:10 PM
 */
public class MediaAluno {

    private double nota1, nota2, nota3, nota4, media;

    /**
     *
     * @return Método para calcular e media de todas as quatros notas.
     * @param nota1 recebe a primeira nota.
     * @param nota2 recebe a segunda nota.
     * @param nota3 recebe a terceira nota.
     * @param nota4 recebe a quarta nota.
     * @throws ArithmeticException
     * @since 08/12/2024 20:35 PM
     */
    public double setcalcularMedia(double nota1, double nota2, double nota3, double nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        
        try {
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A media e: " + media);
        }catch (ArithmeticException e){
            System.out.println("Erro ao calular a media");
        }
        return 0;
    }
    /**
     *
     * @return Método para verificar se a media de todas as quatros notas está acima 
     * ou abaixo de 6, determinando, respectivamente se o aluno está aprovado ou reprovado.
     * @param media recebe a media caculado no método setCalcularMedia.
     * @throws ArithmeticException
     * @since 08/12/2024 20:35 PM
     */
    public void getmostrarMedia(){
        try {
            if (media >= 6){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
        }catch (ArithmeticException e){
            System.out.println("Erro");
        }
    }
  
}
