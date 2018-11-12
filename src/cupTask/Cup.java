package cupTask;

class Cup<T extends Drink> {
    private T drink;

    public Cup(T drink) {
        this.drink = drink;
    }

    public T getDrink() {
        return drink;
    }

    public void setDrink(T drink) {
        this.drink = drink;
    }
}
