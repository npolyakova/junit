public class Cat {

    private boolean hungry = true;

    public boolean getHungry() {
        return hungry;
    }

    public void setNotHungry() {
        hungry = false;
    }

    public void meow(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("meow");
        }
    }
}
