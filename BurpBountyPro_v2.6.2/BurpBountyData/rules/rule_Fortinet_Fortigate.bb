[
  {
    "enabled": true,
    "name": "Fortinet_Fortigate",
    "comments": "Try to detect Fortinet Panel and runs CVE-2018-13379",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Fortinet_Request",
      "true,And,Passive Response,Fortinet_Panel"
    ],
    "execute": [
      "true,Profile,CVE-2018-13379_FortiOS_Creds_Disclosure,All Matches"
    ]
  }
]