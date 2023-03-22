[
  {
    "enabled": true,
    "name": "Drupal_Rule",
    "comments": "This rule, try to detect Drupal and execute common vulnerabilities in this framework",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Response,Drupal_Response"
    ],
    "execute": [
      "true,Profile,Drupal_User_Enum,All Matches",
      "true,Profile,Drupal_User_Enum_Redirect,All Matches"
    ]
  }
]