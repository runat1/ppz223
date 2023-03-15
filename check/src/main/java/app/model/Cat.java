package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    public Cat(){}
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
