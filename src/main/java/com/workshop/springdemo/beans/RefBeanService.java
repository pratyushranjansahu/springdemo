package com.workshop.springdemo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

public interface RefBeanService  extends Ordered {
    String getStr ();
}
