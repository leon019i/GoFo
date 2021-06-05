//
// Created by LEON on 04/06/2021.
//

#ifndef STACK_PROBLEM_WITH_ARRAY_STACK_H
#define STACK_PROBLEM_WITH_ARRAY_STACK_H

template<class type>
class Stack {
    Stack() {}
    Stack(type value, int intial_size){}
    ~Stack();
    type& top();
};


#endif //STACK_PROBLEM_WITH_ARRAY_STACK_H
