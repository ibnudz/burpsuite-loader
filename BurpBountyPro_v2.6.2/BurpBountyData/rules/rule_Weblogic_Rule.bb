[
  {
    "enabled": true,
    "name": "Weblogic_Rule",
    "comments": "Search for Weblogic software and launch attacks",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Weblogic_Request"
    ],
    "execute": [
      "true,Profile,Oracle_WebLogic_RCE_CVE-2020-2551,All Matches"
    ]
  }
]