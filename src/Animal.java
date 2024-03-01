public abstract class Animal {
    protected String name;
    public abstract void voice();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("murzik")){
            System.out.println("no no no!");
        }else {
            this.name = name;
        }

    }
}
