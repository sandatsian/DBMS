package app.Columns;

import app.Cell;
import app.types.CharInvl;
import app.types.Type;

public class CharInvlColumn extends Column{
    public CharInvlColumn(String name){
        this.name = name;
    }
    @Override
    public Type getType() {
        return Type.CHARINVL;
    }

    @Override
    public Cell getDefault() {
        return new Cell(new CharInvl());
    }
    @Override
    public Boolean validateValue(String value) {
        return CharInvl.parseString(value) != null;
    }
}
