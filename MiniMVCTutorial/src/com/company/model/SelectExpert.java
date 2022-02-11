package com.company.model;
import java.util.*;
public class SelectExpert {
    public List getSelect(String nickname){
        List select = new ArrayList();
        if (nickname.equals("1")){
            select.add("Duong co nuong");
        }
        else if (nickname.equals("2")){
            select.add("duowng zui ze");
        }else select.add("duong");
        return select;
    }
}
