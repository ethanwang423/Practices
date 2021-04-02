#Network compents
#import SocketsManager
import socket

class NetworkManager:
    network_name = ""
    def setNetworkName(self,name):
        self.network_name = name



class SocketClient:
    def setClient(self):
        client = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
        host = "localhost"
        port = 80
        client.connect((host,port))
        msg = client.recv(1024)
        client.close()
        print(msg.decode('utf-8'))
