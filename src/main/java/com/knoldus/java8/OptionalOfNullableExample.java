package com.knoldus.java8;

import java.util.Optional;

public class OptionalOfNullableExample {

    public static void main(String[] args) {

        A objA = new A(1, "Shashi");
        Optional<A> optional = Optional.of(objA);
        System.out.println(optional.map(e -> new B(e.getId(), e.getName()))
                .orElse(new B())); // Output : B [id=1, name=Shashi]

        Optional<A> optionalOfNull = Optional.empty();

        System.out.println(optionalOfNull.map(
                e -> new B(e.getId(), e.getName())).orElse(new B())); // Output : B [id=0, name=null]
    }
}

class A {

    private int id;
    private String name;

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A [id=" + id + ", name=" + name + "]";
    }
}

class B {

    private int id;
    private String name;

    public B() {

    }

    public B(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B [id=" + id + ", name=" + name + "]";
    }

}
