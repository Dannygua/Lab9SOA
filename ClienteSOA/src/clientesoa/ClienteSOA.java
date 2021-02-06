
package clientesoa;



public class ClienteSOA {

    public static void main(String[] args) {
        System.out.println("RESULTADO: "+cuadrado(5,8));
       
    }

    private static double cuadrado(double lado1, double lado2) {
        uddi.Figuras_Service service = new uddi.Figuras_Service();
        uddi.Figuras port = service.getFigurasPort();
        return port.cuadrado(lado1, lado2);
    }

    private static double triangulo(double lado1, double lado2) {
        uddi.Figuras_Service service = new uddi.Figuras_Service();
        uddi.Figuras port = service.getFigurasPort();
        return port.triangulo(lado1, lado2);
    }
    
}
