//
// Created by LEON on 03/06/2021.
//
#include "Stack.h"

Stack() {
    top_ = NULL;
}

Stack<class type>::Stack(type value, int intial_size) {
    node* newNode=new node;
    newnode->item=value;
    newnode->next=top;
    top_=newnode;
    maxSize = intial_size;
}

Stack<class type>::int size() {
    return counter;
}

Stack<class type>::~Stack() {}
Stack<class type>::node *top_;

Stack<class type>::type &top() {
    return top_->item;
}



void Stack<class type>:: push(type newItem) {
    if (maxSize == counter) {
        cout << "Stack is full" << endl;
    }
    node *newItemPtr = new node;
    newItemPtr->item = newItem;
    newItemPtr->next = top_;
    top_ = newItemPtr;
    counter++;
}

bool isEmpty() {
    if (top_ == NULL) {
        return true;
    } else {
        return false;
    }
}

void pop() {
    if (isEmpty()) {
        cout << "Stack is empty" << endl;
    } else {
        node *temp = new node;
        temp = top_;
        top = top_->next;
        temp = temp->next = NULL;
        delete temp;
    }
}

void pop(type &stackTop) {
    if (isEmpty()) {
        cout << "Stack is empty" << endl;
    } else {
        stackTop = top->item;
        node *temp = new node;
        temp = top_;
        top_ = top_->next;
        temp = temp->next = NULL;
        delete temp;
    }
}

void getTop(type &stackTop) {
    if (isEmpty()) {
        cout << "Stack is empty" << endl;
    } else {
        stackTop = top_->item;
    }
}

Stack<class type>void Display() {
    node *currentNode = top_;
    cout << "[";
    while (currentNode != NULL) {
        cout << currentNode->item << ", ";
        currentNode = currentNode->next;
    }

    cout << "]" << endl;
}

};

