import numpy as np
import matplotlib.pyplot as plt
Theta1=[]
Theta2=[]
def Intensity1(theta1):
    a = 9e-05                     #slit width
    lamda = float(670)* 1e-09     #wavelength
    L = float(480)* 1e-03
    alpha = ((np.pi * a) / lamda) * np.sin(theta1)
    result= (np.sin(alpha) / alpha  )**2
    U1=1e03*np.tan(Theta1)*np.array(L)

def Intensity2(theta2):
    a = 9e-05                     #slit width
    lamda = float(670)* 1e-09     #wavelength
    L = float(480)* 1e-03
    d = 4e-04
    alpha = ((np.pi * a) / lamda) * np.sin(theta2)
    beta = ((np.pi * d) / lamda) * np.sin(theta2)
    result= 4 * (np.sin(alpha) / alpha)**2 * (np.cos(beta))**2
    U2=1e03*np.tan(Theta2)*np.array(L)


x_max = 8
y_max = 1

x3 = np.linspace(-x_max, x_max, 3000)
y3 = np.linspace(-y_max, y_max, 3000)
X, Y = np.meshgrid(x3, y3)

fig = plt.figure(figsize=(10, 6))

z = Intensity2(X)
s = Intensity1(X)

plt.imshow(z, extent = [-x_max, x_max, -y_max, y_max], cmap = 'gray', interpolation = 'bilinear', aspect = 'auto')

plt.show()