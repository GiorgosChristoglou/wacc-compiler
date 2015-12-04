package compiler.backEnd.instructions;

// Visits instructions and generates assembly code accordingly.

public class PrintingInstrVisitor implements InstructionVisitor<String> {
  
  private String ident(int tabs) {
    String str = "\n";
    for (int i = 0; i < tabs; i++) {
      str += "\t";
    }
    return str;
  }
  
  // For all the subtypes of Instruction (MOV, MUL, CMP, B etc.) the printing 
  // message depends only on the toString() method of that instruction. For
  // that reason we don't need to make a visit method for each type.
  
  @Override
  public String visit(Instruction instr) {
    return ident(4) + instr.toString();
  }
  
  @Override
  public String visit(AssemblerDirective dir) {
    return ident(2) + dir.toString();
  }

}