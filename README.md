# Authentication
Service to manage user authentication.

## Features
 - Register users /api/v1/auth/sign-up
 - Authenticate users  /api/v1/auth/sign-in

## Proposed features
 - Ability to assign roles to users.

## Your task
  - Extended the current implementation such that a user can now be assigned roles (could be or more)
  - Proposed role [SYSTEM_ADMIN, MANAGER, SUPERVISOR, TRAINEE, JUNIOR STUFF]
  - Add a new endpoint /api/v1/users that will return all the users in the dabase.  
