public class BarbacoaPizzaBuilder extends PizzaBuilder {
    @Override
    public void ponerNombre() {
        pizza.setNombre("Barbacoa");
    }
    @Override
    public void crearMasa() {
        pizza.setMasa("Grande");
    }
    @Override
    public void crearSalsa() {
        pizza.setSalsa("Barbecue");
    }
    @Override
    public void crearIngredientes() {
        pizza.setIngredientes("tomate, pechuga, cebolla, carne");
    }
}