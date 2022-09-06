package behavioral.observer;

import java.util.Stack;

public class Subscriber1 implements Subscriber {

    private String name;

    public Subscriber1(String name) {
        this.name = name;
    }

    @Override
    public void newContentAvailable(Content content) {
        System.out.println("Subscriber1: new content update: " + content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber1 that = (Subscriber1) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        final String parenthesis = "({})";
        System.out.println("isValid = " + isValid(parenthesis));
    }

    private static boolean isValid(String parenthesis) {
        final char[] chars = parenthesis.toCharArray();
        Stack<Character> stack = new Stack<>();

        if (chars.length % 2 != 0 || chars[0] == '}' || chars[0] == ')') {
            return false;
        }

        for (char elem : chars) {
            if (elem == '(' || elem == '{') {
                stack.push(elem);
            } else {
                final char top = stack.lastElement();

                if (top == '(' && elem == ')' || (top == '{' && elem == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        System.out.println("stack.size() = " + stack.size());
        return stack.isEmpty();
    }


}
