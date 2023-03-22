[
  {
    "enabled": true,
    "name": "MAGMI_Remote_Auth",
    "comments": "Search for MAGMI (Magento Mass Importer) Plugin and try to bypass authentication",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,MAGMI_Request",
      "true,Or,Passive Response,MAGMI_Response"
    ],
    "execute": [
      "true,Profile,CVE-2020-5777_MAMGI_Auth_Bypass,All Matches"
    ]
  }
]