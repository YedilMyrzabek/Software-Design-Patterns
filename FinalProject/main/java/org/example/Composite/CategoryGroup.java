import java.util.ArrayList;
import java.util.List;

public class CategoryGroup implements CategoryInteface{
    private String name;
    private List<CategoryInteface> categories = new ArrayList<>();

    public CategoryGroup(String name){
        this.name = name;
    }

    public void addCategory(CategoryInteface categoryInteface){
        categories.add(categoryInteface);
    }

    @Override
    public void showCategory(){
        System.out.println("Category group: " + name);
        for (CategoryInteface categoryInteface : categories){
            categoryInteface.showCategory();
        }
    }
}
