# OOP Fundementals in Java - Lab Task 1

Objective: Write a demonstrative code to show the fundementals of OOP in Java.

We have 5 main fundemental OOP concepts; they are:

1. Modularity
2. Inheritance
3. Polymorphism
4. Encapsulation
5. Abstraction

All the following examples I will provide will be available in the code in the repository.  

- Modularity - 
  It is simply taking multiple modules or instances of a class, and we call it an object.
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/816eb003-3666-4e9e-a3cd-3a9ae3ecf608)
  

- Encapsulation -
  It is when you have a public, a private, or a protected variable/function/class/etc.
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/8fb680a8-4222-405b-a77f-7dc2d77c5d94)
  
   
- Inheritance -
  It is where a class inherits another class to use all of their public or protected data and use it or override it. 
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/ff78ce14-efea-421d-b1a5-c767cae333b0)
  

- Polymorphism -
  It is when something with the same name has multiple meanings, i.e a function that shares the same name with another function.
  
  (example 1)  
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/48f1d94b-f00b-48fc-ab13-939c9f9dade7)
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/b079fd1d-92c6-4f3d-a344-ae767781290b)
  (example 2 with Override)  
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/06adaa3c-bb0e-4573-b8a8-4e7eec2d48fc)
  
  We can use *@Override* to override the *super* (original) function to edit it however we want in our inherited class.
  

- Abstraction -
  It is used when you have a class or a function you don't need to make an instance of, and can have other uses like *another class inheriting it and using its functions.*

  e.g  
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/3d02fb2b-3616-4b82-9f54-ca512b1a745d)
  ![image](https://github.com/Shiro995/LabTask1/assets/72838778/7bb47a98-ec9c-4b6b-954b-a7b500f78337)
  
  We initialize *greetings()* in the previous previous point about Polymorphism, by overriding an *abstract* function.
  
  Why was it originally an abstract function? Because class Human doesn't want to use the *greetings()* function but wants to enforce *child* classes to use it.

   


  
