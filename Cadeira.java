import java.util.Scanner;

class Cadeira {
    String encosto;
    String acento;
    String rodinha;
    String apoiodeBraco;

    // Getter e Setter para encosto
    public String getEncosto() {
        return encosto;
    }

    public void setEncosto(String encosto) {
        this.encosto = encosto;
    }

    // Getter e Setter para acento
    public String getAcento() {
        return acento;
    }

    public void setAcento(String acento) {
        this.acento = acento;
    }

    // Getter e Setter para rodinha
    public String getRodinha() {
        return rodinha;
    }

    public void setRodinha(String rodinha) { 
        this.rodinha = rodinha;
    }

    // Getter e Setter para apoio de braço
    public String getApoiodeBraco() {  
        return apoiodeBraco;
    }

    public void setApoiodeBraco(String apoiodeBraco) {
        this.apoiodeBraco = apoiodeBraco;
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadeira cadeira = new Cadeira();
        
        System.out.println("Digite o tipo de encosto: ");
        cadeira.setEncosto(scanner.nextLine());

        System.out.println("Digite o tipo de acento: ");
        cadeira.setAcento(scanner.nextLine());

        System.out.println("Digite o tipo de rodinha: ");
        cadeira.setRodinha(scanner.nextLine());

        System.out.println("Digite o tipo de apoio de braço: ");
        cadeira.setApoiodeBraco(scanner.nextLine());

        // Exibindo os dados da cadeira
        System.out.println("-- Dados da cadeira --");
        System.out.println("Encosto: " + cadeira.getEncosto());
        System.out.println("Acento: " + cadeira.getAcento());
        System.out.println("Rodinha: " + cadeira.getRodinha());
        System.out.println("Apoio de braço: " + cadeira.getApoiodeBraco());  

        scanner.close();
    }
}