package com.workshop.springdemo.beans.compound;

public class Foo {
	private Fred fred;
    public Foo() {
        fred = new Fred();
    }
    public Fred getFred() {
        return fred;
    }
    public void setFred(Fred fred) {
        this.fred = fred;
    }
}
