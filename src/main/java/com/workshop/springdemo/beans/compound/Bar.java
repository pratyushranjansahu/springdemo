package com.workshop.springdemo.beans.compound;

public class Bar {
	private Foo foo;
    public Bar() {
        foo = new Foo();
    }
    public Foo getFoo() {
        return foo;
    }
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
