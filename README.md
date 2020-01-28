# Git-Exercise2
**Instructions**

*The sample/example for these steps is ExJessieJames.java with the respective additional code in Main*
1. Begin by cloning this repository to your desktop, if you would like to try doing this through your command line please try that, but otherwise do this however you'd like. 
2. Find the .java file that has you and your homework member's name, this is where you will put steps 4 and .
3. Have one team member create a new branch, such as the example below, then 'checkout' to that branch. Have your partner checkout to the same branch.
```
git branch JessieJames
git checkout JessieJames
```
4. Individually, write 2 simple methods, they don't have to do anything in particular (refer to example file). Do NOT spend a lot of time on this step, this is just to give us some stuff we can get a merge conflict out of. You and your partner should be occupying the same lines in the file.
5. Add and commit the file you are currently working on, then pull the latest version. If you are the first person to finish, then likely nothing will happen. If you are the second, and your partner has pushed their work, you will likely have a merge conflict. 
6. Sort out the merge conflict so that both you and your partners work are in the file. Refer to [this page](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts) for more info on how to do this
7. Once your group has sorted out the merge conflict, work together to make a third method that will return some string for your team, such as jessieJamesMethod in the example. Work out any merge conflicts you encounter if you decide to both write at the same time. 
8. Initiate an instance of your class in main, as shown in the example.
9. Stage and commit your latest changes, and your branch should now be ready to be merged with the master.
10. Merge your group's branch with the master. Start by checking out to the master, then merge your branch to it. 
```
git checkout master
git merge JessieJames
```
11. Unless you are the first team, this should result in another merge conflict in the main file, sort this out in the same way as previously. More info [here](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging)
