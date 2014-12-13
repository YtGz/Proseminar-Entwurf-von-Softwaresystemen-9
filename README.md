Continuous Integration
=========================================

What?
-------

Continuous Integration (also referred to as CI), which originates from the early days  
of extreme programming, describes the process of integrating new code several times  
a day to avoid slow-downs and hassles which would occur when integrating in a larger  
time interval. Usually each developer of a team is required to integrate at least  
once a day. Integration is based on (fast) automatic builds generated on a dedicated  
 CI server. Tests are preferably done utilizing a copy of the production environment.
 

Why?
-------

	* No fear of integration, as it is fast and part of the daily routine
	* Easy to track bugs introduced by a new commit
	* The test deployment can be used for demos
	
	
Why not?
--------

	* Too time consuming / expensive for really small programs/tools, which may even
	  not be needed any more after usage 
	* If builds/tests are *very* slow and cannot be done faster


How?
-------

	* Make use of a VCS
	* Use a single repository
	* Automatic builds and tests (e.g. Gradle)
	* *Every* build shall be tested
	* Fast builds
	* Test in a copy of the production environment