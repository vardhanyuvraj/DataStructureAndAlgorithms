
# Data Structures and Algorithms

This repository contains Java code related to various Data Structures and Algorithms.

## Data Structures

## Linked List
### [Singly Linked List](https://github.com/vardhanyuvraj/DataStructureAndAlgorithms/tree/main/src/LinkedList/SinglyLinkedList)
This SinglyLinkedList class is an implementation of a singly linked list data structure. The linked list consists of nodes that are linked together in a sequence. Each node in the list contains a reference to the next node in the sequence. The list maintains a reference to the head node of the sequence.

The following operations can be performed on this singly linked list:

- insertAtBegin(int data): inserts a new node with the given data at the beginning of the list
- insertAtEnd(int data): inserts a new node with the given data at the end of the list
- insertAtPosition(int position, int data): inserts a new node with the given data at the specified position in the list
- deleteANode(int position): deletes the node at the specified position in the list
- displayList(): returns a string representation of the contents of the list
- getListLength(): returns the length of the linked list
- isListEmpty(): checks if the linked list is empty

Note that this implementation also includes a SinglyNode class, which represents a node in the linked list.


### [Doubly Linked List](https://github.com/vardhanyuvraj/DataStructureAndAlgorithms/tree/main/src/LinkedList/DoublyLinkedList)
This package contains the implementation of a Doubly Linked List data structure.

The doubly linked list is a type of data structure that consists of nodes that are linked together in a sequence. Each node in the list contains a reference to the previous node and the next node in the sequence. The list maintains a reference to the first node in the sequence, called the head, and the last node in the sequence, called the tail.

The following operations can be performed on a doubly linked list:

- getListLength(): returns the length of the linked list
- isListEmpty(): checks if the linked list is empty
- toString(): overrides the toString() method to display the linked list as a string
- insertAtEnd(int data): inserts a new node with the given data at the end of the linked list
- insertAtStart(int data): inserts a new node with the given data at the start of the linked list
- deleteAtPosition(int position): deletes a node at a given position in the linked list

The DoublyLinkedList class is implemented using the DoublyNode class, which represents a node in the linked list. Each node contains a data field and two pointers: prev and next. The prev pointer points to the previous node in the linked list, and the next pointer points to the next node in the linked list.


## Stack
### [Stack Using Simple Array](https://github.com/vardhanyuvraj/DataStructureAndAlgorithms/tree/main/src/Stack/UsingSimpleArray)

The SimpleArrayStack class represents a simple implementation of the Stack data structure using a simple array. A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle, where the last element inserted is the first one to be removed. The SimpleArrayStack implementation consists of an integer array called stack and a top variable to keep track of the top element in the stack.

The following operations can be performed on the SimpleArrayStack:

- push(int data) - adds an element to the top of the stack
- pop() - removes the top element from the stack
- peek() - returns the top element of the stack without removing it
- printStack() - returns a string representation of the stack
- isStackEmpty() - returns a boolean indicating whether the stack is empty
- isStackFull() - Returns a boolean indicating whether the stack is full

To use the SimpleArrayStack, create a new object of the SimpleArrayStack class with the desired size of the stack. Then, you can use the available methods to add, remove or view elements in the stack.


### [Stack using Linked List](https://github.com/vardhanyuvraj/DataStructureAndAlgorithms/tree/main/src/Stack/UsingLinkedList)
This code implements a Stack data structure using a linked list. A stack is a Last-In-First-Out (LIFO) data structure where elements can be added or removed only from the top of the stack.

The StackUsingLinkedList class consists of:

- head - a pointer to the first element of the linked list
- top - a pointer to the top of the stack
- push() - method to add an element to the top of the stack
- pop() - method to remove the top element from the stack
- peek() - method to return the value of the top element without removing it
- isStackEmpty() - method to check whether the stack is empty or not
- displayStack() - method to display the elements of the stack

Create an instance of the StackUsingLinkedList class and use the push(), pop(), peek(), isStackEmpty(), and displayStack() methods to manipulate the stack.


### [Stack using Dynamic Array](https://github.com/vardhanyuvraj/DataStructureAndAlgorithms/tree/main/src/Stack/UsingDynamicArray)
This code implements a Stack data structure using a dynamic array. A stack is a Last-In-First-Out (LIFO) data structure where elements can be added or removed only from the top of the stack.

The DynamicArrayStack class consists of:

- push(int data) - method to add an element to the top of the stack
- pop() - method to remove the top element from the stack
- peek() - method to return the value of the top element without removing it
- isStackEmpty() - method to check whether the stack is empty or not
- printStack() - method to return a string representation of the stack

Create an instance of the DynamicArrayStack class and use the push(int data), pop(), peek(), isStackEmpty(), and printStack() methods to manipulate the stack.
# Feedback

If you have any feedback, please reach out to me at vardhan.yuvraj.singh@gmail.com

