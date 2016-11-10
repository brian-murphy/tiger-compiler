package parser.semantic.symboltable;

import parser.semantic.ir.Label;

/**
 * Created by Brian on 10/20/2016.
 */
public interface SymbolTable {

    SymbolTable getParentScope();

    SymbolTable getChildScope(Symbol symbolDefiningChildScope);

    Symbol lookup(String name);

    void insert(Symbol symbol);

    SymbolTable createChildScope(Symbol symbolDefiningChildScope);

    Symbol newTemporary();

    Label newLabel();
}