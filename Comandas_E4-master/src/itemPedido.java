public class itemPedido {
    private Object item;
    private int cantidad;

    public itemPedido(Object item, int cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }


    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        if (item instanceof Platos) {
            //Calculamos la cantidad ordenada por el precio del plato y la devolvemos
            return ((Platos) item).getPrecioPlato() * cantidad;
        } else if (item instanceof Bebidas) {
            //Calculamos la cantidad ordenada por el precio del plato y la devolvemos
            return ((Bebidas) item).getPrecioBebida() * cantidad;
        }
        //Si estan vacíos Platos o Bebidas devuelve 0
        return 0;
    }

    @Override
    public String toString() {
        return "Pedido Cliente:" +
                "\nPedido → " + item +
                "\nCantidad → " + cantidad +
                "\nTotal =  " + getPrecio() + "€";
    }
}
