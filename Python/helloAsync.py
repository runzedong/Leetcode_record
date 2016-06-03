import asyncio

@asyncio.coroutine
def hello():
	print('hello world!')
	r = yield from asyncio.sleep(7)
	print('hello continue....')
	print('hello continue....')
	print('hello continue....')
	print('hello continue....')
	print('hello continue....')
	print('hello continue....')
	print('hello continue....')

loop = asyncio.get_event_loop()
loop.run_until_complete(hello())
loop.close()