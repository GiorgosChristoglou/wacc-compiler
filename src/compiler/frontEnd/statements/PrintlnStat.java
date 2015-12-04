package compiler.frontEnd.statements;

import compiler.CodePosition;
import compiler.frontEnd.expressions.Expr;

public class PrintlnStat extends Stat {
  
  private final Expr message;

  public PrintlnStat(Expr message, CodePosition codePos) {
    super(codePos);
    this.message = message;
  }

  @Override
  public CodePosition getPosition() {
    return codePos;
  }

}