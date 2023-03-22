[
  {
    "enabled": true,
    "name": "SpringBoot_Rule",
    "comments": "Detects Springboot service and try to access sensitive endpoints",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Springboot_Requests"
    ],
    "execute": [
      "true,Profile,Spring_Boot_Jolokia_XXE,All Matches",
      "true,Profile,Spring Boot Actuators,All Matches"
    ]
  }
]