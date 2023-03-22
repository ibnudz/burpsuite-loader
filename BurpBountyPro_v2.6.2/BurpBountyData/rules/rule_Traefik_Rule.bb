[
  {
    "enabled": true,
    "name": "Traefik_Rule",
    "comments": "Try to detect Traefik Panel and runs CVE-2020-15129",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Response,Traefik_Response"
    ],
    "execute": [
      "true,Profile,CVE-2020-15129_Traefik_Open_Redirect,All Matches"
    ]
  }
]