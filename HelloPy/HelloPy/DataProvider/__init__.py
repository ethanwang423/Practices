import os


class FileManger:
    file_name = ""
    def setFilePath(self,filename):
        self.file_name = filename
    def readFileContent(self):
        self.file_name
        if len(self.file_name) == 0:
            print("Error!Please set the filename before reading")
        elif not os.path.isfile(self.file_name):
            print("File %s not exist"%(self.file_name))
        else:
            print("Try to read file:",self.file_name)
            try:
                file =  open(self.file_name,mode='r')
                for line in file.readlines():
                    print(line)
            except:
                print("Reada file failed")
            finally:
                #print("File closed")
                file.close()
