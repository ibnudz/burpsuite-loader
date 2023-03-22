[
  {
    "enabled": true,
    "name": "Netsweeper_CodeInjection",
    "comments": "Try to detect Netsweeper panel and run python code injection vulnerability",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Netsweeper_Request",
      "true,And,Passive Response,Netsweeper_Response"
    ],
    "execute": [
      "true,Profile,CVE-2020-13167_Netsweeper_code_injection,All Matches"
    ]
  }
]