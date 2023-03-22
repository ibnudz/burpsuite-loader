[
  {
    "enabled": true,
    "name": "Firebase Database Rule",
    "comments": "This rule try to detect *.firebaseio.com host and test to Open Firebase Database vulnerability",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,Firebase DB detected"
    ],
    "execute": [
      "true,Profile,Open Firebase Database,First Match"
    ]
  }
]