Feature: Role Creation

Scenario Outline: Role creation with multiple data

Given Tester on Ranford Home page

When Tester enters Uname and Password

Then Tester clicks on Role Button

When Tester click on New Role and enter "<RoleName>" and "<RoleType>" 

Then Tester close the application


Examples:

      | RoleName | RoleType |
      | Testerdfd | E |
      | cashierdfd | E |
      | pofd | E |