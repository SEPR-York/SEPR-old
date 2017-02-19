#Gandhi-Inc. SEPR
Team: [Will](https://github.com/will6767), [Luke](https://github.com/lrj509), [Steven](https://github.com/smt529), [Robert](https://github.com/ras570), [Pedro](https://github.com/Wigder).

Development Build Status: [![Build Status](https://travis-ci.org/SEPR-York/SEPR.svg?branch=development)](https://travis-ci.org/SEPR-York/SEPR)


## Using our project
- Our project utilises Gradle, we highly recommend using IntelliJ IDEA as your IDE as we've already set up all the Run Configrations you'll need for it
- To load the project ensure you have gradle installed, and when prompted by IDEA to import a new project, navigate to the build.gradle in the main directory and import all gradle builds when selected.
- If you have any issues drop one of us a message and we should be able to help out.

---

## Build System Guide

1. We will be working in groups (of 2 or 3 people) on a specific feature at a time
2. You make changes to the code and commit these locally to your repository.
3. Once you have some working code, commit it to the remote repository (Using the sync button on desktop for instance).
	* Make sure you're working in the branch created for developing that feature!
	* After you commit to the remote repository it'll trigger Travis to start compiling and testing the build
	* If the build fails at this point go back to step 2 until it passes this point.
	* If your build passes this point, check (preferably with someone) that the tests you have written in *SEPR/tests/src/* are valid and test the feature fully.
4. If we're at this point we're really cooking with gas and if you or your sub-team are happy with the feature, submit a pull request to the development branch from your feature branch.
	* Travis will then check if these two branches are compatible as-is. 
	* If this passes, someone outside of your team, typically Jack or myself will confirm the merge.
	* If this fails return to step 2 and fix any issues raised. Or bring it up with the team at the next meeting or on the slack if you believe the conflict can be resolved.
5. Once everything we need for the assesment has been brought into Development and is working 100%, either Jack or I will merge it into the master.

## Summary
### Development
This is are only branch
