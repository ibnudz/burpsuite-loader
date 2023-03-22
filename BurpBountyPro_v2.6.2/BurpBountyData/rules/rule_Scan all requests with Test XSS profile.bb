[{
  "enabled": false,
  "name": "Scan all requests with Test XSS profile",
  "comments": "This rule scans all HTTP requests with Test XSS profile.",
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
    "true,Profile,Test_XSS_append,All Matches"
  ]
}]