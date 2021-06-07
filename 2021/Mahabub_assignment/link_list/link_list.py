import ctypes

linklist = ctypes.CDLL("linklist.so")


linklist.insert(int(1),str("raan"),int( 2))
linklist.insert(2,"raan",2)
linklist.insert(3,"raan",2)
linklist.display()
