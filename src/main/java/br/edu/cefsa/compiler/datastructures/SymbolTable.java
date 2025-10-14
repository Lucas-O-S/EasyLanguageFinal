package br.edu.cefsa.compiler.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

// Tabela de símbolos
public class SymbolTable {

    private HashMap<String, Symbol> map;

    public SymbolTable() {
        map = new HashMap<>();
    }

    public void add(Symbol symbol) {
        map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return map.containsKey(symbolName);
    }

    public Symbol get(String symbolName) {
        return map.get(symbolName);
    }

    public ArrayList<Symbol> getAll() {
        return new ArrayList<>(map.values());
    }
}
