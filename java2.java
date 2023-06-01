public class java2 {
    public static void main(String[] args) {
      caneta c1 = new caneta();
      c1.cor = "Azul";  
      c1.ponta = 0.5f;
      c1.tampar();


      c1.status();
      c1.rabiscar();
      

      caneta c2 = new caneta();
      c2.modelo = "BIC";
      c2.cor = "preta";
      c2.status();
      c2.destampar();
      c2.rabiscar();
    }
}