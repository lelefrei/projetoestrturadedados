package projeto.de.ed;

import java.util.*;
import javax.swing.JOptionPane;

public class Methods {
    private ArrayList<Atleta> listaAtletas = new ArrayList<>();
    private Stack<Atleta> pilhaMulheres = new Stack<>();
    private Queue<Atleta> filaHomens = new LinkedList<>();

    public void cadastrarAtleta(String nome, char sexo, String pais, double altura) {
        
        
        if (nome == null || sexo == 0 || pais == null || altura == 0) {
          
        } else {
            
            Atleta novoAtleta = new Atleta(nome, sexo, pais, altura);
            listaAtletas.add(novoAtleta);
            JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso!.", "Cadastro de Atletas", JOptionPane.INFORMATION_MESSAGE);
            
            if (sexo == 'F') {
            pilhaMulheres.push(novoAtleta);
            
        } else {
            filaHomens.add(novoAtleta);
        }
    }
        
    }


    public String listarDados(){

        StringBuilder exibir = new StringBuilder();

        for (Atleta atleta : listaAtletas) {
            exibir.append(atleta.getNome()).append("\t");
            exibir.append(atleta.getSexo()).append("\t");
            exibir.append(atleta.getPais()).append("\t");
            exibir.append(atleta.getAltura()).append("\t");
            exibir.append("\n");
        }

        return exibir.toString();
    }

    public double calcularMedia(){

        double somaAlturas = 0;
        int numAtletas = listaAtletas.size();
        
        for (Atleta atleta : listaAtletas) {
            somaAlturas += atleta.getAltura();
        }

        if (numAtletas > 0) {
            
            double Magneto = 0;
            Magneto = somaAlturas / numAtletas;
            return Magneto;
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

public String encontrarMulherAltura() {

    Atleta maiorMulher = null;
    StringBuilder exibir = new StringBuilder();

    for (Atleta atleta : pilhaMulheres) {
        if (maiorMulher == null || atleta.getAltura() > maiorMulher.getAltura()) {
            maiorMulher = atleta;
        }
    }

    if (maiorMulher == null) {
        JOptionPane.showMessageDialog(null, "Não há atletas femininas cadastradas.", "Erro", JOptionPane.ERROR_MESSAGE);
    } else {
        exibir.append(maiorMulher.getNome()).append("\t");
        exibir.append(maiorMulher.getSexo()).append("\t");
        exibir.append(maiorMulher.getPais()).append("\t");
        exibir.append(maiorMulher.getAltura()).append("\t");
    }

    return exibir.toString();
}


    public double calcularMediaBrasileiros() {

        double somaAlturas = 0;
        int numHomens = 0;
        

        
        for (Atleta atleta : filaHomens) {
            if (atleta.getSexo() == 'M' && atleta.getPais().equals("Brasil")) {
                somaAlturas += atleta.getAltura();
                numHomens++;
            }
        }
        
        System.out.println(numHomens);
        System.out.println(somaAlturas);

        if (numHomens > 0) {
            
            double Magneto = 0;
            Magneto = somaAlturas / numHomens;
            return Magneto;
        } else {
            JOptionPane.showMessageDialog(null, "Não há atletas masculinos brasileiros cadastrados.", "Erro", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public void retirarPilhaMulheres() {
    
        pilhaMulheres.pop();
        JOptionPane.showMessageDialog(null, "Pilha de mulheres retirada com sucesso!", "Pilha Mulheres", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String listarPilha(){

        StringBuilder exibir = new StringBuilder();

        for (Atleta atleta : pilhaMulheres) {
            exibir.append(atleta.getNome()).append("\t");
            exibir.append(atleta.getSexo()).append("\t");
            exibir.append(atleta.getPais()).append("\t");
            exibir.append(atleta.getAltura()).append("\t");
            exibir.append("\n");
        }


        return exibir.toString();
    }
    
    
    public void retirarFilaHomens() {
        filaHomens.remove();
        JOptionPane.showMessageDialog(null, "Fila de homens retirada com sucesso!", "Fila Homens", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String listarHomens(){

        StringBuilder exibir = new StringBuilder();

        for (Atleta atleta : filaHomens) {
            exibir.append(atleta.getNome()).append("\t");
            exibir.append(atleta.getSexo()).append("\t");
            exibir.append(atleta.getPais()).append("\t");
            exibir.append(atleta.getAltura()).append("\t");
            exibir.append("\n");
        }

        return exibir.toString();
    }

}
