import jdk.jfr.Category;

public class SingleCategories implements CategoryInteface {
    private String name;

    public SingleCategories(String name){
        this.name = name;
    }

    @Override
    public void showCategory(){
        System.out.println("Category: " + name);
    }
}