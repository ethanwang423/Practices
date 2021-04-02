import  sys
print("Test py")

if True:
    print("abc")
else:
    print("def")
    print("error")
a ,b ,c = 1,2,3
total = a \
    +b\
    +c
print(total)
#str = input("\n\nInput your sentence\n")
str = "Python 3.0"
print(str[2:5])
print(str[2:10:2])
#print twice
print(str * 2)
#print negative number
print(str[-1],str[-2])

#Isinstance
print(isinstance(a,int))

#List
list = [ 'abcd', 786 , 2.23, 'runoob', 70.2 ]
print(list[-1])
list.append("jun")
print(list)
#input words
inputwords = "a,b,c,d"

#tuple
tp =("my","name","is","Leo")
print(tp)

#set
sites = {'Google', 'Taobao', 'Runoob', 'Facebook', 'Zhihu', 'Baidu'}

#Dictionary
dict = {}
dict["one"] = "China"
dict["two"] =  "USA"

print(dict["one"])
print(dict["two"])

'''
Here are comments
'''
#
print(2**2)
print(9//2)
m,q,p = 2,3,0
m **= q
print(m)
print("My age is ",m)

a1 = 0o00111100
b1 = 0o00111100
print("x%",a1&b1)

#function
def compare():
    a = 20
    b = 10
    c = 15
    d = 5
    e = 0
    #do something
import  random
print(random.random())


def f1():
    a,b = 0,1
    while b < 1000:
        print(b,end=',')
        a,b = b ,a+b

f1()
if a > 0:
    print("\nON")

print(1 == 2)

a = 1;
b = 0;
while a <= 100:
    b += a
    a += 1

print("Sum value from 1 to 100 is ",b)

for val in sites:
    print(val + "-=-")

for i in range(5,10):
    print(i)
'''
while True:
    pass
print("pass")
'''

#iteration
lt = [1,2,3,4]
it = iter(lt)#the iteration object
while True:
    try:
        print(next(it))
    except StopIteration:
        print("No more iteration")
        break
       # sys.exit(0)


def printme(str = "Null input"):
    print(str)

printme()

def functionname(args1,*args2):
    print(args1)
    print(args2)
functionname("test",[1,2,3])

def functionmore(arg1,**arg2):
    print(arg1)
    print(arg2)
functionmore("test",a = 1,b = 2)


#Lambda functions
#lambda [arg1 [,arg2,.....argn]]:expression
sumlambda = lambda arg1, arg2 : arg1 + arg2

print("lambda sum 1 + 1 =",sumlambda(1,1))

knights = {'gallahad': 'the pure', 'robin': 'the brave'}
for i in knights.items():
    print(i)


class MyClass:
    m = 100
    def getNum(self):
        return self.m

mc = MyClass()
print("MyClass getNum:",mc.getNum())