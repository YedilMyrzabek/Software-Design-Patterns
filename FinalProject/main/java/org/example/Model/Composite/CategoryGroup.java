package org.example.Model.Composite;

import java.util.ArrayList;
import java.util.List;

public class CategoryGroup implements CategoryInterface {
    private String name;
    private List<CategoryInterface> categories = new ArrayList<>();

    public CategoryGroup(String name) {
        this.name = name;
    }

    public void addCategory(CategoryInterface category) {
        categories.add(category);
    }

    @Override
    public void showCategory() {
        System.out.println("Category group: " + name);
        for (CategoryInterface category : categories) {
            category.showCategory();
        }
    }
}
