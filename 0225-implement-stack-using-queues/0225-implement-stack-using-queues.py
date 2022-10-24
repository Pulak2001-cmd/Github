class MyStack:
    def __init__(self):
        self.qa = deque()
        self.qb = deque()

    def push(self, x: int) -> None:
        self.qa.append(x)

    def pop(self) -> int:
        self.flush()
        val = self.qa.popleft()
        self.swap()
        
        return val

    def top(self) -> int:
        self.flush()
        return self.qa[0]

    def empty(self) -> bool:
        return len(self.qa) < 1 and len(self.qb) < 1
    
    def flush(self):
        while len(self.qa) > 1:
            self.qb.append(self.qa.popleft())
    
    def swap(self):
        self.qa, self.qb = self.qb, self.qa


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()