[{
  "enabled": false,
  "name": "Scan all requests with log4shell profiles",
  "comments": "This rule scans all HTTP requests with all Log4shell profiles.",
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
    "true,Profile,CVE-2021-44228_RCE_Log4j,All Matches",
    "true,Profile,CVE-2021-44228_RCE_Log4j_GETPOST,All Matches",
    "true,Profile,CVE-2021-44228_RCE_Log4j_urlEncode,All Matches"
  ]
}]