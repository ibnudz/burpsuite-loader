[{
  "enabled": false,
  "name": "Scan all requests with all Profiles",
  "comments": "This rule scans all HTTP requests with all profiles. This rule is very dangerous as it can consume a lot of RAM and CPU resources.",
  "scope": 0,
  "match_enabled": false,
  "operator": "",
  "profile_type": "",
  "passive_profile_type": "",
  "exec_enabled": false,
  "type": "",
  "active_profile_type": "",
  "match": [
    "true,,Passive Request,All_Requests_And_Parameters"
  ],
  "execute": [
    "true,Tag,All,All Matches"
  ]
}]