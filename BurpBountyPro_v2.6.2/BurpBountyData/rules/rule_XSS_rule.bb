[
  {
    "enabled": true,
    "name": "XSS_Rule",
    "comments": "This rule searches the request for typical parameters of XSS vulnerabilities, and if it finds them, it executes the active profiles in search of these vulnerabilities.",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,XSS_Parameters"
    ],
    "execute": [
      "true,Profile,XSS,All Matches",
      "true,Profile,XSS_UrlEncode,All Matches",
      "true,Profile,XSS_Akamai_GHost_bypass,All Matches",
      "true,Profile,XSS_HtmlUrlEncode,All Matches",
      "true,Profile,Blind_XSS_append,All Matches",
      "true,Profile,Blind_XSS_replace,All Matches",
      "true,Profile,Test_XSS_append,All Matches",
      "true,Profile,Test_XSS_append_encoded,All Matches",
      "true,Profile,Test_XSS_GET_POST,All Matches"
    ]
  }
]