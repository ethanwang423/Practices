import DataProvider
import SystemFunction
import NetworkManger

print("Start main process....")
'''
mysys = SystemFunction.SystemHelper()
mysys.getHelpList()

data_provider = DataProvider.FileManger()
data_provider.setFilePath(input("Please enter the file name:\n"))
data_provider.readFileContent()
'''
#set socket client
s_client = NetworkManger.SocketClient()
s_client.setClient()