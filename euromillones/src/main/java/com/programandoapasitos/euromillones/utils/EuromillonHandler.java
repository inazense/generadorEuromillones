package com.programandoapasitos.euromillones.utils;

import com.programandoapasitos.euromillones.dao.History;

import java.util.HashMap;

public class EuromillonHandler {

    private History history;
    private HashMap<Integer, Integer> numbersQty;
    private HashMap<Integer, Integer> starsQty;

    public EuromillonHandler()
    {
        this.history = new History();
        this.numbersQty = new HashMap<Integer, Integer>();
        this.starsQty = new HashMap<Integer, Integer>();
    }
}
