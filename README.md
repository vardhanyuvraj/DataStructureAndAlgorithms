
# Data Structures and Algorithms

This repository contains Java code related to various Data Structures and Algorithms.

## Data Structures
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


## Feedback

If you have any feedback, please reach out to me at vardhan.yuvraj.singh@gmail.com

