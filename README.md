# Micronaut data issue 

https://github.com/micronaut-projects/micronaut-data/issues/1282

A property that is annotated with `@DateCreated` and defined in an abstract base class in a library / dependency won't 
be populated.
If the abstract base class is in the same project it works as expected. 

Run the tests to reproduce. 