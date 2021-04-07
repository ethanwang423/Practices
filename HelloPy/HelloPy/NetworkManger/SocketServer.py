import socket

class SocketServer:
    def setServer(self):
        print("Start to set server on localhost:80....")
        server = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
        host = socket.gethostname()
        port = 8081
        server.bind((host,port))
        server.listen(10)
        while True:
            clientsocket,addr = server.accept()
            msg = "OK"
            clientsocket.send(
                msg.encode("utf-8")
            )
            clientsocket.close()

#Test part
server = SocketServer()
server.setServer()