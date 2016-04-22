class Node(object):
    def __init__(self,k,v):
        """
        :define a node keep key and value[int type]
        :define pre and nxt pointer[Node type]
        """
        self.key=k
        self.val=v
        self.pre=None
        self.nxt=None
            
class LRUCache(object):

    def __init__(self, capacity):
        """
        :type capacity: int
        """
        self.capacity=capacity #user defint the capacity
        self.num=0 # keep record the length of cache
        self.dic=dict()# value store the node<key,value>
        self.head=Node(0,0)#linked list head
        self.tail=Node(0,0)#linked list tail
        #initializa the double linked list
        self.head.nxt=self.tail
        self.tail.pre=self.head
        
    def get(self, key):
        """
        :rtype: int
        """
        #get key and update. put it to tail
        if key in self.dic:
            n=self.dic[key]
            res=n.val
            self.add(n)
            self.remove(n)
            return res
        else:
            return -1

    def set(self, key, value):
        """
        :type key: int
        :type value: int
        :rtype: nothing
        """
        if key in self.dic:
            self.remove(self.dic[key])
        n=Node(key,value)
        self.add(n)
        self.dic[key]=n
        #check if the length over capacity. if true delete head one
        if self.num>self.capacity:
            n=self.head.nxt
            self.remove(n)
            del self.dic[n.key]
            
    def add(self,node):
        """
        :type node: Node
        """
        p=self.tail.pre
        p.nxt=node
        node.pre=p
        node.nxt=self.tail
        self.tail.pre=node
        self.num+=1
        
    def remove(self,node):
        """
        :type node: Node
        """
        p=node.pre
        n=node.nxt
        p.nxt=n
        n.pre=p
        self.num-=1