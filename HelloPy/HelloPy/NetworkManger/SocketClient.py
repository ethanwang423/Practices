import socket

class SocketClient:
    def setClient(self):
        print("Starting to get data from server")
        client = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
        host = socket.gethostname()
        port = 8081
        client.connect((host,port))
        msg = client.recv(1024)
        client.close()
        print(msg.decode('utf-8'))

#Test
'''
client = SocketClient()
client.setClient()
'''