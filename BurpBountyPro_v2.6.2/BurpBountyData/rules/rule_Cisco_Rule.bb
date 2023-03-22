[
  {
    "enabled": true,
    "name": "Cisco_Rule",
    "comments": "Search for Citrix software and launch attacks",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Response,Cisco_ASA_Device_Found",
      "true,Or,Passive Request,Cisco_Request_Detected"
    ],
    "execute": [
      "true,Profile,CVE-2020-3452_Cisco_ASA_LFI,All Matches",
      "true,Profile,CVE-2019-1653_Cisco_Wan_VPN_disclosure,All Matches"
    ]
  }
]