package org.sonar.plugins.groovy.codenarc;

import org.codehaus.groovy.ast.expr.VariableExpression;
import org.codenarc.rule.AbstractAstVisitor;


public class DynamicTypedAstVisitor extends AbstractAstVisitor  {

    @Override
    public void visitVariableExpression(VariableExpression expression) {
        if (!expression.isDynamicTyped()) {
            addViolation(expression, "The variable should be declared with def identifier (dynamic typed)");
        }
        super.visitVariableExpression(expression);
    }
}
