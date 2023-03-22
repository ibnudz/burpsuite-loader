[
  {
    "enabled": true,
    "name": "Citrix_Rule",
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
      "true,,Passive Response,Citrix_Detection"
    ],
    "execute": [
      "true,Profile,CVE-2019-19781_Citrix_ADC_Directory_Traversal,All Matches",
      "true,Profile,CVE-2020-8209_Citrix_XenMobile_PathTraversal,All Matches",
      "true,Profile,CVE-2020-8982_Citrix_ShareFile_File_Read,All Matches"
    ]
  }
]