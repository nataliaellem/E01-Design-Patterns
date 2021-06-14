package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente){
        super(ingrediente);
    }


    public Ketchup(){
        super(null);
    }


    public String imprimeIngrediente() {
        String ingredientes = "Ketchup";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }


    public double valorDoIngrediente() {

        double valor = 1.0;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}