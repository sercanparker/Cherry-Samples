@tag
Feature: Register
  Scenario Outline: Register Scenario
    Given @PAGE SignedOutFragmentActivity  is $OPENED
    And @BUTTON sign_up_with_email_or_phone is $CLICKED
    And @BUTTON right_tab is $CLICKED
    When <email> is $ENTERED on @EDIT_TEXT email_field
    And @BUTTON button_text is $CLICKED
    Then @TEXT_VIEW code_verification_instruction is $SHOWN 

    Examples:
      | email | 
      | "foosercanparker@yopmail.com" | 
      