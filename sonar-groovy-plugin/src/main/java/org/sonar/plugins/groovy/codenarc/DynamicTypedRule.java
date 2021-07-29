package org.sonar.plugins.groovy.codenarc;

import org.codenarc.rule.AbstractAstVisitorRule;


public class DynamicTypedRule extends AbstractAstVisitorRule {

    public Class getAstVisitorClass() { return DynamicTypedAstVisitor.class; }

    @Override
    public String getName() {
        return "NotDynamicTyped";
    }

    @Override
    public void setName(String name) {}

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void setPriority(int priority) {}
}
