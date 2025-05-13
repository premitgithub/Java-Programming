package Stacks;

import java.util.Stack;

public class Reverse_Stack_p1_30
{
    public static void pushAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=5;i++)
        {
            s.push(i);
        }
        printStack(s);
        reverse(s);
        printStack(s);
    }
}
