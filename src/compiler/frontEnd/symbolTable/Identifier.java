package compiler.frontEnd.symbolTable;

import compiler.CodePosition;
import compiler.frontEnd.types.Type;

public class Identifier {
  
  private final Type identType;
  private CodePosition codePos;
  
  public Identifier(Type type, CodePosition codePos) {
     this.identType = type;
     this.codePos = codePos;
  }
  
  public Type getType() {
    return identType;
  }
  
  public CodePosition getPosition() {
    return codePos;
  }
}