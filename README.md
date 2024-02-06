If you want to try the game you have to use a IDE like Visual Studio Code, Eclipse or any other from the same style to compile it.
I didn't upload a executable because it can make users think it could be a virus or some malicious code.


To execute the game you have three choices:
  
  1. USING IDEs 
          
          Personally this is the option I recomend the most because is the easiest one.
          Create a project in your favourite IDE and import all java classes uploaded in the git-repository,then open the project in a IDE and run SnakeGame.java

  2. Compiling and running the project in your computer 
   
          For this option is necesary to have installed in your system a JDK version, i recomend to use the latest or a higher or equal version to the jdk-17.0.2+8 because is the one I used and I don't know if it will work for an older version of java.
          Open a terminal in the folder where all the Java files are located and execute the following comands:
              1. javac *.java
              2. java SnakeGame
          
  3. Making a executable file 

          This option is the most comfortable for the future because you'll only need to click in a 'executable' file and the game will run perfectly.
          It is necessary to follow the same steps and recomendations of the previous option except the last step (2).
          Open a text editor and type the next code:
     
          - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -      
          cd PATH WHERE ALL THE JAVA FILES ARE LOCATED
          java SnakeGame
          - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     
          Save this code and put it the name you prefer to identify the executable file.
          You can add a .bash (Linux) or a .batch (Windows) extension to the executable file, depending on wich operative system you have installed. 
