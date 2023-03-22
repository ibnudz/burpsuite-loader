[
  {
    "enabled": true,
    "name": "Solarwinds",
    "comments": "This profile tries to search Solarwind orion page and login as default admin",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Solarwinds_Orion_Request",
      "true,Or,Passive Response,Solarwinds_Orion_Response"
    ],
    "execute": [
      "true,Profile,Solarwinds_default_admin,All Matches"
    ]
  }
]