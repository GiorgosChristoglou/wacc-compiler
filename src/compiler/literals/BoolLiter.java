package compiler.literals;

import compiler.CodePosition;
import compiler.semanticCheck.ReturnableType;
import compiler.types.BaseType;

public class BoolLiter implements Liter {
  
  private final String value;
  private final CodePosition codePos;
  
  public BoolLiter(String value, CodePosition codePos) {
    this.value = value;
    this.codePos = codePos;
  }

  @Override
  public CodePosition getPosition() {
    return codePos;
  }

  @Override
  public ReturnableType getType() {
    return BaseType.typeBool;
  }

  @Override
  public String getString() {
    return value;
  }

}
