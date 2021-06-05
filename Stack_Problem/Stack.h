//
// Created by LEON on 03/06/2021.
//

#ifndef STACK_PROBLEM_STACK_H
#define STACK_PROBLEM_STACK_H



template<class type>
class Stack {
    struct node {
        type item;
        node *next;
    };
    int maxSize=0;
    int counter=0;
public:
    Stack() {}
    Stack(type value,int intial_size) {}
    int size(){}
    ~Stack(){}
    type& top(){}
    node *top_;
    void push(type newItem) {}
    bool isEmpty() {}
    void pop() {}
    void pop(type &stackTop) {}
    void getTop(type &stackTop) {}
    void Display() {}
};



#endif //STACK_PROBLEM_STACK_H
