Maven local repository resides in the local machine. Maven downloads the dependencies and store it in the local repository. So, you do not need to download the dependencies again and again.

Also central local repository ensures that all the projects can use the local repository, so we don't need to store seperate dependencies for each project. 

Also, the maven project after install gets stored in the .m2 local repository as a jar file which can be later used as an plugin to other projects.