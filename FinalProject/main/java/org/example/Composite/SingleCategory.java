public class SingleCategory implements CategoryInterface {
    private String name;

    public SingleCategory(String name) {
        this.name = name;
    }

    @Override
    public void showCategory() {
        System.out.println("Category: " + name);
    }
}
