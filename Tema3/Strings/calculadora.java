package Strings;

public class calculadora {
    public static boolean esOperacionValida (String linea){
        String [] elementos = Utilidades.dividirEnPalabras(linea);

        if (elementos.length == 3){
            if (isDouble(elementos[0]) && isOpeartor(elementos[1]) && isDouble(elementos [2])){
            }
            }else{
                return false;
        }
        return true;
    }
    public static boolean isDouble (String str){
        try{
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException error){
            return false;
        }   
    }

    public static boolean isOpeartor( String operator){
        switch(operator){
            case "+":
            case "-":
            case "x":
            case "X":
            case "/":
                return true;
            default:
            return false;
        }
    }
    public static double calcularResultado (String lineas){
        String [] elementos = Utilidades.dividirEnPalabras(lineas);
        double resultado = 0;

        double op1 = Double.parseDouble(elementos[0]);
        double op2 = Double.parseDouble(elementos[2]);

        switch(elementos[1]){
            case "+":
            resultado = op1 + op2;
            break;
            case "-":
            resultado = op1 - op2;
            break;
            case "x":
            case "X":
            resultado = op1*op2;
            break;
            case "/":
            resultado = op1/op2;
            break;
        }
        return resultado;
    }
    public static void main(String[] args) {

    }
}
