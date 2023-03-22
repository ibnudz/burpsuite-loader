[
  {
    "enabled": true,
    "name": "Artica_Web_Proxy_Auth_bypass",
    "comments": "Detects Artica Web Proxy portal and try to bypass authentication",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Artica_Web_Request",
      "true,And,Passive Response,Artica_Web"
    ],
    "execute": [
      "true,Profile,CVE-2020-17506_Artica_Web_Proxy_Auth_Bypass,All Matches"
    ]
  }
]