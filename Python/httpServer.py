from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer

class webserverHandler(BaseHTTPRequestHandler):
	#the do_GET function handles all get requests the server received
	def do_GET(self):
		try:
			if self.path.endswith("/hello"):
				self.send_response(200)
				self.send_header('Content-type', 'text/html')
				self.end_headers()

				output = ""
				output +="<html><body>hello! the first web server test</body></html>"
				self.wfile.write(output)
				print output
		except IOError:
			self.send_error(404,"File not Found %s" % self.path)

def main():
	try:
		port = 8080
		server = HTTPServer(('',port),webserverHandler)
		print "Web server runing on port %s" %port
		server.serve_forever()
		
	except KeyboardInterrupt:
		print "^C entered, stopping web server....."
		server.socket.close()

if __name__ == '__main__':
 	main() 