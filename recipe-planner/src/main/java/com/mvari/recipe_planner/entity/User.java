package  com.mvari.recipe_planner.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(value= GenerationType.IDENTITY)
    private Lond id;

    @Column(nullable=false)
    private String name;

    private String email;

    private DietaryPreference dietaryPreference;

    private List<MealPlan> mealPlans = new ArrayList<>();

    private Cuisine favoriteCuisine;

    




}