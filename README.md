# dequemylife
App to organize daily tasks

## High level spec: 
### Backend requirements: @arushi
- Create a robust Queue that can perform the following operations: 
    - enqueue(T item) -> adds item to the end of the queue
    - dequeue() -> returns T. The T will be determined later.
        - IMP: dequeue() must NOT return null. If the queue is Empty -> return string: "queue is empty" 
    - printQueue() -> The type T stored in Queue will have it's own toString() method implemented that can be used to print the queue. Assume you can call this toString() method.
    - size() -> returns the number of elements in the queue

- File I/O: 
    - Queue should be stored as a csv with each line containing: 
        - enqueue time
        - text (content)
        

Common Test cases: 
- Enqueue 1 element 
- Enqueue n elements (like 42: meaning of life)
- Dequeue a filled queue
- Dequeue an empty queue
- Print a filled queue
- Print an empty queue

### Frontend requirements: @karan
- set layout in Java Swing
    - enqueue button 
    - enqueue text box - 1 line
    - deque button
    - deque text area - many lines
    - print queue button -> prints out to a file (implementation can change)
    
- package as a jar
    - make sure the UI fires up
    - the text boxes next buttons update when button is pressed
    
