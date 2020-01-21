import math
import turtle

bob = turtle.Turtle()

def square(t, length):
    for i in range(4):
        t.fd(length)
        t.lt(90)

def polyline(t, n, length, angle):
    for i in range(n):
        t.fd(length)
        t.lt(angle)

'''
_old polygon here_

def polygon(t, n, length)
    angle = 360 / n
    for i in range(n)
        t.fd(length)
        t.lt(angle)
'''

def polygon(t, n, length):
    angle = 360/n
    polyline(t, n, length, angle)

def arc(t, r, angle):
    arc_length = 2 * math.pi * r * angle / 360
    n = int(arc_length / 3) + 1
    step_length = arc_length / n
    step_angle = angle / n
    polyline(t, n, step_length, step_angle)

'''
_old circle here_

def circle(t, r)
    circumference = 2 * math.pi * r
    n = int(circumference / 3) + 3
    length = circumference / n
    polygon(t, n, length)
'''

def circle(t, r):
    arc(t, r, 360)

polygon(bob, 5, 50)
turtle.mainloop
