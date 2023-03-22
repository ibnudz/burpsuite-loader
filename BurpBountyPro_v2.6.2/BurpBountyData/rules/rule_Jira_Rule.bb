[
  {
    "enabled": true,
    "name": "Jira_Rule",
    "comments": "Search for Jira panels and try to exploit vulnerabilites",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Jira_Request"
    ],
    "execute": [
      "true,Profile,CVE-2020-14179_Jira_Info_Exposure,All Matches",
      "true,Profile,CVE-2020-14181_Jira_User_Enum,All Matches",
      "true,Profile,CVE-2017-9506_Jira_SSRF,All Matches",
      "true,Profile,CVE-2019-8442_Jira_Path_Traversal,All Matches",
      "true,Profile,CVE-2019-8449_Jira_Unauthenticated_Sensitive_Info,All Matches",
      "true,Profile,Jira_unauthenticated_Info,All Matches"
    ]
  }
]