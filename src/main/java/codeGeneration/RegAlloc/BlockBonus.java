package codeGeneration.RegAlloc;

import parser.semantic.symboltable.Symbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fishlinghu on 2016/12/6.
 */
public class BlockBonus {
    public List<IrCodeExtend> IrList = new ArrayList<>();
    public BlockBonus nextBlock;
}