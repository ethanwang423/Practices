print("Ths is System package")
import io

class SystemManger:
    file_name = ""
    def setFilePath(self,filename):
        self.file_name = filename

class SystemHelper:
    def getHelpList(self):
        dic = {"1":"choose a file location","2":"set file name","3":"more help"}
        for msg in dic.items():
            print(msg)