[
  {
    "enabled": true,
    "name": "Symfony_Rule",
    "comments": "Try to detect symfony website and access debug pages",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Response,Symfony_Response"
    ],
    "execute": [
      "true,Profile,Symfony_Debug,All Matches"
    ]
  }
]