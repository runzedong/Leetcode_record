def consumer():
	r=''
	while True:
		n = yield r
		if not n:
			return
		print('[CONSUMER] Consuming %s...'%n)
		r = '200 OK'

def producer(c):
	c.send(None)
	n=0
	while n<5:
		n+=1
		print('[PRODUCER] Producing %s...'%n)
		r = c.send(n)
		print('time going')
		print('time going')
		print('time going')
		print('time going')
		print('[PRODUCER] Consumer return: %s'%r)
	c.close()

c = consumer()
producer(c) 