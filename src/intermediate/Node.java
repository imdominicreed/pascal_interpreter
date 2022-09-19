/**
 * Parse tree node class for a simple interpreter.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package intermediate;

import java.util.ArrayList;

public class Node
{
    public enum NodeType
    {
        PROGRAM, COMPOUND, ASSIGN, LOOP, TEST, WRITE, WRITELN,
        ADD, SUBTRACT, MULTIPLY, DIVIDE, AND_OP, OR_OP, MODULUS, EQ, LT, LE, GE, GT, NE,
        VARIABLE, INTEGER_CONSTANT, REAL_CONSTANT, STRING_CONSTANT, NOT_OP, IF_STATEMENT, NEGATE, POSITIVE
    }

    public NodeType type;
    public int lineNumber;
    public String text;
    public SymtabEntry entry;
    public Object value;
    public ArrayList<Node> children;
    
    /**
     * Constructor
     * @param type node type.
     */
    public Node(NodeType type)
    {
        this.type = type;
        this.lineNumber = 0;
        this.text = null;
        this.entry = null;
        this.value = null;
        this.children = new ArrayList<Node>();
    }
    
    /**
     * Adopt a child node.
     * @param child the child node.
     */
    public void adopt(Node child) { children.add(child); }
}
