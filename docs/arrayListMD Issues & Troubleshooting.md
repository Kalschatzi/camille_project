<h2>Overview</h2>

This document explores the issue that arose or working through suggestions from code reviews during the creation of the ArrayList mark-down.  It also serves as a reminder for me if any of these issues arise in future MDs.


<h3>**Authenticating to GitHub using SSH Keys**</h3>


An early issue in creating the Arraylist MD was an authentication error which resulted in being unable to push my code to GitHub. GitHub deprecated authentication using username/password in 2021 however, I'd only realised that in 2025! I resolved this my generating SSH keys in my local server using: 
```bash
ssh-keygen 
```
This generates and public and private key pair.  The public key will be stored in your /home/file-path/.ssh/id_ and the private can be saved in a location of your choice.  It's a good security recommendation to use a password when generating ssh keys, however, it's not essential.<br>
Log into GitHub --> Settings-->SSH and GPG keys-->, then copy and paste the ssh *public key* into the space provided.  It should then allow the pushing and pulling of code as long as you have the permissions to do so in that repository.




<h3>**Creating a code block**</h3>

To create a code block within a mark-down use three back ticks and write the language of the code block on the same line. Press 'enter' and on the line below, write your code-see below example.

<```> [name of programming language]

Code on the line below

<```>


```java 
class Scratch {
    public static void main(String[] args) {

    }
}


```


<h3>**Markdown Formatting**</h3>

For markdown troubleshooting, I used this **[Markdown Guide](https://www.markdownguide.org/cheat-sheet/)**
Linking the ArrayList.md from the project README.md
To add a link to any mark-down, wrap the link text in an asterisk and brackets *[insert the name of that you wish to be used as a link]*